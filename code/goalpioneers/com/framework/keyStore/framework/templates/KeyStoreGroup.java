package goalpioneers.com.framework.keyStore.framework.templates;

import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;


/**
 * Set of elements to be stored.
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface KeyStoreGroup 
{
    
    
    /**
     * Optimises the set
     */
    public void optimise();
    
    
    // Hash
    /**
     * 
     * @return
     */
    public String generateHash();
    
    
    /**
     * 
     * @param hashAlgorithm
     */
    public void setHashBy( KeyStoreHash hashAlgorithm );
    
    
    // State of accessors
    /**
     *
     * @return
     */
    public int sizeOf();
}
