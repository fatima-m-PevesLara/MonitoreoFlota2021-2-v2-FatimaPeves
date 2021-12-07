package monitoreo.modelos;

import monitoreo.modelos.impl.PuntoMonitoreoBuilder;
import monitoreo.modelos.impl.*;

public class FacadePuntoMonitoreo {
    
    public Punto construirPuntoMonitoreo(String descPunto, Double latitud, Double longitud, int color, int tam){
        PuntoMonitoreoBuilder puntoBuilder = new PuntoMonitoreoBuilder(descPunto);
        puntoBuilder.withSimbolo(SimpleMarkerSymbol.Style.DIAMOND, color, tam);
        puntoBuilder.withUbicacion(latitud, longitud);
        Punto punto = puntoBuilder.build();
        return punto;
    } 
    
}
