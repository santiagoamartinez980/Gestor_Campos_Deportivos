package gestor_campos_deportivos;
public class Campos_Deportivos {
    private String nombre;
    private String tipoDeporte;
    private String ubicacion;
    private int precioPorHora;
    private String estado;
    private String techado;
    private String urlFoto;

    public Campos_Deportivos(String nombre, String tipoDeporte, String ubicacion, int precioPorHora, String estado, String techado, String urlFoto) {
        this.nombre = nombre;
        this.tipoDeporte = tipoDeporte;
        this.ubicacion = ubicacion;
        this.precioPorHora = precioPorHora;
        this.estado = estado;
        this.techado= techado;
        this.urlFoto= urlFoto;
    }
    
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String getEstado() {
        return estado;
    }

    public String getTechado() {
        return techado;
    }

    public String getUrlFoto() {
        return urlFoto;
    }
    
    

    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTechado(String techado) {
        this.techado = techado;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
    
    
    
    
}