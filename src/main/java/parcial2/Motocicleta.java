package parcial2;

public class Motocicleta extends Vehiculo{
    
    private TipoMotocicleta tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, TipoMotocicleta tipomotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipomotocicleta;
    }
    
    @Override
    public String imprimirInformacion(){
        return getMarca()+" "+getModelo()+" "+getAño()+", "+tipoMotocicleta.DEPORTIVA;
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
    
    
}
