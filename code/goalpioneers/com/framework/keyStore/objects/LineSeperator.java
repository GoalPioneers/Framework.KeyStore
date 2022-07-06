package goalpioneers.com.framework.keyStore.objects;

/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class LineSeperator 
{
    /**
     * 
     */
    public LineSeperator()
    {
        this('-', 5 );
    }
    
    /**
     * 
     * @param seperatorCharacter
     */
    public LineSeperator( char seperatorCharacter )
    {
        this( seperatorCharacter, 5 );
    }
    
    
    /**
     * 
     * @param seperatorCharacter
     * @param lengthForSeperation
     */
    public LineSeperator( char seperatorCharacter, 
                          int lengthForSeperation )
    {
        this.setSeperator( seperatorCharacter );
        this.setLengthForSeperation( lengthForSeperation );
    }
    
    
    // Variables
    /**
     * 
     */
    private char seperator;
    
    /**
     * 
     */
    private int lengthForSeperation;
    
    // Accessor
    /**
     * 
     * @return
     */
    public char getSeperator() 
    {
        return seperator;
    }
    
    
    /**
     * 
     * @param seperator
     */
    public void setSeperator( char seperator ) 
    {
        this.seperator = seperator;
    }
    
    
    /**
     * 
     * @return
     */
    public int getLengthForSeperation() 
    {
        return lengthForSeperation;
    }
    
    
    /**
     * 
     * @param lengthForSeperation
     */
    protected void setLengthForSeperation( int lengthForSeperation ) 
    {
        this.lengthForSeperation = lengthForSeperation;
    }
}
