package goalpioneers.com.framework.keyStore.framework.templates;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface KeyStoreInterface 
{
    /**
     * Saves an object in memory.
     * @param key
     * @param element
     */
    public void store( String key, 
                       KeyStoreElement element );
    
    /**
     * Retrieves an object from memory
     * @param key
     * @return
     */
    public KeyStoreElement retrieve( String key );
    
    
    /**
     * removal of an object in memory
     * @param key
     */
    public void remove( String key );
    
    
    /**
     * Optimizes the algorithm
     */
    public void optimize();
    
    
    /**
     * Get rid of files
     */
    public void garbageCollection();
}
