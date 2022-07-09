package goalpioneers.com.framework.keyStore.debugging;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreElement;


/**
 * 
 */
public class TestingKeyStoreElement 
        implements KeyStoreElement
{
    /**
     * 
     * @return
     */
    @Override
    public String generateHash() 
    {
        return null;
    }
    
    
    /**
     * 
     * @param hashAlgorithm
     */
    @Override
    public void setHashBy( KeyStoreHash hashAlgorithm ) 
    {
        
    }
}
