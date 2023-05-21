/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern;

/**
 *
 * @author Palom
 */
public class Encendido extends ControlRemoto {
    @Override
    public void pulsarInterruptor(TV contexto) {
        System.out.println("Estoy encendido, ahora voy a estar apagado");
        contexto.setEstado(new Apagado());
    }
}
