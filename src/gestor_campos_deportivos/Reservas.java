package gestor_campos_deportivos;

import java.util.Date;

public class Reservas {
    private Clientes cliente; 
    private Campos_Deportivos campo;
    private Date fecha;
    private String jornada;
    private String hora;
    


    public Reservas(Clientes cliente, Campos_Deportivos campo, Date fecha, String jornada, String hora) {
        this.cliente = cliente;
        this.campo= campo;
        this.fecha = fecha;
        this.jornada = jornada;
        this.hora = hora;
        
        
    }

    public Clientes getCliente() {
        return cliente;
    }

    public Campos_Deportivos getCampo() {
        return campo;
    }
    
    
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

  
    
    

    public int calcularPrecioFinal(int precio, String seleccion) {
    switch (seleccion) {
        case "Mañana":
            return precio; // sin recargo
            
        case "Tarde":
            return precio + (int)(precio * 0.10); // 10% adicional
            
        case "Noche":
            return precio + (int)(precio * 0.20); // 20% adicional
            
        default:
            return 0;
    }
}



}