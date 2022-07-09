package goalpioneers.com.framework.keyStore.debugging;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreElement;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
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
