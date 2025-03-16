package gestor_campos_deportivos;
public class Main {
    public static void main(String[] args) {
    Campos_Deportivos cancha1 = new Campos_Deportivos( "Caney",  "futbol5",  "barrioSantanita", 100000, "libre", "SI"  ); 
    Clientes cliente1 = new Clientes("Santiago Martinez", "1070465219", "300XXXXXXX", "alejomd0325@gmail.com");
    Reservas reserva1= new Reservas(cliente1, cancha1);
    System.out.println(reserva1.toString());
    }
    
}
