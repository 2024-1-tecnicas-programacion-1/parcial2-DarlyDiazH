package parcial2;

public class Vehiculo {
    
    String marca;
    String modelo;
    int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String imprimirInformacion(){
    return marca+" "+modelo+" "+ año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int anio) {
        this.año = año;
    }
    
}
