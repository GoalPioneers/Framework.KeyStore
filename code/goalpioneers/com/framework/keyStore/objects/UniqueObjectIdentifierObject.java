package goalpioneers.com.framework.keyStore.objects;


import goalpioneers.com.framework.keyStore.objects.templates.CharacterRangeIteratorFacade;

import java.text.CharacterIterator;
import java.util.List;


/**
 * Unique Object IDentifier Object
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class UniqueObjectIdentifierObject 
    implements UOID
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public UniqueObjectIdentifierObject()
    {
        
    }
    
    // Variables
    private List<CharacterRangeIteratorFacade> counters = null;
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public String saveIdentifier() 
    {
        return null;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public String saveIdentifierReadable() 
    {
        return null;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param Identifier
     */
    @Override
    public void loadIdentifier( String Identifier ) 
    {
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public int getSize() 
    {
        return 0;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public int getSizeReadable() 
    {
        return 0;
    }
    
    
    // Accessors
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public List<CharacterRangeIteratorFacade> getCounters() 
    {
        return counters;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param counters
     */
    public void setCounters( List<CharacterRangeIteratorFacade> counters ) 
    {
        this.counters = counters;
    }
}
