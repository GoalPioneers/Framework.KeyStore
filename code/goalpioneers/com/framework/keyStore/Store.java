package goalpioneers.com.framework.keyStore;

import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;


/**
 *
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public interface Store 
{
    public KeyStoreFramework retrieve( int id );
    
    public void add( KeyStoreFramework framework );
    public boolean delete( int id );
    
    public int size();
    
    public boolean inSet( KeyStoreFramework framework );
}
