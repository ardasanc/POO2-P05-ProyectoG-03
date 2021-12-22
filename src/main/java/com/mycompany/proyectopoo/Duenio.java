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
public class Duenio extends Persona{
    private String cedula;
    private String apellido;
    

    //Constructor
    public Duenio(String ced, String n, String a, String d, String t, Ciudad c, String e){
        super(n,d,t,c,e);//super para constructor de clase padre (Persona)
        this.cedula=ced;
        this.apellido=a;
    }
    
     //se sobreescriben los getters de la clase padre(Persona)
    public String getCedula(){return this.cedula;}
    @Override
    public String getNombre(){return super.getNombre();}
    public String getApellido(){return this.apellido;}
    @Override
    public String getDireccion(){return super.getDireccion();}
    @Override
    public String getTelefono(){return super.getTelefono();}
    @Override
    public Ciudad getCiudad(){return super.getCiudad();}
    @Override
    public String getEmail(){return super.getEmail();}
    

    //se sobreescriben los setters de la clase padre(Persona)
    //los setters son para poder cambiar la informacion de duenio,
    //por lo que no se integra un setCedula() ya que el id es permanente
    @Override
    public void setNombre(String nn){super.setNombre(nn);}
    
    public void setApellido(String a){this.apellido = a;}
    
    @Override
    public void setDireccion(String dd){super.setDireccion(dd);}
    @Override
    public void setTelefono(String t){super.setTelefono(t);}
    @Override
    public void setCiudad(Ciudad c){super.setCiudad(c);}
    @Override
    public void setEmail(String e){super.setEmail(e);}
    
    @Override
    public String toString(){
        return "Cedula del duenio: " + this.cedula + ", Apellido del duenio: " +this.apellido 
                + ", "+super.toString();}//se sobreescribe el metodo toString de la clase padre

    
}
