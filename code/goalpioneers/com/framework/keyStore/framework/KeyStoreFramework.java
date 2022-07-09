package goalpioneers.com.framework.keyStore.framework;

import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreElement;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreInterface;


/**
 * 
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class KeyStoreFramework 
        implements KeyStoreInterface
{
    // Constructors
    /**
     * 
     */
    public KeyStoreFramework()
    {
        
    }
    
    /**
     * 
     * @param defaultPath
     */
    public KeyStoreFramework( String defaultPath )
    {
        
    }
    
    
    // Variables
    /**
     * The default directory to save data persistently. 
     * "keep in mind it's not required" for it to function.
     */
    private String path = null;
    
    
    /**
     * The default directory to save temperary data. 
     * "keep in mind it's not required" for it to function.
     */
    private String temperaryPath = null;
    
    
    // Code
    /**
     * 
     * @param key
     * @param element
     */
    @Override
    public void store( String key, 
                       KeyStoreElement element ) 
    {
        
    }
    
    
    /**
     * 
     * @param key
     * @return
     */
    @Override
    public KeyStoreElement retrieve( String key ) 
    {
        return null;
    }
    
    
    /**
     * 
     * @param key
     */
    @Override
    public void remove( String key ) 
    {
        
    }
    
    
    /**
     * 
     */
    @Override
    public void optimize() 
    {
        
    }
    
    
    /**
     * 
     */
    @Override
    public void garbageCollection() 
    {
        
    }
    
    
    // Accessors
    /**
     * 
     * @return
     */
    public final String getPath() 
    {
        return path;
    }
    
    /**
     * 
     * @return
     */
    public final String getTemperaryPath() 
    {
        return temperaryPath;
    }
    
    
    /**
     * 
     * @param path
     */
    public final void setPath( String path ) 
    {
        this.path = path;
    }
    
    /**
     * 
     * @param temperaryPath
     */
    public final void setTemperaryPath( String temperaryPath ) 
    {
        this.temperaryPath = temperaryPath;
    }
    
    
    /**
     * 
     * @return
     */
    public final boolean isPathEmpty()
    {
        return ( this.path == null );
    }
    
    /**
     * 
     * @return
     */
    public final boolean isTemperaryPathEmpty()
    {
        return ( this.temperaryPath == null );
    }
}
