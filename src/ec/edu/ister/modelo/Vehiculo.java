/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author SANTIAGO27
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
//metodo constructor 
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
   public String mostrarDatos(){
       return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n";
   } 
    
    
    
}
