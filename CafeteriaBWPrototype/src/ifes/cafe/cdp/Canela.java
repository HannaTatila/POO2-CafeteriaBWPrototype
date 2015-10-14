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
public class Canela extends IngredientePrototype {

    protected Canela(Canela canela) {
        this.nome = canela.getNome();
        this.unidadeMedida = canela.getUnidadeMedida();
    }

    public Canela() {
        unidadeMedida = " colher de sobremesa";
        nome = "canela";
    }

    @Override
    public IngredientePrototype clonar() {
        return new Canela(this);
    }
}
