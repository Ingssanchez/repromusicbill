/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /**
 *
 * @author Sergio Sanchez 20241222424 Celular 3208689548
 */
package repromusica; // El nombre del paquete debe coincidir con el nombre de la clase pública

import java.util.Scanner;

public class Repromusica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del reproductor sin IVA: COP$");
        double precioSinIVA = scanner.nextDouble();

        System.out.print("Ingrese la marca del reproductor: ");
        String marca = scanner.next();

        double descuentoPrecio = 0.0;
        double descuentoMarca = 0.0;

        // Descuento aplicado por precio mayor a 500 pesos
        if (precioSinIVA >= 500) {
            descuentoPrecio = 0.10;
        }

        // Switch para el descuento por marca en caso de no ser nosy, escribir cualquier marca
        switch (marca.toUpperCase()) { // Cambio de cadena de caracteres
            case "NOSY":
                descuentoMarca = 0.05;
                break;
            
        }

        double precioConDescuento = precioSinIVA - (precioSinIVA * descuentoPrecio) - (precioSinIVA * descuentoMarca);
        double iva = precioConDescuento * 0.19;
        double precioFinal = precioConDescuento + iva;

        System.out.println("Precio final con IVA incluido: COP$" + precioFinal);

        scanner.close();
    }
}
