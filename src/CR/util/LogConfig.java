/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CR.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raul.arrabales
 */
public class LogConfig 
{
    
    private static FileHandler fh = null;   
        
    public static void initLogger(String fileName)
    {  
        try 
        {
            fh = new FileHandler(fileName, false);
        } 
        catch (SecurityException | IOException e) 
        {
            e.printStackTrace();
        }
        Logger l = Logger.getLogger("");
        // fh.setFormatter(new LogFormatter());
        l.addHandler(fh);
        for (Handler h: l.getHandlers())
        {
            h.setFormatter(new LogFormatter());
        }
        l.setLevel(Level.CONFIG);
 }
}
