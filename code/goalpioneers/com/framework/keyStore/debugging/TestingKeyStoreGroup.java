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
package goalpioneers.com.framework.keyStore.debugging;

//
import goalpioneers.com.framework.keyStore.framework.hashes.KeyStoreHash;
import goalpioneers.com.framework.keyStore.framework.templates.KeyStoreGroup;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class TestingKeyStoreGroup 
        implements KeyStoreGroup
{
    
    /**
     * 
     */
    @Override
    public void optimise() 
    {
        
    }
    
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
    
    
    /**
     * 
     * @return
     */
    @Override
    public int sizeOf() 
    {
        return 0;
    }
}
