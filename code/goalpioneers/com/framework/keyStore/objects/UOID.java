package goalpioneers.com.framework.keyStore.objects;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface UOID
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public String saveIdentifier();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public String saveIdentifierReadable();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param Identifier
     */
    public void loadIdentifier( String Identifier );
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public int getSize();
    
    
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @return
     */
    public int getSizeReadable();
}
