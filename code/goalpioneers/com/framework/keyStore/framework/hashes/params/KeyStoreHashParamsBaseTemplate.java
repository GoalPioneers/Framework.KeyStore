package goalpioneers.com.framework.keyStore.framework.hashes.params;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;


/**
 * 
 */
public abstract class KeyStoreHashParamsBaseTemplate 
        implements KeyStoreHash
{
    // Variables
    /**
     * 
     */
    private String hash = null;
    
    
    /**
     * 
     * @return
     */
    public final boolean isHashEmpty()
    {
        return ( hash == null );
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
     * @param hash
     */
    public final void setHash( String hash ) 
    {
        this.hash = hash;
    }
}
