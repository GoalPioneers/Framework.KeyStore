package goalpioneers.com.framework.keyStore.framework;


import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreGroup;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreInterface;


/**
 * Sets the main Store globally.
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
        this.setPath( defaultPath );
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
    
    
    /**
     * 
     */
    private boolean useTemperaryState = false;
    
    /**
     * 
     */
    private boolean usePersistence = false;
    
    
    /**
     * 
     */
    private boolean useIndex = false;
    
    
    // Code
    /**
     * 
     * @param key
     * @param element
     */
    @Override
    public void store( String key, 
                       KeyStoreGroup element ) 
    {
        
    }
    
    
    /**
     * 
     * @param key
     * @return
     */
    @Override
    public KeyStoreGroup retrieve( String key ) 
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
    
    /**
     * 
     * @param key
     * @return
     */
    @Override
    public boolean existKey( String key ) 
    {
        return false;
    }
    
    
    // Accessors
    /**
     * 
     * @return
     */
    public final boolean isUsePersistence() 
    {
        return usePersistence;
    }
    
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
     * @return
     */
    public final boolean isUseTemperaryState() 
    {
        return useTemperaryState;
    }
    
    /**
     * 
     * @return
     */
    public final boolean isUseIndex() 
    {
        return useIndex;
    }
    
    
    /**
     * 
     * @param path
     */
    protected final void setPath( String path ) 
    {
        this.path = path;
    }
    
    /**
     * 
     * @param temperaryPath
     */
    protected final void setTemperaryPath( String temperaryPath ) 
    {
        this.temperaryPath = temperaryPath;
    }
    
    
    /**
     * 
     * @param usePersistence
     */
    public void setUsePersistence( boolean usePersistence ) 
    {
        this.usePersistence = usePersistence;
    }
    
    
    /**
     * 
     * @param useTemperaryState
     */
    public final void setUseTemperaryState( boolean useTemperaryState ) 
    {
        this.useTemperaryState = useTemperaryState;
    }
    
    /**
     * 
     * @param useIndex
     */
    public void setUseIndex( boolean useIndex ) 
    {
        this.useIndex = useIndex;
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
