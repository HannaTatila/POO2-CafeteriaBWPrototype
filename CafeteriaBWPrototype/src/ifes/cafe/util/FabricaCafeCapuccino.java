/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.Bicarbonato;
import ifes.cafe.cdp.LeitePo;
import ifes.cafe.cdp.Canela;
import ifes.cafe.cdp.Acucar;
import ifes.cafe.cdp.CafeSoluvel;
import ifes.cafe.cdp.ChocolatePo;
import ifes.cafe.cdp.Agua;
import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.IngredientePrototype;
import java.util.ArrayList;

public class FabricaCafeCapuccino implements FabricaC {

    private final int QTDCAFESOLUVEL = 100;
    private final int QTDACUCAR = 2;
    private final int QTDLEITEPO = 100;
    private final int QTDBICARBONATO = 1;
    private final int QTDCHOCOLATEPO = 50;
    private final int QTDCANELA = 1;
    private final int QTDAGUA = 100;
    private final double PRECO = 5;
    private ArrayList<IngredientePrototype> ingredientes = new ArrayList<>();

    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(PRECO);
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    public FabricaCafeCapuccino() {
        Agua ag = new Agua();
        CafeSoluvel cs = new CafeSoluvel();
        Acucar ac = new Acucar();
        LeitePo lp = new LeitePo();
        Bicarbonato bi = new Bicarbonato();
        ChocolatePo cho = new ChocolatePo();
        Canela ca = new Canela();

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

        for (int contador = 0; contador < QTDLEITEPO; contador++) {
            IngredientePrototype leitepo = lp.clonar();
            ingredientes.add(leitepo);
        }

        for (int contador = 0; contador < QTDBICARBONATO; contador++) {

            IngredientePrototype bicarbonato = bi.clonar();
            ingredientes.add(bicarbonato);
        }
        for (int contador = 0; contador < QTDCHOCOLATEPO; contador++) {

            IngredientePrototype chocolatepo = cho.clonar();
            ingredientes.add(chocolatepo);
        }

        for (int contador = 0; contador < QTDCANELA; contador++) {
            IngredientePrototype canela = ca.clonar();
            ingredientes.add(canela);
        }
    }

}
