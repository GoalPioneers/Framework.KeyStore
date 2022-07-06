package goalpioneers.com.framework.keyStore.objects;

/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class LineSeperator 
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
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
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    private char seperator;
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    private int lengthForSeperation;
    
    // Accessor
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public char getSeperator() 
    {
        return seperator;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param seperator
     */
    public void setSeperator( char seperator ) 
    {
        this.seperator = seperator;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public int getLengthForSeperation() 
    {
        return lengthForSeperation;
    }
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param lengthForSeperation
     */
    protected void setLengthForSeperation( int lengthForSeperation ) 
    {
        this.lengthForSeperation = lengthForSeperation;
    }
}
