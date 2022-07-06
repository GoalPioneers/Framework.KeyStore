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
        CharacterRangeIterator iterator = new CharacterRangeIterator('z' );
        
        for( int x = 0; 
                 x < 45; 
                 x++ )
        {
            System.out.print( iterator.position() );
            System.out.print(" ");
            System.out.print(iterator.getValue());
            System.out.println();
            
            iterator.previous();
        }
    }
    
}
