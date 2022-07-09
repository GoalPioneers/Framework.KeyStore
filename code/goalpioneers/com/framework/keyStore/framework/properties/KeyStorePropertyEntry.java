package goalpioneers.com.framework.keyStore.framework.properties;


/**
 * 
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
     * @param name
     */
    protected void setName( String name ) 
    {
        this.name = name;
    }
    
    
    /**
     * 
     * @return
     */
    public abstract String getValue();
}
