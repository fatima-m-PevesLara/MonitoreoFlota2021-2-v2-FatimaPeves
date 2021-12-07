package monitoreo.modelos.impl;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;

import monitoreo.modelos.interfaces.IMapaBase;

public class MapaBase implements IMapaBase {

    private ArcGISMap mapa;

    public MapaBase(int tipo)   {

        creaMapa( tipo );
    }

    @Override
    public ArcGISMap getMapaBase() {

        return mapa;
    }

    @Override
    public Viewpoint getViewpoint(double x, double y, int escala) {
        
        Viewpoint viewpoint = new Viewpoint(x, y, escala);

        return viewpoint;
    }
    
    private void creaMapa(int tipo) {

        System.out.println("Creando el mapabase avanzado...");
        if (tipo == 1)  {
        
            mapa = new ArcGISMap(Basemap.Type.TOPOGRAPHIC, -12.05847, -77.08654, 10);
        }
        else if (tipo == 2) {
            mapa = new ArcGISMap(Basemap.Type.STREETS_NIGHT_VECTOR, -12.05847, -77.08654, 10);
        }
        else if (tipo == 3) {
            
            mapa = new ArcGISMap(Basemap.createImagery());
        }
    }
}
