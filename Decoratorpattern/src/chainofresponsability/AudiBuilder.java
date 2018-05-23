/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

/**
 *
 * @author Estudiante
 */
public class AudiBuilder extends CarBuilder{

    @Override
    public void buildLlantas() {
        carro.setLlantas("4");
    }

    @Override
    public void buildMotor() {
       carro.setMotor("Motor marca Audi");
    }
    
}
