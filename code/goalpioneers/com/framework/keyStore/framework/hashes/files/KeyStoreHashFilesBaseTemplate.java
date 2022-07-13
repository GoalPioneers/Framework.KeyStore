package goalpioneers.com.framework.keyStore.framework.hashes.files;

//
import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public abstract class KeyStoreHashFilesBaseTemplate 
        implements KeyStoreHash
{
    // Variables
    /**
     * 
     */
    private String hash = null;
    
    /**
     * 
     */
    private String filePath = null;
    
    
    // State Accessors
    /**
     * 
     * @return
     */
    public final boolean isHashEmpty()
    {
        return ( hash == null );
    }
    
    /**
     * 
     * @return
     */
    public final boolean isFilePathEmpty()
    {
        return ( this.filePath == null );
    }
    
    
    // Accessors
    /**
     * 
     * @return
     */
    public final String getHash() 
    {
        return hash;
    }
    
    /**
     * 
     * @return
     */
    public String getFilePath() 
    {
        return filePath;
    }
    
    
    /**
     * 
     * @param hash
     */
    public final void setHash( String hash ) 
    {
        this.hash = hash;
    }
    
    /**
     * 
     * @param filePath
     */
    public void setFilePath( String filePath ) 
    {
        this.filePath = filePath;
    }
}
