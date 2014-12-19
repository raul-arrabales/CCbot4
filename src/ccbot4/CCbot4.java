/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccbot4;

import CR.CC;
import CR.util.LogConfig;
import java.util.logging.Logger;


/**
 *
 * @author raul.arrabales
 */
public class CCbot4 
{
    private static final Logger LOGGER = Logger.getLogger( 
            CCbot4.class.getName() );


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
        System.out.println("Hi Console");
        LogConfig.initLogger("CCbot4log.txt");
        LOGGER.info("Hi Log");
        
        // Launch an instance of CERA-CRANIUM
        CC cc = new CC();
        cc.run();
    }
    
}
