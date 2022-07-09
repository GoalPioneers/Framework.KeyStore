package goalpioneers.com.framework.keyStore.framework.hashes;

public abstract class KeyStoreHashBaseTemplate 
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
