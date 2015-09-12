package com.jsadevtech.vgc.servicetest;

/**
 * Created by shirkam on 11/06/2015.
 */
public class CouldNotConvertFormatException extends Exception
{
    public CouldNotConvertFormatException()
    {}

    public String getMessage()
    { return "ERROR: No ha sido posible convertir los datos"; }
}
