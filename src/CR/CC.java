package CR;

import CR.CERA.Layer;
import static CR.Properties.PROCESSOR_THREADS;
import CR.util.Time;
import java.util.logging.Logger;

/**
 *
 * @author raul.arrabales
 */
public class CC implements Runnable 
{
    private static final Logger LOGGER = Logger.getLogger( 
            CC.class.getName() );
        
    public static final String PROPERTIES = "CC.properties"; 

    public Layer getSenLayer() {
        return SenLayer;
    }

    public Layer getPhyLayer() {
        return PhyLayer;
    }

    public Layer getMisLayer() {
        return MisLayer;
    }

    public Layer getCorLayer() {
        return CorLayer;
    }

    public Time getCurrentTick() {
        return currentTick;
    }

    private Layer SenLayer; 
    private Layer PhyLayer; 
    private Layer MisLayer; 
    private Layer CorLayer;     
    
    
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
        LOGGER.info(CC.class.getName() + " Starting CERA-CRANIUM...");
        
        SenLayer = new Layer(this, "Sensory-Motor Layer"); 
        PhyLayer = new Layer(this, "Physical Layer"); 
        MisLayer = new Layer(this, "Mission Layer"); 
        CorLayer = new Layer(this, "Core Layer"); 

    }
    
    
}
