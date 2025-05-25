package gestor_campos_deportivos;

import Seguridad.Seguridad;


public class Clientes {
    private String numeroIdentificacion;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    public String usuario;
    private String hashContraseña;

    public Clientes(String numeroIdentificacion, String nombre, String apellidos, String telefono , String correo, String usuario, String hashContraseña) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario= usuario;
        this.hashContraseña = Seguridad.encriptar(hashContraseña);
    }
    
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHashContraseña() {
        return hashContraseña;
    }
    
    




}
    
