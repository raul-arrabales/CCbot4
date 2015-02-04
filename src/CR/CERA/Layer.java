package CR.CERA;

import CR.CC;
import CR.CRANIUM.Workspace;
import CR.util.Time;
import java.util.logging.Logger;

/**
 *
 * @author raul.arrabales
 */
public class Layer 
{
    private static final Logger LOGGER = Logger.getLogger( 
        Layer.class.getName() );
    
    /**
     * A reference to CERA-CRANIUM parent object
     */
    protected CC cc;
    private String name; 
    private Time currentTick;
    private Workspace WS; 
    
    public Layer(CC parent, String name)
    {
        this.cc = parent;
        this.name = name; 
        this.currentTick = new Time();
        LOGGER.info(name + " started.");
    }
    
    
}
