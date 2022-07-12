package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreInterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class RegistryStore
{
    public RegistryStore()
    {
        
    }
    
    
    // Variables
    private static List< KeyStoreInterface > stored = null;
    
    
    // Variables
    /**
     * 
     * @return
     */
    public static List< KeyStoreInterface > getStored() 
    {
        if( stored == null )
        {
            stored = new ArrayList<>();
        }
        
        return stored;
    }
    
    
    /**
     * 
     * @param stored
     */
    public static void setStored( List<KeyStoreInterface> stored ) 
    {
        RegistryStore.stored = stored;
    }
}
