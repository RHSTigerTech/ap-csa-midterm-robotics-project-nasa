package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class BortTest extends HummingbirdRobot{
    // main method
    public static void main (String [] args)throws InterruptedException{
        // Hummingbird object
        Bort bort = new Bort();

        bort.setFullColorLED(1, 255,0,0);

        bort.changeEyeColor();





        Thread.sleep(10000);

        bort.disconnect();
    }
}
