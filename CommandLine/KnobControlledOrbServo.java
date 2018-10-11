import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Name: KnobControlledOrbServo.java
 * Author: Tom Lauwers
 * Setup: Connect the Knob to sensor port 1, a tri-color LED to tri-color port 1, and a servo to servo port 1.
 * Description: The Knob controls the servo and LED - turn the knob and the servo turns. The LED changes from red to green to blue.
 */

public class KnobControlledOrbServo {

    public static void main(String[] args) throws IOException {
        // Instantiate the Hummingbird object (establishes a connection to the Hummingbird)
        HummingbirdRobot sillyBird = new HummingbirdRobot();

        // Print instructions for exiting
        System.out.println("");
        System.out.println("Press ENTER to quit.");

        // Declare a variable to store the sensor value
        int knobVal = 1;

        // Necessary for exit
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            // check whether the user pressed a key, if so, break out of the loop
            if (in.ready())
            {
                break;
            }

            // Read the value on port 1 (range is 0 to 255)
            knobVal = sillyBird.getSensorValue(2);
            System.out.println(knobVal);
            // Set the servo with the value directly - conveniently, servo also has a range of 0-255
            sillyBird.setServoPosition(1, knobVal);
            sillyBird.setFullColorLED(1, 10, 50, 100);
            sillyBird.setFullColorLED(2, 10, 50, 100);

            // Color fade from red at one extreme to green in the middle to blue at the other extreme


        }
        // Disconnect - if you miss this call the Hummingbird will continue doing stuff for five more seconds
        // you may also get a java error.
        sillyBird.disconnect();
    }
}