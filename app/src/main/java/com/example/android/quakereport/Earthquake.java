package com.example.android.quakereport;

/**
 * Created by LUPECASA on 26/11/2017.
 */
public class Earthquake {
    private String tamanio;

    private String lugar;

    private String fecha;

    /*
    * Create a new Earthquake object.
    * */
    public Earthquake(String vTamanio, String vLugar, String vFecha)
    {
        tamanio = vTamanio;
        lugar = vLugar;
        fecha = vFecha;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }
}
