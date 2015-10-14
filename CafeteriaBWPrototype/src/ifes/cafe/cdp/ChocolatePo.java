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
public class ChocolatePo extends IngredientePrototype {

    protected ChocolatePo(ChocolatePo choco) {
        this.nome = choco.getNome();
        this.unidadeMedida = choco.getUnidadeMedida();
    }

    public ChocolatePo() {
        unidadeMedida = " g";
        nome = "chocolate em po";
    }

    @Override
    public IngredientePrototype clonar() {
        return new ChocolatePo(this);
    }
}
