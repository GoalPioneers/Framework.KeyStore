package goalpioneers.com.framework.keyStore.debugging;


import goalpioneers.com.framework.keyStore.framework.KeyStoreFramework;

/**
 * Class which purpose is to test the framework and make sure that it functions as intended.
 * @author Kent Madsen
 * @author Goal Pioneers
 */
public class TestingKeyStoreFramework 
{
    /**
     * 
     */
    public TestingKeyStoreFramework()
    {
        this.setFramework( 
                new KeyStoreFramework() 
        );
    }
    
    
    // Variables
    private KeyStoreFramework framework = null;
    
    
    // Code
    public void run()
    {
        
    }
    
    
    // Accessors
    public KeyStoreFramework getFramework() 
    {
        return framework;
    }
    
    
    protected void setFramework( KeyStoreFramework framework ) 
    {
        this.framework = framework;
    }
    
    
    // Entry
    public static void main( String[] args )
    {
        TestingKeyStoreFramework test = new TestingKeyStoreFramework();
        test.run();
    }
}