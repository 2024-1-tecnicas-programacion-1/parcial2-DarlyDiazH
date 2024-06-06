
import parcial2.Automovil;
import parcial2.Motocicleta;
import static parcial2.TipoCombustible.GASOLINA;
import parcial2.TipoMotocicleta;
import static parcial2.TipoMotocicleta.DEPORTIVA;
import parcial2.Vehiculo;

public class Principal {
    
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("Toyota ", "Corolla", 2020);
        vehiculo.imprimirInformacion();
        
        Automovil automovil = new Automovil ("Honda", "Civic", 2020, 4, GASOLINA);
        automovil.imprimirInformacion();
        
        Motocicleta motocicleta = new Motocicleta("Toyota ", "Corolla", 2020, DEPORTIVA);
        motocicleta.imprimirInformacion();
    }
    
}
