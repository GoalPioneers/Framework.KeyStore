package goalpioneers.com.framework.keyStore.templates;

import goalpioneers.com.framework.keyStore.objects.templates.KeyStoreElement;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface KeyStoreInterface 
{
    /**
     * 
     * @param key
     * @param element
     */
    public void store( String key, 
                       KeyStoreElement element );
    
    /**
     * 
     * @param key
     * @return
     */
    public KeyStoreElement retrieve( String key );
    
    
    /**
     * 
     * @param key
     */
    public void remove( String key );
    
    
    /**
     * 
     */
    public void optimize();
    
    
    /**
     * 
     */
    public void garbageCollection();
}
