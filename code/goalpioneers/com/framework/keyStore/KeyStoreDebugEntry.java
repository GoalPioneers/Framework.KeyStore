package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.objects.UniqueObjectIdentifierObject;


/**
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class KeyStoreDebugEntry 
{
    /**
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        UniqueObjectIdentifierObject UOIDObject = 
                new UniqueObjectIdentifierObject(20 );
        
        System.out.println( UOIDObject.toString() );
    }
    
}
