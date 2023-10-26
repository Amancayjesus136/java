package Proyecto;

import java.time.LocalDate;

public class curso {

    public int getIdcruso() {
        return idcruso;
    }

    public void setIdcruso(int idcruso) {
        this.idcruso = idcruso;
    }

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

    public LocalDate getFechacrea() {
        return fechacrea;
    }

    public void setFechacrea(LocalDate fechacrea) {
        this.fechacrea = fechacrea;
    }

    public LocalDate getFechamodi() {
        return fechamodi;
    }

    public void setFechamodi(LocalDate fechamodi) {
        this.fechamodi = fechamodi;
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

    private int idcruso;
    private int idcarrera;
    private String descripcion;
    private int usuario_crea;
    private int usuario_modi;
    private LocalDate fechacrea;
    private LocalDate fechamodi;
    private String pccrea;
    private String pcmodi;
}
