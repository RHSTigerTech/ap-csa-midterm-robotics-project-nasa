package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class BortTest extends HummingbirdRobot{
    // main method
    public static void main (String [] args)throws InterruptedException{
        // Hummingbird object
        Bort bort = new Bort();

        System.out.println(bort.bootMessage());

        bort.setFullColorLED(1, 255,0,0);

        bort.changeEyeColor();

        Thread.sleep(10000);

        //bort.setServoPosition(1,200);



        bort.disconnect();
    }
}
