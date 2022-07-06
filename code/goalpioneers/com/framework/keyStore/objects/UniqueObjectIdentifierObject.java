package goalpioneers.com.framework.keyStore.objects;


import goalpioneers.com.framework.keyStore.objects.templates.CharacterRangeIteratorFacade;

import java.util.ArrayList;
import java.util.List;


/**
 * Unique Object Identifier Object
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
    public UniqueObjectIdentifierObject( int number_of_counters )
    {
        this( number_of_counters, 
              new LineSeperator( '-', 5 ) );
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param number_of_counters
     * @param seperator
     */
    public UniqueObjectIdentifierObject( int number_of_counters, 
                                         LineSeperator seperator )
    {
        this.counters = new ArrayList<>();
        
        this.insertCounter( number_of_counters );
        this.setSeperator( seperator );
    }
    
    // Variables
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    private List<CharacterRangeIteratorFacade> counters = null;
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    private LineSeperator seperator = null;
    
    
    // Code
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param num
     */
    protected void insertCounter( int num )
    {
        int x;
        
        for( x = 0; 
             x < num; 
             x++ )
        {
            this.counters.add(
                    new CharacterRangeIterator( 'a' )
            );
        }
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param num
     */
    protected void removeCounter( int num )
    {
        int x;
        
        int size = this.getCounters().size() - 1;
        
        List<CharacterRangeIteratorFacade> list = this.getCounters();
        
        for( x = 0;
             x < num; 
             x++ )
        {
            int idx = size - x;
            list.remove( idx );
        }
    }
    
    
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
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public LineSeperator getSeperator() 
    {
        return seperator;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param seperator
     */
    protected void setSeperator( LineSeperator seperator ) 
    {
        this.seperator = seperator;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return 
     */
    @Override
    public String toString() 
    {
        StringBuilder builder = new StringBuilder();
        
        int idx;
        
        for( idx = 0; 
             idx < this.getCounters().size(); 
             idx++ )
        {
            CharacterRangeIteratorFacade current = this.getCounters().get( idx );
            builder.append( current.position() );
        }
        
        return builder.toString();
    }
}
