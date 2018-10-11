package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.io.IOException;

public class BortTest extends HummingbirdRobot{
    // main method
    public static void main (String [] args)throws InterruptedException, IOException {
        // WALLE Hummingbird object
        Bort bort = new Bort();

        System.out.println(bort.bootMessage());

        // greet user
        bort.introduction();

        bort.changeEyeColor();

        bort.speak("Plant");

        bort.knobControlledServo();

        Thread.sleep(10000);

        bort.disconnect();
    }
}
