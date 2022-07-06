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
    // Constructors
    /**
     * 
     */
    public UniqueObjectIdentifierObject( int number_of_counters )
    {
        this( number_of_counters, 
              new LineSeperator() );
    }
    
    
    /**
     * 
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
     * 
     */
    private List<CharacterRangeIteratorFacade> counters = null;
    
    /**
     * 
     */
    private LineSeperator seperator = null;
    
    
    // Code
    /**
     * 
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
     * 
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
     * 
     * @return
     */
    @Override
    public String saveIdentifier() 
    {
        return null;
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public String saveIdentifierReadable() 
    {
        return this.toString();
    }
    
    
    /**
     * 
     * @param Identifier
     */
    @Override
    public void loadIdentifier( String Identifier ) 
    {
        
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public int getSize() 
    {
        return 0;
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public int getSizeReadable() 
    {
        return 0;
    }
    
    
    // Accessors
    /**
     * 
     * @return
     */
    public List<CharacterRangeIteratorFacade> getCounters() 
    {
        return counters;
    }
    
    
    /**
     * 
     * @param counters
     */
    public void setCounters( List<CharacterRangeIteratorFacade> counters ) 
    {
        this.counters = counters;
    }
    
    
    /**
     * 
     * @return
     */
    public LineSeperator getSeperator() 
    {
        return seperator;
    }
    
    
    /**
     * 
     * @param seperator
     */
    protected void setSeperator( LineSeperator seperator ) 
    {
        this.seperator = seperator;
    }
    
    
    /**
     * 
     * @return 
     */
    @Override
    public final String toString() 
    {
        StringBuilder builder = new StringBuilder();
        
        int idx;
        int length = this.getCounters().size();
        int length_limit = length - 1;
        
        for( idx = 0; 
             idx < length; 
             idx++ )
        {
            boolean seperate = this.seperator.shouldSeperate( idx );
            
            boolean min = idx > 0;
            boolean max = !( idx == length_limit );
            
            if( seperate && min && max)
            {
                builder.append( this.seperator.getSeperator() );
            }
            
            CharacterRangeIteratorFacade current = this.getCounters().get( idx );
            builder.append( current.position() );
        }
        
        return builder.toString();
    }
    
    
    /**
     * 
     * @return
     */
    public final String toStringMachine()
    {
        StringBuilder builder = new StringBuilder();
    
        int idx;
        int length = this.getCounters().size();
    
        for( idx = 0;
             idx < length;
             idx++ )
        {
            CharacterRangeIteratorFacade current = this.getCounters().get( idx );
            builder.append( current.position() );
        }
    
        return builder.toString();
    }
}
