package CR;

import static CR.Properties.PROCESSOR_THREADS;
import CR.util.Time;

/**
 *
 * @author raul.arrabales
 */
public class CC implements Runnable 
{
    public static final String PROPERTIES = "CC.properties"; 

    /**
     * Singleton
     */
    private static CC cc = new CC();
    
    /** 
     * Returns singleton instance
     * @return 
     */
    public static CC instance() 
    {
        return cc;
    }    
    
    private Time currentTick;    
    
    @Override
    public void run() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
