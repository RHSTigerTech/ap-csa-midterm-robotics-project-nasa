package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Bort extends HummingbirdRobot {
    // declare instance data here


    public Bort(){
        super();
    }

    // get methods
    public void changeEyeColor() throws InterruptedException{
        int i = 0;
        while(i<100) {
            i++;
            int sensorValue = getSensorValue(1);
            System.out.println(sensorValue);

            while (sensorValue < 150) {
                System.out.println(sensorValue);
                setFullColorLED(1, 0, 0, 255);
                Thread.sleep(100);
            }

            setFullColorLED(1,255,0,0);
        }
    }

    // set methods

}
