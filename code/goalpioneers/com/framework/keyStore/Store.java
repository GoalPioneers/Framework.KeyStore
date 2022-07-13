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
package goalpioneers.com.framework.keyStore;

//
import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;


/**
 *
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface Store
{
    /**
     * 
     * @param id
     * @return
     */
    public KeyStoreFramework retrieve( int id );
    
    /**
     * 
     * @param framework
     */
    public void add( KeyStoreFramework framework );
    
    /**
     * 
     * @param id
     * @return
     */
    public boolean delete( int id );
    
    /**
     * 
     * @return
     */
    public int size();
    
    /**
     * 
     * @param framework
     * @return
     */
    public boolean inSet( KeyStoreFramework framework );
    
}
