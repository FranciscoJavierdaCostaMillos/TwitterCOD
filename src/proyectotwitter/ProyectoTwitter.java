/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotwitter;

/**
 *
 * @author fdacostamillos
 */
public class ProyectoTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppTwitter tw = new AppTwitter();
        tw.connect();
        tw.verTimeline();
        tw.postearTweet();
    }
    
}
