package CR;

import CR.CERA.Layer;
import static CR.CCProperties.PROCESSOR_THREADS;
import CR.util.Time;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.logging.Logger;
 
import java.util.Properties;
import java.util.logging.Level;

/**
 *
 * @author raul.arrabales
 */
public class CC implements Runnable 
{
    private static final Logger LOGGER = Logger.getLogger( 
            CC.class.getName() );
        
    /**
     * Props file
     */
    public static final String PROPERTIES = "CC.properties"; 
    
    private Properties CCprops = new Properties();
    

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
    
    
    /**
     * Saves the CC properties to disk
     */
    private void SynchProperties()
    {
        try
        {
            File f = new File(CC.PROPERTIES);
            OutputStream out = new FileOutputStream( f );
            CCprops.store(out, "Properties synced " + new Date().toString());
        }
        catch (IOException e)
        {
            LOGGER.severe("Could not sync CC properties.");
        }
        
    }
    
    @Override
    public void run() 
    {
        LOGGER.log(Level.INFO, "{0} Starting CERA-CRANIUM...", CC.class.getName());
        
        LOGGER.log(Level.INFO, "{0} Loading properties...", CC.class.getName());
        try
        {
            CCprops.load(new FileInputStream(CC.PROPERTIES));
            
            for (String key: CCprops.stringPropertyNames() )
            {
                String value = CCprops.getProperty(key);
                LOGGER.info("PROP: " + key + " -> " + value);
            }
        }
        catch( IOException e )
        {
            LOGGER.severe("Could not open properties file. Loading defaults: " 
                    + e.getMessage());
                        
        }
        
        CCprops.setProperty(CR.CCProperties.PROCESSOR_THREADS, "23");
        
        SynchProperties();
        
        SenLayer = new Layer(this, "Sensory-Motor Layer"); 
        PhyLayer = new Layer(this, "Physical Layer"); 
        MisLayer = new Layer(this, "Mission Layer"); 
        CorLayer = new Layer(this, "Core Layer"); 

    }
    
    
}
