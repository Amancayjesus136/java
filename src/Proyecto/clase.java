package Proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

public class clase {

    private int iclase;
    private int idcarrera;

    public int getIclase() {
        return iclase;
    }

    public void setIclase(int iclase) {
        this.iclase = iclase;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public LocalTime getHoraini() {
        return horaini;
    }

    public void setHoraini(LocalTime horaini) {
        this.horaini = horaini;
    }

    public LocalTime getHorafin() {
        return horafin;
    }

    public void setHorafin(LocalTime horafin) {
        this.horafin = horafin;
    }

    public int getCantidadhora() {
        return cantidadhora;
    }

    public void setCantidadhora(int cantidadhora) {
        this.cantidadhora = cantidadhora;
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

    private int idcurso;
    private int idprofesor;
    private String nombre;
    private String dia;
    private LocalTime horaini;
    private LocalTime horafin;
    private int cantidadhora;
    private int usuario_crea;
    private int usuario_modi;
    private LocalDate fechacrea;
    private LocalDate fechamodi;
    private String pccrea;
    private String pcmodi;

}
