package goalpioneers.com.framework.keyStore.objects;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface UOID
{
    /**
     * 
     * @return
     */
    public String saveIdentifier();
    
    
    /**
     * 
     * @return
     */
    public String saveIdentifierReadable();
    
    
    /**
     * 
     * @param Identifier
     */
    public void loadIdentifier( String Identifier );
    
    
    /**
     * 
     * @return
     */
    public int getSize();
    
    
    /**
     * 
     * @return
     */
    public int getSizeReadable();
}
