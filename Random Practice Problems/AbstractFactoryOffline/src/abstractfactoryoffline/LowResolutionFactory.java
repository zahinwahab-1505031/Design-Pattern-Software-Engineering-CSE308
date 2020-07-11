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
public class LowResolutionFactory implements ResolutionFactory {
     @Override
    public DisplayDriver getDisplayDriver() {
        return new LowResDisplayDriver();
    }

    @Override
    public PrintDriver getPrintDriver() {
        return new LowResPrintDriver();
    }
}
