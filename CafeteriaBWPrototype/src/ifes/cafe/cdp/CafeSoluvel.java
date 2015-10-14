/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.cdp;

import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.IngredientePrototype;

/**
 *
 * @author dell
 */
public class CafeSoluvel extends IngredientePrototype {

    protected CafeSoluvel(CafeSoluvel cafesoluvel) {
        this.nome = cafesoluvel.getNome();
        this.unidadeMedida = cafesoluvel.getUnidadeMedida();
    }

    public CafeSoluvel() {
        unidadeMedida = " g";
        nome = "cafe soluvel";
    }

    @Override
    public IngredientePrototype clonar() {
        return new CafeSoluvel(this);
    }
}
