package Proyecto;

import java.time.LocalDate;

public class Alumno {

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getPccrea() {
        return pccrea;
    }

    public void setPccrea(LocalDate pccrea) {
        this.pccrea = pccrea;
    }

    public LocalDate getPcmodi() {
        return pcmodi;
    }

    public void setPcmodi(LocalDate pcmodi) {
        this.pcmodi = pcmodi;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }

    // Este es un comentario de una sola línea en Java
    private int idalumno;
    private String nombre;
    private String apellido;
    private String direccion;
    private String documento;
    private String telefono;
    private String celular;
    private String email;
    private int usuario_crea;
    private int usuario_modi;

    private LocalDate fechacrea;
    private LocalDate fechamodi;

    private LocalDate pccrea;
    private LocalDate pcmodi;



    private LocalDate created_at;
    private LocalDate updated_at;




}





