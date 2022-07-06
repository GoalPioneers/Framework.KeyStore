package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.objects.CharacterRangeIterator;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class KeyStoreDebugEntry 
{
    /**
     * @author Kent Madsen
     * @author Goal Pioneers
     * @param args
     */
    public static void main( String[] args )
    {
        CharacterRangeIterator iterator = new CharacterRangeIterator('a' );
        
        System.out.println( iterator.getValue() );
    }
    
}
