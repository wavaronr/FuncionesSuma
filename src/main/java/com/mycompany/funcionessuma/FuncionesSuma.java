/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funcionessuma;

/**
 *
 * @author Wilmer Alexander Varon Rodriguez 
 */
public class FuncionesSuma {
    
    public static int suma(int a,int b, int c){
    
        return a+b+c;
    }

    public static void main(String[] args) {
        
           /*Primera parte:
            Crear una función con tres parámetros que sean números que se suman entre sí.
            Llamar a la función en el main y darle valores.
            */
           
            System.out.println (suma(5,10,15));
        
               /*Segunda parte:
                Crear una clase coche.
                Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
                Una función que incremente el número de puertas que tiene el coche.
                Crear un objeto miCoche en el main y añadirle una puerta.
                Mostrar el número de puertas que tiene el objeto.            */
            
            
            Coche miCoche = new Coche();
        
            miCoche.incrementarPuerta();
            miCoche.incrementarPuerta();
               
        
    }
    
 
}
class Coche {
    
    int puertas=4;
    
    public void incrementarPuerta(){
    this.puertas++;
    System.out.println(puertas) ;
    }
    
}
