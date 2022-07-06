package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.objects.UniqueObjectIdentifierObject;


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
        UniqueObjectIdentifierObject UOIDObject = new UniqueObjectIdentifierObject(8 );
        System.out.println( UOIDObject.toString() );
    }
    
}
