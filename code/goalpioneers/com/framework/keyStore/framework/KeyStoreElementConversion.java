/**
 * Copyright 2022, Goal Pioneers
 * License: MIT License (https://github.com/GoalPioneers/Prototype.KeyStore/blob/main/LICENSE.md)
 * Author: Kent v. Madsen
 * Contact: Kent.vejrup.madsen@outlook.com
 * Issues: https://github.com/GoalPioneers/Prototype.KeyStore/issues
 * Title: 
 * Description: 
 * Tags: 
 */
package goalpioneers.com.framework.keyStore.framework;

//
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreFacade;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 * @param <Type> expected result
 */
public class KeyStoreElementConversion< Type > 
{
    /**
     * 
     * @param ksInterface
     */
    public KeyStoreElementConversion( KeyStoreFacade ksInterface )
    {
        this.setKsi( ksInterface );
    }
    
    
    // Variables
    private KeyStoreFacade ksi = null;
    
    
    // Accessor
    /**
     * 
     * @return
     */
    public final KeyStoreFacade getKsi() 
    {
        return ksi;
    }
    
    
    /**
     * 
     * @param ksi
     */
    public final void setKsi( KeyStoreFacade ksi ) 
    {
        this.ksi = ksi;
    }
}
