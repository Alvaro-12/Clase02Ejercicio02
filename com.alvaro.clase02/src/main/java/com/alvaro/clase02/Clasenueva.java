/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alvaro.clase02;

/**
 *
 * @author Alvaro
 */
public class Clasenueva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
     Libros objetolibro1 = new Libros(1,"PROGRAMACION java", 100,"alvaro");
     Libros objetolibro2 = new Libros(2,"PROGRAMACION PHP", 60,"alvaro");
     
     objetolibro1.setNumeroPaginas(20 );
      //  System.out.println(libro.toString());

      if(objetolibro1.getNumeroPaginas()< objetolibro2.getNumeroPaginas() ) {
          System.out.println("El libro 2 es mayor en numero de paginas que el libro 1, el libro 2 tiene un numero de paginas de" +objetolibro2.getNumeroPaginas());
          System.out.println("La informacion del libro 2 es " +objetolibro2.toString());
      }else {
          System.out.println("El libro 1 es mayor en numero de paginas que el libro 2, el libro 1 tiene un numero de paginas de " +objetolibro1.getNumeroPaginas());
           System.out.println("La informacion del libro 1 es " + objetolibro1.toString());
      }
     
    
          
          
          
  }
    
    
    
}
