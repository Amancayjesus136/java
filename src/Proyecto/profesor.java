package Proyecto;

import java.time.LocalDate;

public class profesor {

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

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
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

    private int idprofesor;
    private String nombre;
    private String apellido;
    private String direccion;
    private String documento;
    private LocalDate fechanacimiento;
    private String telefono;
    private String email;
    private int usuario_crea;
    private int usuario_modi;
    private LocalDate fechacrea;
    private LocalDate fechamodi;
    private String pccrea;
    private String pcmodi;

}
