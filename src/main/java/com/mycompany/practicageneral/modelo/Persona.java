/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicageneral.modelo;

/**
 *
 * @author hp
 */
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private boolean genero;//true-M, false-F
    
    //MÉTODOS
    //CONSTRUCTOR CREA-ATRIBUTOS ESPECIFICOS -{}A.E->OBJETO O INSTANCIA

    public Persona() {
    }

    public Persona(String nombre, String cedula, String direccion, String telefono, boolean genero) {
       
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
    }
  //ENCAPSULAMIENTO

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    //METODOS DE LÓGICA DE NEGOCIO 
    //VALIDAR EL GÉNERO
        public String validarGenero(){
        if(genero==true){
            return "Masculino";
        }else{
            return "Femenino";
        }
    }
    //DE NO RETORNO
    public void imprimir(){
        System.out.println("DATOS PERSONALES"+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+this.validarGenero());
    }
    //RETORNO
    public String imprimirPersona(){
         return "DATOS PERSONALES"+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+validarGenero();
    }

    @Override
    public String toString() {
        return "DATOS PERSONALES"+"\n"+
                "Nombres:"+this.nombre+"\n"+
                "Cédula:"+cedula+"\n"+
                "Dirección:"+getDireccion()+"\n"+
                "Teléfono:"+getTelefono()+"\n"+
                "Género:"+getGenero();}
    



}