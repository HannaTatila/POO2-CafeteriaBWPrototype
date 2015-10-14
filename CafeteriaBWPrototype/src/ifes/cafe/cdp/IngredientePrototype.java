/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.cdp;

public abstract class IngredientePrototype {

    protected String unidadeMedida;
    protected String nome;

    public abstract IngredientePrototype clonar();

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public String getNome() {
        return nome;
    }

}
