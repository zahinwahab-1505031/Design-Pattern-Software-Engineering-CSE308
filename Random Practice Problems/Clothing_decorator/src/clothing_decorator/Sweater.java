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
public class Sweater extends ExtraClothing {
     Garments garments;

    public Sweater(Garments garments) {
        this.garments = garments;
    }
    @Override
    public String getDescription(){
        return garments.getDescription()+super.getDescription()+"Wearing a sweater\n";
    }
}
