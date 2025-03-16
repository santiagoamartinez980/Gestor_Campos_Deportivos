package gestor_campos_deportivos;
public class Reservas {
    private Clientes cliente; 
    private Campos_Deportivos campo;
            
    public Reservas(Clientes cliente, Campos_Deportivos campo) {
        this.cliente = cliente;
        this.campo= campo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Campos_Deportivos getCampo() {
        return campo;
    }

    public void setCampo(Campos_Deportivos campo) {
        this.campo = campo;
    }

    @Override
    public String toString() {
        return "Reservas{" + "cliente=" + cliente + ", campo=" + campo + '}';
    }
    
    
    
}
