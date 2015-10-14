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
public class Bicarbonato extends IngredientePrototype {

    protected Bicarbonato(Bicarbonato bicarbonato) {
        this.nome = bicarbonato.getNome();
        this.unidadeMedida = bicarbonato.getUnidadeMedida();
    }

    public Bicarbonato() {
        unidadeMedida = " colher de cha";
        nome = "bicarbonato";
    }

    @Override
    public IngredientePrototype clonar() {
        return new Bicarbonato(this);
    }
}
