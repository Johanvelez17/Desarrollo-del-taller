package org.example;

public class Asesor {

    private Long idAsesor;
    private String nombre;
    private String apellido;
    private String numLicencia;
    private Integer aniosExperiencia;
    private String tituloAcademico;
    private String institucionAcademica;
    private String correoElectronico;
    private String telefono;
    private String numRUT;

    public Asesor() {
    }

    public Asesor(Long idAsesor, String nombre, String apellido, String numLicencia, Integer aniosExperiencia, String tituloAcademico, String institucionAcademica, String correoElectronico, String telefono, String numRUT) {
        this.idAsesor = idAsesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLicencia = numLicencia;
        this.aniosExperiencia = aniosExperiencia;
        this.tituloAcademico = tituloAcademico;
        this.institucionAcademica = institucionAcademica;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.numRUT = numRUT;
    }

    public Long getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Long idAsesor) {
        this.idAsesor = idAsesor;
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

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getInstitucionAcademica() {
        return institucionAcademica;
    }

    public void setInstitucionAcademica(String institucionAcademica) {
        this.institucionAcademica = institucionAcademica;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumRUT() {
        return numRUT;
    }

    public void setNumRUT(String numRUT) {
        this.numRUT = numRUT;
    }
}
