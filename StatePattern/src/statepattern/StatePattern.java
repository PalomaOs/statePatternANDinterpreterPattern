/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statepattern;

/**
 *
 * @author Palom
 */
public class StatePattern {
    
    public static void main(String[] args) {
        System.out.println("Prueba State Pattern");
        Apagado estadoInicial = new Apagado();
        TV tv = new TV (estadoInicial);
        //Primera vez que se pulsa el boton 
        tv.pulsarBoton();
        //Segunda vez que se pulsa el boton 
        tv.pulsarBoton();
    }   
}
