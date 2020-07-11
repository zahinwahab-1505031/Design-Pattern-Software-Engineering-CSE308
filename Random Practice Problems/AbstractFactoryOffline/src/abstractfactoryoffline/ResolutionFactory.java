/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryoffline;

/**
 *
 * @author Zahin
 */
public interface ResolutionFactory {
     public abstract DisplayDriver getDisplayDriver();
    public abstract PrintDriver getPrintDriver();
}
