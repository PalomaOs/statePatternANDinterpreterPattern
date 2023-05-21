/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern;
/**
 *
 * @author Palom
 */
public class TV {
    
    public ControlRemoto estado; 

    public ControlRemoto getState() {
        return estado;
    }

    public void setEstado(ControlRemoto estado) {
        this.estado = estado;
    }
    
    public TV (ControlRemoto estado){
        this.estado = estado;
    }
    
    public void pulsarBoton(){
        estado.pulsarInterruptor(this);
    }
       
}
