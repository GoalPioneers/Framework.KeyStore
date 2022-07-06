package goalpioneers.com.framework.keyStore.objects;

import goalpioneers.com.framework.keyStore.objects.templates.CharacterRangeIteratorFacade;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class CharacterRangeIterator 
    implements CharacterRangeIteratorFacade
{
    // Constructors
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public CharacterRangeIterator()
    {
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param value
     */
    public CharacterRangeIterator( char value )
    {
        super();
        this.map( value );
    }
    
    
    // Variables
    private int value = -1;
    
    
    // Code
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param c
     */
    @Override 
    public void map( char c )
    {
        if( this.isWithinRange( c ) )
        {
            int position = (int)c - this.startAlphabetAt();
            this.setValue( position );
        }
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public char position()
    {
        int r = startAlphabetAt() + this.getValue();
        return (char) r;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public int relativePosition() 
    {
        return this.value;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    @Override
    public void next() 
    {
        int r = this.value + 1;
        
        int range = this.endAlphabetAt() - this.startAlphabetAt();
        
        if( r > ( range ) )
        {
            r = r % ( range + 1 );
        }
        
        this.setValue( r );
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    @Override
    public void previous() 
    {
        int i = this.value - 1;
        int range = this.endAlphabetAt() - this.startAlphabetAt();
        
        if( i < 0 )
        {
            i = (range + 1) + i;
        }
        
        this.setValue( i );
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param c
     * @return
     */
    protected boolean isWithinRange( char c )
    {
        // Convert Character to lowercase
        char C = Character.toLowerCase( c );
        
        // Character Range Limits
        boolean leftLimit  = ( 'a' <= C );
        boolean rightLimit = ( 'z' >= C );
        
        boolean completeValue = false;
        
        if( leftLimit && rightLimit )
        {
            return !completeValue;
        }
        
        return completeValue;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    protected int startAlphabetAt()
    {
        char c = 'a';
        return ( int )c;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    protected int endAlphabetAt()
    {
        char c = 'z';
        return ( int )c;
    }
    
    
    // Accessors
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public final int getValue() 
    {
        return value;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param value
     */
    protected final void setValue( int value ) 
    {
        this.value = value;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public boolean isNotInitialised()
    {
        boolean complete = false;
        
        if( this.getValue() == -1 )
        {
            complete = !complete;
        }
        
        return complete;
    }
}
