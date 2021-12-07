package monitoreo.modelos.impl;

public class EntregaReprogramada extends EntregaProgramada{

    private Double costoAdicional = 10.00;

    public EntregaReprogramada(String rangoHora, String fecha) {
        super(rangoHora, fecha);
    }

    @Override
    public void listarEntrega() {

        System.out.println("[Entrega Reprogramada] Entrega planificada: " + fecha + " - " + rangoHora );
    }

    @Override
    public Double calcularCosto(){
        return costo + costoAdicional;
    }
    
}
