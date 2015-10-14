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
public class LeitePo extends IngredientePrototype {

    protected LeitePo(LeitePo leitepo) {
        this.nome = leitepo.getNome();
        this.unidadeMedida = leitepo.getUnidadeMedida();
    }

    public LeitePo() {
        unidadeMedida = " g";
        nome = "leite em po";
    }

    @Override
    public IngredientePrototype clonar() {
        return new LeitePo(this);
    }
}
