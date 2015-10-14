/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.Leite;
import ifes.cafe.cdp.Acucar;
import ifes.cafe.cdp.CafeSoluvel;
import ifes.cafe.cdp.Agua;
import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.IngredientePrototype;
import java.util.ArrayList;

public class FabricaCafeNormal implements FabricaC {

    private final int QTDLEITE = 100;
    private final int QTDACUCAR = 2;
    private final int QTDCAFESOLUVEL = 50;
    private final int QTDAGUA = 100;
    private final double PRECO = 2;
    protected ArrayList<IngredientePrototype> ingredientes = new ArrayList<>();

    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(PRECO);
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    public FabricaCafeNormal() {
        Agua ag = new Agua();
        CafeSoluvel cs = new CafeSoluvel();
        Acucar ac = new Acucar();
        Leite l = new Leite();

        for (int contador = 0; contador < QTDAGUA; contador++) {
            IngredientePrototype agua = ag.clonar();
            ingredientes.add(agua);
        }

        for (int contador = 0; contador < QTDCAFESOLUVEL; contador++) {
            IngredientePrototype cafesoluvel = cs.clonar();
            ingredientes.add(cafesoluvel);
        }

        for (int contador = 0; contador < QTDACUCAR; contador++) {
            IngredientePrototype acucar = ac.clonar();
            ingredientes.add(acucar);
        }

        for (int contador = 0; contador < QTDLEITE; contador++) {
            IngredientePrototype leite = l.clonar();
            ingredientes.add(leite);
        }

    }

}
