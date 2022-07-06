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
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    @Override
    public char position()
    {
        return (char) this.getValue();
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
        
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    @Override
    public void previous() 
    {
        
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
    
    protected int startAlphabetAt()
    {
        char c = 'a';
        return ( int )c;
    }
    
    protected int endAlphabetAt()
    {
        char c = 'z';
        return ( int )c;
    }
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    protected final int getValue() 
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
}
