package goalpioneers.com.framework.keyStore.framework.templates;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;

/**
 * 
 */
public interface KeyStoreElement 
{
    public String generateHash();
    
    public void setHashBy(KeyStoreHash hashAlgorithm );
}
