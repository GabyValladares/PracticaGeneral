/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicageneral.modelo;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        Persona p=new Persona("Gaby Valladares","1003002007" , "Ibarra", "0992937736", false);
        p.imprimir();
        
        Estudiante e=new Estudiante(154656, "Alan", "02654164756", "alan@gmail.com");
        System.out.println(e.toString());
    }
}
