package Proyecto;

import java.time.LocalDate;

public class carrera {

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUsuario_crea() {
        return usuario_crea;
    }

    public void setUsuario_crea(int usuario_crea) {
        this.usuario_crea = usuario_crea;
    }

    public int getUsuario_modi() {
        return usuario_modi;
    }

    public void setUsuario_modi(int usuario_modi) {
        this.usuario_modi = usuario_modi;
    }

    public LocalDate getFecha_crea() {
        return fecha_crea;
    }

    public void setFecha_crea(LocalDate fecha_crea) {
        this.fecha_crea = fecha_crea;
    }

    public LocalDate getFecha_modi() {
        return fecha_modi;
    }

    public void setFecha_modi(LocalDate fecha_modi) {
        this.fecha_modi = fecha_modi;
    }

    public String getPccrea() {
        return pccrea;
    }

    public void setPccrea(String pccrea) {
        this.pccrea = pccrea;
    }

    public String getPcmodi() {
        return pcmodi;
    }

    public void setPcmodi(String pcmodi) {
        this.pcmodi = pcmodi;
    }

    private int idcarrera;
    private String descripcion;
    private int usuario_crea;
    private int usuario_modi;
    private LocalDate fecha_crea;
    private LocalDate fecha_modi;
    private String pccrea;
    private String pcmodi;
}
