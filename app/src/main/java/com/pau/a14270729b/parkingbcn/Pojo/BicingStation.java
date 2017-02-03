package com.pau.a14270729b.parkingbcn.Pojo;

/**
 * Created by 14270729b on 03/02/17.
 */

public class BicingStation {

    private short id;
    private Tipo type;
    private double latitude;
    private double longitude;
    private String streetName;
    private short streetNumber;
    private short altitude;
    private short slots;
    private short bikes;
    private short   nearbyStations;
    private boolean status;

    public BicingStation(){}

    public BicingStation(short id, Tipo type, double latitude, double longitude, String streetName, short streetNumber, short altitude, short slots, short bikes, short nearbyStations, boolean status) {
        this.id = id;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.altitude = altitude;
        this.slots = slots;
        this.bikes = bikes;
        this.nearbyStations = nearbyStations;
        this.status = status;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Tipo getType() {
        return type;
    }

    public void setType(Tipo type) {
        this.type = type;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public short getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(short streetNumber) {
        this.streetNumber = streetNumber;
    }

    public short getAltitude() {
        return altitude;
    }

    public void setAltitude(short altitude) {
        this.altitude = altitude;
    }

    public short getSlots() {
        return slots;
    }

    public void setSlots(short slots) {
        this.slots = slots;
    }

    public short getBikes() {
        return bikes;
    }

    public void setBikes(short bikes) {
        this.bikes = bikes;
    }

    public short getNearbyStations() {
        return nearbyStations;
    }

    public void setNearbyStations(short nearbyStations) {
        this.nearbyStations = nearbyStations;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BicingStation{" +
                "id=" + id +
                ", type=" + type +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", altitude=" + altitude +
                ", slots=" + slots +
                ", bikes=" + bikes +
                ", nearbyStations=" + nearbyStations +
                ", status=" + status +
                '}';
    }
}

enum Tipo{
    BIKE, BIKEELECTRIC
}
/*
         "id":"496",
         "type":"BIKE-ELECTRIC",
         "latitude":"41.404871",
         "longitude":"2.175141",
         "streetName":"C\/ DE PROVEN\u00c7A",
         "streetNumber":"445",
         "altitude":"21",
         "slots":"16",
         "bikes":"8",
         "nearbyStations":"452, 475",
         "status":"OPN"
 */