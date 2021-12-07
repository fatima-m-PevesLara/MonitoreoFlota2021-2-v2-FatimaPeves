package monitoreo.modelos.interfaces;

import com.esri.arcgisruntime.mapping.ArcGISMap;

public interface IMapaBase {
 
    public ArcGISMap getMapaBase();
    public Viewpoint getViewpoint(double x, double y, int escala);
}
