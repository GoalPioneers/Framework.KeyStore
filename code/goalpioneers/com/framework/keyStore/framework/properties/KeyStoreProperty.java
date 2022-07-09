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
    }
    
    
    // variables
    /**
     * 
     */
    private List<KeyStorePropertyEntry> entries = null;
    
    
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
     * @param entries
     */
    public void setEntries( List< KeyStorePropertyEntry > entries ) 
    {
        this.entries = entries;
    }
}
