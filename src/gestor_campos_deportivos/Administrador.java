package gestor_campos_deportivos;

public class Administrador {
    private String usuario;
    private String nombre;
    private String apellido;
    private String contraseña;

    public Administrador(String usuario , String contraseña, String nombre, String apellido) {
        
        this.usuario= usuario;
        this.contraseña = contraseña; 
        this.nombre = nombre;
        this.apellido = apellido;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
