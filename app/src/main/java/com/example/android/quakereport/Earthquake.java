package com.example.android.quakereport;

/**
 * Created by LUPECASA on 26/11/2017.
 */
public class Earthquake {
    private String magnitud;

    private String lugar;

    private String fecha;

    /*
    * Create a new Earthquake object.
    * */
    public Earthquake(String vMagnitud, String vLugar, String vFecha)
    {
        magnitud = vMagnitud;
        lugar = vLugar;
        fecha = vFecha;
    }

    public String getMagnitud() {return magnitud; }

    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }
}
