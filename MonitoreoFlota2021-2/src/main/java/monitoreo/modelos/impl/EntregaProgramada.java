package monitoreo.modelos.impl;

import monitoreo.modelos.interfaces.IEntrega;

public class EntregaProgramada implements IEntrega {

    protected String rangoHora;
    protected String fecha;
    protected Double costo = 50.90;

    public EntregaProgramada(String rangoHora, String fecha)  {

        this.rangoHora = rangoHora;
        this.fecha = fecha;
    }

    @Override
    public void listarEntrega() {

        System.out.println("[Entrega Programada] Entrega planificada: " + this.fecha + " - " + this.rangoHora );
    }

    @Override
    public Double calcularCosto() {

        return this.costo;
    }
}
