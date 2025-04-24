import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los atributos del vehiculo: ");
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Color: ");
        String color = sc.nextLine();
        System.out.println("Anio: ");
        String anio = sc.nextLine();

        Vehiculos v1 = new Vehiculos(marca, modelo, color, anio);

        Vehiculos v2 = new Vehiculos("Toyota", "Corolla", "Gris", "2022");
        Vehiculos v3 = new Vehiculos("Ford", "Mustang", "Negro", "2020");

        v1.informacion();
        v1.frenar();
        v2.informacion();
        v2.frenar();
        v3.informacion();
        v3.frenar();

        sc.close();
    }
}