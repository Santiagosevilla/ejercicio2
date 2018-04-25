/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO27
 */
public class Principal {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        String marca,modelo ;
        float precio;
        int numeroVehiculos;
        
        System.out.print("Digite la cantidad de vehiculos:  ");
        numeroVehiculos = entrada.nextInt();
        //creamos los objetos para los coches 
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0;i<coches.length;i++){
        
             System.out.println("Digite las caracteristicas del coche "+(i+1)+":");
             System.out.println("Introduzca marca del coche : ");
             marca = entrada.nextLine();
             System.out.println("introduzca modelo : ");
             modelo = entrada.nextLine();
             System.out.println("Introduzca precio : ");
             precio = entrada.nextFloat();
             
             coches[i] = new Vehiculo(marca, modelo, precio);
             
             
        }
        int indiceBarato = indiceCochesMBarato(coches);
        System.out.println("\nEl coche mas barato es : ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
    }
}
