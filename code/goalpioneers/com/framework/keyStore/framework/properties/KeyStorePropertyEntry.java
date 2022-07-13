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
package goalpioneers.com.framework.keyStore.framework.properties;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public abstract class KeyStorePropertyEntry 
{
    // constructors
    /**
     * 
     * @param labelName
     */
    public KeyStorePropertyEntry( String labelName )
    {
        this.setName( labelName );
    }
    
    
    // variables
    private String name = null;
    
    
    // accessors
        // getters
    /**
     * 
     * @return
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     *
     * @return
     */
    public abstract String getValue();
    
    
    // setters
    /**
     * 
     * @param name
     */
    protected void setName( String name ) 
    {
        this.name = name;
    }
}
