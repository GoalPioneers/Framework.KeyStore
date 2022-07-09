package goalpioneers.com.framework.keyStore.framework.templates;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface KeyStoreElement 
{
    /**
     * 
     * @return
     */
    public String generateHash();
    
    
    /**
     * 
     * @param hashAlgorithm
     */
    public void setHashBy(KeyStoreHash hashAlgorithm );
}
