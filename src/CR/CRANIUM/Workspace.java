/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CR.CRANIUM;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 *
 * @author raul.arrabales
 */
public class Workspace 
{
    private ExecutorService executor; 
    
    
    public Workspace()
    {
        executor = Executors.newCachedThreadPool();
    }
     
}
