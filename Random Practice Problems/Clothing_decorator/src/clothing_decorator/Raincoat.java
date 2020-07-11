/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothing_decorator;

/**
 *
 * @author Zahin
 */
public class Raincoat extends ExtraClothing {
     Garments garments;

    public Raincoat(Garments garments) {
        this.garments = garments;
    }
    @Override
    public String getDescription(){
        return garments.getDescription()+super.getDescription()+"Wearing a raincoat\n";
    }
}
