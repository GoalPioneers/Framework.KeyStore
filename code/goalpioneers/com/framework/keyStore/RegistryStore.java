package goalpioneers.com.framework.keyStore;

import java.util.ArrayList;
import java.util.List;

import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreFacade;


/**
 *
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class RegistryStore
    implements Store
{
    // Constructors
    /**
     * 
     */
    public RegistryStore()
    {
        
    }
    
    
    // Variables
    private static List<KeyStoreFacade> stored = null;
    
    
    //
    /**
     * 
     * @param framework
     */
    @Override
    public void add( KeyStoreFramework framework ) 
    {
        
    }
    
    /**
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete( int id )
    {
        return false;
    }
    
    /**
     * 
     * @param id
     * @return
     */
    @Override
    public KeyStoreFramework retrieve( int id ) 
    {
        return null;
    }
    
    /**
     * 
     * @return
     */
    @Override
    public int size() 
    {
        return 0;
    }
    
    
    /**
     * 
     * @param framework
     * @return
     */
    @Override
    public boolean inSet( KeyStoreFramework framework ) 
    {
        return false;
    }
    
    
    // Variables
    /**
     * 
     * @return
     */
    public static List<KeyStoreFacade> getStored() 
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
    public static void setStored( List<KeyStoreFacade> stored ) 
    {
        RegistryStore.stored = stored;
    }
}
