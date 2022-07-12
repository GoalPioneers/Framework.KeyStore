package goalpioneers.com.framework.keyStore.framework;

import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreFacade;


/**
 * 
 * @param <Type>
 */
public class KeyStoreElementConversion< Type > 
{
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
