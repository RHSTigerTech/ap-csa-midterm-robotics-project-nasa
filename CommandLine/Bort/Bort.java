package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Bort extends HummingbirdRobot {
    // instance data
    public Bort(){
        super();
    }

    // methods
    public String bootMessage(){
        return "Waste Allocation Load Lifter Earth-class";
    }

    public void changeEyeColor() throws InterruptedException{
        int i = 0;
        while(i<100) {
            i++;
            int sensorValue = getSensorValue(1);
            //System.out.println(sensorValue);

            while (sensorValue < 150) {
                sensorValue = getSensorValue(1);
                System.out.println(sensorValue);
                setFullColorLED(1, 0, 0, 255);
                Thread.sleep(100);
            }

            setFullColorLED(1,255,0,0);
            setFullColorLED(1,0,0,255);

        }
    }





}
