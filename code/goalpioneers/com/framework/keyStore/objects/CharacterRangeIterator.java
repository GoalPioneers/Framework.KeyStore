package goalpioneers.com.framework.keyStore.objects;

import goalpioneers.com.framework.keyStore.objects.templates.RangeIterator;

/**
 * 
 */
public class CharacterRangeIterator 
    implements RangeIterator
{
    /**
     * 
     */
    public CharacterRangeIterator()
    {
        
    }
    
    /**
     * 
     * @param value
     */
    public CharacterRangeIterator( char value )
    {
        
    }
    
    
    // Variables
    private int value = -1;
    
    
    // Code
    @Override 
    public void map( char c )
    {
        
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public char position()
    {
        return (char) this.getValue();
    }
    
    
    /**
     * 
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
     * 
     * @return
     */
    protected final int getValue() 
    {
        return value;
    }
    
    
    /**
     * 
     * @param value
     */
    protected final void setValue( int value ) 
    {
        this.value = value;
    }
}
