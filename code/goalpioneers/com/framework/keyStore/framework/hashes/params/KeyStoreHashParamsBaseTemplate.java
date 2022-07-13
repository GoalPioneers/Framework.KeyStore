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
package goalpioneers.com.framework.keyStore.framework.hashes.params;

//
import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
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
