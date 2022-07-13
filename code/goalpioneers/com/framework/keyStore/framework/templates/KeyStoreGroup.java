/**
 * Copyright 2022, Goal Pioneers
 * License: MIT License (https://github.com/GoalPioneers/Prototype.KeyStore/blob/main/LICENSE.md)
 * Author: Kent v. Madsen
 * Contact: Kent.vejrup.madsen@outlook.com
 * Issues: https://github.com/GoalPioneers/Prototype.KeyStore/issues
 * Title: 
 * Description: 
 * Tags: 
 */
package goalpioneers.com.framework.keyStore.framework.templates;

//
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
