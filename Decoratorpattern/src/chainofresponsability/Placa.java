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
public class Placa {
    private Placa() {}

    private static class PlacaHolder {
        private static final Placa INSTANCE = new Placa();
    }

    public static Placa getInstance() {
        return PlacaHolder.INSTANCE;
    }
}
