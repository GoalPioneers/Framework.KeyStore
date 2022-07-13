package goalpioneers.com.framework.keyStore.framework.storage;

//
import goalpioneers.com.framework.keyStore.framework.storage.templates.KeyStoreStorage;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 * Storage implementation where it is in memory and saved persistently on the computers drives (hdd or ssd).
 */
public class KeyStoreLocalStorage 
        extends KeyStoreStorage
{
    // Constructors
    /**
     * 
     * @param path
     */
    public KeyStoreLocalStorage( String path )
    {
        this.setLocalPath( path );
    }
    
    /**
     * 
     * @param path
     * @param tempPath
     */
    public KeyStoreLocalStorage( String path, String tempPath )
    {
        this( path );
        this.setLocalTempPath( tempPath );
    }
    
    
    // Variables
    private String localPath = null;
    
    private String localTempPath = null;
    
    
    // Accessors
    public String getLocalPath() 
    {
        return localPath;
    }
    
    public String getLocalTempPath()
    {
        return localTempPath;
    }
    
    // Setters
    public void setLocalPath( String localPath ) 
    {
        this.localPath = localPath;
    }
    
    public void setLocalTempPath( String localTempPath ) 
    {
        this.localTempPath = localTempPath;
    }
}
