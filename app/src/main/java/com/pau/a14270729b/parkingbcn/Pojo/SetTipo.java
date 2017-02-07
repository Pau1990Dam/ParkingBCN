package com.pau.a14270729b.parkingbcn.Pojo;

/**
 * Created by 14270729b on 07/02/17.
 */

public class SetTipo{

    private Tipo tipo;

    public SetTipo(String tipo){
        this.tipo = Tipo.valueOf(tipo);
    }

    public Tipo getTipo(){
        return tipo;
    }

}