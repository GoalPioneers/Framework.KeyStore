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
package goalpioneers.com.framework.keyStore;

//
import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreFacade;


/**
 * 
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class RegistrySingleton 
{
    /**
     * Main Store
     */
    private static KeyStoreFacade KStore = null;
    
    
    
    /**
     * 
     * @return
     */
    public static KeyStoreFacade getStore()
    {
        if( KStore == null )
        {
            setStore( 
                    new KeyStoreFramework() 
            );
        }
        
        return KStore;
    }
    
    
    /**
     * 
     * @param store
     */
    protected static void setStore( KeyStoreFacade store )
    {
        KStore = store; 
    }
}
