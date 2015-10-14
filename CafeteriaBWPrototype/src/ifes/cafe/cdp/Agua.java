/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.cdp;

import ifes.cafe.cdp.IngredientePrototype;

/**
 *
 * @author dell
 */
public class Agua extends IngredientePrototype {

    protected Agua(Agua agua) {
        this.nome = agua.getNome();
        this.unidadeMedida = agua.getUnidadeMedida();
    }

    public Agua() {
        unidadeMedida = " ml";
        nome = "agua";
    }

    @Override
    public IngredientePrototype clonar() {
        return new Agua(this);
    }
}
