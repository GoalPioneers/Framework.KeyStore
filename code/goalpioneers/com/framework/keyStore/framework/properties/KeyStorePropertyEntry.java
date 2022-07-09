package goalpioneers.com.framework.keyStore.framework.properties;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public abstract class KeyStorePropertyEntry 
{
    // constructors
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
