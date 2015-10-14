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
public class Acucar extends IngredientePrototype {

    protected Acucar(Acucar acucar) {
        this.nome = acucar.getNome();
        this.unidadeMedida = acucar.getUnidadeMedida();
    }

    public Acucar() {
        unidadeMedida = " xicaras";
        nome = "acucar";
    }

    @Override
    public IngredientePrototype clonar() {
        return new Acucar(this);
    }

}
