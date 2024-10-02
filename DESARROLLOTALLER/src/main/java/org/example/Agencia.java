package org.example;



public class Agencia {

    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String numLicencia;
    private String tipoAgencia;
    private Integer numEmpleados;
    private String horarioAtencion;
    private String ubicacionGeografica;

    public Agencia() {
    }

    public Agencia(String nit, String nombre, String direccion, String telefono, String correoElectronico, String numLicencia, String tipoAgencia, Integer numEmpleados, String horarioAtencion, String ubicacionGeografica) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.numLicencia = numLicencia;
        this.tipoAgencia = tipoAgencia;
        this.numEmpleados = numEmpleados;
        this.horarioAtencion = horarioAtencion;
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getTipoAgencia() {
        return tipoAgencia;
    }

    public void setTipoAgencia(String tipoAgencia) {
        this.tipoAgencia = tipoAgencia;
    }

    public Integer getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(Integer numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }
}
