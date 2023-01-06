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
        
            
        System.out.println (suma(5,10,15));
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
