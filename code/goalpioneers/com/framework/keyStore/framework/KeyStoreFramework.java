package goalpioneers.com.framework.keyStore.framework;

import goalpioneers.com.framework.keyStore.objects.templates.KeyStoreElement;
import goalpioneers.com.framework.keyStore.templates.KeyStoreInterface;


/**
 * 
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class KeyStoreFramework 
        implements KeyStoreInterface
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     * @param element
     */
    @Override
    public void store( String key, 
                       KeyStoreElement element ) 
    {
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     * @return
     */
    @Override
    public KeyStoreElement retrieve( String key ) 
    {
        return null;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     */
    @Override
    public void remove( String key ) 
    {
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    @Override
    public void optimize() 
    {
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    @Override
    public void garbageCollection() 
    {
        
    }
}
