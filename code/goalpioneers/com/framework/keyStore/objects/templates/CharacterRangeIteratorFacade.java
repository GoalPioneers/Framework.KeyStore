package goalpioneers.com.framework.keyStore.objects.templates;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface CharacterRangeIteratorFacade 
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public char position();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public int relativePosition();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param c
     */
    public void map( char c );
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public void next();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     */
    public void previous();
}
