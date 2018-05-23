/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsability;

public class Audi implements Car {
   private String motor;
   private String llantas;
   private Placa placa;
   @Override
   public void draw() {
      System.out.println("Brand: Audi");
   }

    @Override
    public void setMotor(String motor) {
        this.motor=motor;
    }

    @Override
    public void setLlantas(String llantas) {
         this.llantas=llantas;
    }
   
}