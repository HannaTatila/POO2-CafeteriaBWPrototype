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
public class Leite extends IngredientePrototype {

    protected Leite(Leite leite) {
        this.nome = leite.getNome();
        this.unidadeMedida = leite.getUnidadeMedida();
    }

    public Leite() {
        unidadeMedida = " ml";
        nome = "leite";
    }

    @Override
    public IngredientePrototype clonar() {
        return new Leite(this);
    }
}
