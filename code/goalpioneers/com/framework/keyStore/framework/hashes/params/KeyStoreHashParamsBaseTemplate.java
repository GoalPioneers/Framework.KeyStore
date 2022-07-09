package goalpioneers.com.framework.keyStore.framework.hashes.params;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;

public abstract class KeyStoreHashParamsBaseTemplate 
        implements KeyStoreHash
{
    private String hash = null;
    
    public boolean isHashEmpty()
    {
        return ( hash == null );
    }
    
    public final String getHash() 
    {
        return hash;
    }
    
    public final void setHash( String hash ) 
    {
        this.hash = hash;
    }
}
