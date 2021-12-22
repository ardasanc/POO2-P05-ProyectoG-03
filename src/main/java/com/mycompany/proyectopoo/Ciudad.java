/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectopoo;


/**
 *
 * @author PC
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    //Constructor
    public Ciudad(String n, String p){
        this.nombre=n;
        this.provincia=p;
    }
    //GETTERS
    public String getNombre(){return this.nombre;}
    public String getProvincia(){return this.provincia;}
    
    
    //Se genera un código
    public String generarCodigo(){
        //- se toma los tres primeros caracteres de los atributos de tipo String
        char ch1 = getNombre().charAt(0);
        char ch2 = getProvincia().charAt(0);
        char ch3 = getNombre().charAt(1);
        char ch4 = getProvincia().charAt(1);
        char ch5 = getNombre().charAt(2);
        char ch6 = getProvincia().charAt(2);
        String cod = String.valueOf(ch1+ch2+ch3+ch4+ch5+ch6);
        return cod;//se devuelve un string de 6 caracteres
    }
    @Override
    public String toString(){
        return "Ciudad: " + this.nombre + ", Provincia: " + this.provincia;}
}
