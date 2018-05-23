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
public class Decoratorpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car circle = new Audi();
        Car redCircle = new RedCarDecorator(new Audi());
        Car redRectangle = new RedCarDecorator(new Mercedes());
        
        System.out.println("Audi with normal border");
        circle.draw();

        System.out.println("\nAudi of red border");
        redCircle.draw();

        System.out.println("\nMercedes of red border");
        redRectangle.draw();
    }
    
}
