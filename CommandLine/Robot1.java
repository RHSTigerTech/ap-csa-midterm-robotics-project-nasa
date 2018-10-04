// import the HummingbirdRobot library and all the methods that come with it
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
import edu.cmu.ri.createlab.hummingbird.HummingbirdVersionNumber;

//Extend the Hummingbird Robot class
//If we want to pause execution Thread.sleep(1000), we need to handle an exception
public class Robot1 extends HummingbirdRobot {
    // Create a main method
    public static void main (String [] args)throws InterruptedException {
        // create a hummingbird object
        HummingbirdRobot duny = new HummingbirdRobot();

        // turn on the single color LED
        //duny.setLED(1, 0);
        duny.setFullColorLED(1,0, 255,0);


        // sleep 1 second
        Thread.sleep(1000);
        //duny.setFullColorLED(1,0,0,0);

        // use a for loop to randomly change the color of the LED
//        int r = (int) Math.random()*256;
//        int g = (int) Math.random()*256;
//        int b = (int) Math.random()*256;
//
//        for (int i=0; i<100; i++){
//            duny.setFullColorLED(1,r, g, b);
//            Thread.sleep(200);
//            r = (int) Math.random()*256;
//            g = (int) Math.random()*256;
//            b = (int) Math.random()*256;
//        }
//
//        // turn on motor
//        duny.setMotorVelocity(2, 200);
//        Thread.sleep(2000);

        // disconnect from the robot at the end of the program
        duny.disconnect();
    }
}
