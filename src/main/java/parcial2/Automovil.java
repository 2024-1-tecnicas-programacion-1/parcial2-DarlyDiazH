package parcial2;

public class Automovil extends Vehiculo{
    
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil(String marca, String modelo, int año, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    
        
    @Override
    public String imprimirInformacion(){
        return getMarca()+" "+getModelo()+" "+getAño()+", "+numeroPuertas+" puertas, combustión a "+tipoCombustible.GASOLINA;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
