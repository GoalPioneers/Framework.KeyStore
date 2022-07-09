package goalpioneers.com.framework.keyStore.debugging;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreElement;


public class TestingKeyStoreElement 
        implements KeyStoreElement
{
    @Override
    public String generateHash() 
    {
        return null;
    }
    
    @Override
    public void setHashBy( KeyStoreHash hashAlgorithm ) 
    {
        
    }
}
