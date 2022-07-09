package goalpioneers.com.framework.keyStore.framework.properties;

import java.util.ArrayList;
import java.util.List;


/**
 * A way to portray information in a readable format
 * for development / client and internally. 
 * @author Kent Madsen
 * @author Goal Pioneers
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
    // Getters
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
        return toStringConnector( 
                this.getFormat() 
        );
    }
    
    
    /**
     * 
     * @param format
     * @return
     */
    protected String toStringConnector( KeyStorePropertyFormat format )
    {
        String result = null;
        
        switch ( format )
        {
            case CSV:
                result = toStringCSV();
                break;
                
            case TSV:
                result = toStringTSV();
                break;
            
            // Console Output & Default
            default:
                result = toStringConsole();
                break;
        }
        
        return result;
    }
    
    
    /**
     * 
     * @return
     */
    protected String toStringConsole()
    {
        return "";
    }
    
    
    /**
     * 
     * @return
     */
    protected String toStringCSV()
    {
        return "";
    }
    
    
    /**
     * 
     * @return
     */
    protected String toStringTSV()
    {
        return "";
    }
}
