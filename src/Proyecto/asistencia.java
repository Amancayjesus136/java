package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

public class asistencia {

    private int idasistencia;
    private int idclas;

    public int getIdasistencia() {
        return idasistencia;
    }

    public void setIdasistencia(int idasistencia) {
        this.idasistencia = idasistencia;
    }

    public int getIdclas() {
        return idclas;
    }

    public void setIdclas(int idclas) {
        this.idclas = idclas;
    }

    public int getIddetalleclase() {
        return iddetalleclase;
    }

    public void setIddetalleclase(int iddetalleclase) {
        this.iddetalleclase = iddetalleclase;
    }

    public LocalDate getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public LocalTime getHoraingreso() {
        return horaingreso;
    }

    public void setHoraingreso(LocalTime horaingreso) {
        this.horaingreso = horaingreso;
    }

    public int getIdtipoasistencia() {
        return idtipoasistencia;
    }

    public void setIdtipoasistencia(int idtipoasistencia) {
        this.idtipoasistencia = idtipoasistencia;
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

    private int iddetalleclase;
    private LocalDate fechaingreso;
    private LocalTime horaingreso;
    private int idtipoasistencia;
    private  int usuario_crea;
    private int usuario_modi;
    private LocalDate fechacrea;
    private LocalDate fechamodi;
    private String pccrea;
    private String pcmodi;



}
