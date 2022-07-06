package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;
import goalpioneers.com.framework.keyStore.templates.KeyStoreInterface;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class RegistryStore 
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    private static KeyStoreInterface KStore = null;
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public static KeyStoreInterface getStore()
    {
        if( KStore == null )
        {
            setStore( new KeyStoreFramework() );
        }
        
        return KStore;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param store
     */
    protected static void setStore( KeyStoreInterface store )
    {
        KStore = store; 
    }
}
