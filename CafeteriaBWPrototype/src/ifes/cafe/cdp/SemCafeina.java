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
public class SemCafeina extends IngredientePrototype {

    protected SemCafeina(SemCafeina semcafeina) {
        this.nome = semcafeina.getNome();
        this.unidadeMedida = semcafeina.getUnidadeMedida();
    }

    public SemCafeina() {
        unidadeMedida = " g";
        nome = "cafe sem cafeina";
    }

    @Override
    public IngredientePrototype clonar() {
        return new SemCafeina(this);
    }
}
