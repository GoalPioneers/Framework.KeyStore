package goalpioneers.com.framework.keyStore.framework.properties;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class KeyStoreProperty 
{
    // Constructors
    /**
     * 
     */
    public KeyStoreProperty()
    {
        this.setEntries( 
                new ArrayList< KeyStorePropertyEntry >() 
        );
        
        this.setFormat(
                KeyStorePropertyFormat.Default 
        );
    }
    
    
    // variables
    /**
     * 
     */
    private List<KeyStorePropertyEntry> entries = null;
    
    /**
     * 
     */
    private KeyStorePropertyFormat format = null;
    
    
    // Accessors
    /**
     * 
     * @return
     */
    public List< KeyStorePropertyEntry > getEntries() 
    {
        return entries;
    }
    
    /**
     * 
     * @return
     */
    public KeyStorePropertyFormat getFormat() 
    {
        return format;
    }
    
    // Setters
    /**
     * 
     * @param entries
     */
    protected void setEntries( List< KeyStorePropertyEntry > entries ) 
    {
        this.entries = entries;
    }
    
    /**
     * 
     * @param format
     */
    public void setFormat( KeyStorePropertyFormat format )
    {
        this.format = format;
    }
    
    
    // State
    
    // Object Extensions
    /**
     * 
     * @return
     */
    @Override
    public String toString() 
    {
        return super.toString();
    }
}
