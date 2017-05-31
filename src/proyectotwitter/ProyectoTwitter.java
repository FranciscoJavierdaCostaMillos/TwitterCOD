
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
