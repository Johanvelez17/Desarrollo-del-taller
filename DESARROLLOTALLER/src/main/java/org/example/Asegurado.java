package org.example;

import java.time.LocalDate;

public class Asegurado {

    private Long id;
    private String numeroDocumento;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String niveldeEducacion;
    private String ocupacion;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private String numeroPoliza;
    private LocalDate fechaInicioVigencia;
    private LocalDate fechaFinVigencia;
    private Double primaAnual;

    public Asegurado() {
    }

    public Asegurado(Long id, String numeroDocumento, String nombre, String apellido, String estadoCivil, String niveldeEducacion, String ocupacion, LocalDate fechaNacimiento, String direccion, String telefono, String email, String numeroPoliza, LocalDate fechaInicioVigencia, LocalDate fechaFinVigencia, Double primaAnual) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.niveldeEducacion = niveldeEducacion;
        this.ocupacion = ocupacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.primaAnual = primaAnual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNiveldeEducacion() {
        return niveldeEducacion;
    }

    public void setNiveldeEducacion(String niveldeEducacion) {
        this.niveldeEducacion = niveldeEducacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDate fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Double getPrimaAnual() {
        return primaAnual;
    }

    public void setPrimaAnual(Double primaAnual) {
        this.primaAnual = primaAnual;
    }
}
