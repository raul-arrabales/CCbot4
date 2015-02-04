/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CR.CERA.SensoryMotor.Twitter;

import java.io.IOException;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;
        
/**
 *
 * @author raul.arrabales
 */
public class Authorization 
{

    public Authorization() throws IOException, TwitterException 
    { 
        ConfigurationBuilder configBuilder = new ConfigurationBuilder();
        configBuilder.setDebugEnabled(true)
        .setOAuthConsumerKey("String con el Consumer key de la aplicación (Ver en la web de Twitter Developer)")
        .setOAuthConsumerSecret("String con el Consumer secret de la aplicación (Ver en la web de Twitter Developer)");
        
        Twitter OAuthTwitter = new TwitterFactory(configBuilder.build()).getInstance();
        RequestToken requestToken = null;
        AccessToken accessToken = null;
        String url = null;
    
}
