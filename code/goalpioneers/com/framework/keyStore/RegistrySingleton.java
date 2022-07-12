package goalpioneers.com.framework.keyStore;


import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreInterface;


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
    private static KeyStoreInterface KStore = null;
    
    
    
    /**
     * 
     * @return
     */
    public static KeyStoreInterface getStore()
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
    protected static void setStore( KeyStoreInterface store )
    {
        KStore = store; 
    }
}
