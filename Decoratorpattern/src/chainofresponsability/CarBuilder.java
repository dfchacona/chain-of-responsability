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
abstract class CarBuilder {
    protected Car carro;

    public Car getPizza() {
        return carro;
    }

    public void createAudi() {
        carro = new Audi();
    }
    
    public void createMercedes() {
        carro = new Mercedes();
    }

    public abstract void buildLlantas();
    public abstract void buildMotor();
   
}
