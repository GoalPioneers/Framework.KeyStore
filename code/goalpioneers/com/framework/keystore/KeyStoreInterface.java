package goalpioneers.com.framework.keystore;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface KeyStoreInterface 
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     * @param element
     */
    public void store( String key, 
                       KeyStoreElement element );
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     * @return
     */
    public KeyStoreElement retrieve( String key );
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param key
     */
    public void remove( String key );
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public void optimize();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public void garbageCollection();
}
