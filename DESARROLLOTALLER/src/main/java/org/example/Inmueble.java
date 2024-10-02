package org.example;

public class Inmueble {

    private String direccion;
    private String tipoInmueble;
    private Double superficie;
    private Integer numHabitaciones;
    private Integer numBanos;
    private String estadoConservacion;
    private Double valorInmueble;
    private Integer anioConstruccion;
    private String serviciosIncluidos;
    private String ubicacionGeografica;

    public Inmueble() {
    }

    public Inmueble(String direccion, String tipoInmueble, Double superficie, Integer numHabitaciones, Integer numBanos, String estadoConservacion, Double valorInmueble, Integer anioConstruccion, String serviciosIncluidos, String ubicacionGeografica) {
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.estadoConservacion = estadoConservacion;
        this.valorInmueble = valorInmueble;
        this.anioConstruccion = anioConstruccion;
        this.serviciosIncluidos = serviciosIncluidos;
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(Integer numBanos) {
        this.numBanos = numBanos;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public Double getValorInmueble() {
        return valorInmueble;
    }

    public void setValorInmueble(Double valorInmueble) {
        this.valorInmueble = valorInmueble;
    }

    public Integer getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(Integer anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public String getServiciosIncluidos() {
        return serviciosIncluidos;
    }

    public void setServiciosIncluidos(String serviciosIncluidos) {
        this.serviciosIncluidos = serviciosIncluidos;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }
}
