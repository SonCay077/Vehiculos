class Vehiculos{
    //Atributos
    String marca, modelo, color, anio;

    // Constructor
    public Vehiculos(String marca, String modelo, String color, String anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    //Métod para información
    void informacion(){
       System.out.println("--- Ficha de Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Anio: " + anio);
        System.out.println("--------------------------");
    }

    // Métod para frenar
    void frenar(){
        System.out.println("Frenando...");
    }
}
public class Main {
    public static void main(String[] args) {

    }
}