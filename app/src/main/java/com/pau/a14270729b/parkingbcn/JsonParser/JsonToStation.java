package com.pau.a14270729b.parkingbcn.JsonParser;

import android.net.Uri;

import com.pau.a14270729b.parkingbcn.HttpUtil.HttpUtils;
import com.pau.a14270729b.parkingbcn.Pojo.BicingStation;
import com.pau.a14270729b.parkingbcn.Pojo.SetTipo;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;



public class JsonToStation {

    private static final String BASE_URL= "wservice.viabicing.cat/v2/stations";

    public static ArrayList<BicingStation> getStations(){

        ArrayList <BicingStation> stations = new ArrayList<>();
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .build();

        String url = builtUri.toString();
        getJson(url, stations);

        return stations;
    }

    private static void getJson(String url, ArrayList<BicingStation> stations){

        try {
            String JsonResponse = HttpUtils.get(url);
            jsonParser(JsonResponse, stations);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private static void jsonParser(String jsonResponse, ArrayList<BicingStation> stations){

        short [] nearStations;

        try {
            JSONObject data = new JSONObject(jsonResponse);
            JSONArray jsonStations = data.getJSONArray("stations");

            for(int i=0; i < jsonStations.length();i++){
                BicingStation station = new BicingStation();
                JSONObject object = jsonStations.getJSONObject(i);

                station.setId(Short.parseShort(object.getString("name")));
                station.setType(new SetTipo(object.getString("type")).getTipo());
                station.setLatitude(Double.parseDouble(object.getString("latitude")));
                station.setLongitude(Double.parseDouble(object.getString("longitude")));
                station.setStreetName(object.getString("streetName"));
                station.setStreetNumber(Short.parseShort(object.getString("streetNumber")));
                station.setAltitude(Short.parseShort(object.getString("altitude")));
                station.setSlots(Short.parseShort(object.getString("slots")));
                station.setBikes(Short.parseShort(object.getString("bikes")));


                JSONArray nearbyStations = object.getJSONArray("nearbyStations");
                nearStations = new short[nearbyStations.length()];

                for(int j = 0; j < nearbyStations.length(); j++){
                    nearStations[j] = Short.parseShort(nearbyStations.getString(j));
                }

                station.setNearbyStations(nearStations);

               if(object.getString("status").equals("OPN")){
                    station.setStatus(true);
                }else
                    station.setStatus(false);


                stations.add(station);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
