package Bort;
import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bort extends HummingbirdRobot {
    // instance data
    public Bort(){
        super();
    }


    //Bort sillybird = new Bort();


    // methods
    public String bootMessage(){
        return "Waste Allocation Load Lifter Earth-class";
    }

    public void introduction(){
        String str1, str2;
        String symbol = "\u2022";

        Scanner scan = new Scanner(System.in);

            System.out.println("Enter your name: ");
            str1 = scan.nextLine();
            str2 = str1.replaceAll("[AEIOUaeiou]", symbol);

            System.out.print("Happy Halloween, ");
            System.out.println(str2);

    }

    public void changeEyeColor() throws InterruptedException{
        int i = 0;
        while(i<1000) {
            i++;
            int sensorValue = getSensorValue(4);
            //System.out.println(sensorValue);

            while (sensorValue >200) {
                sensorValue = getSensorValue(4);
                //System.out.println(sensorValue);
                setServoPosition(2, 50);
                setServoPosition(3, 0);

                setFullColorLED(1, 255, 0, 0);
                setFullColorLED(2,255,0,0);

                Thread.sleep(250);
            }
            setServoPosition(2, 0);
            setServoPosition(3, 60);

            setFullColorLED(1,0,0,255);
            setFullColorLED(2, 0,0,255);
        }
        System.out.println("Process completed. Advance to next Stage.");
    }

    public void knobControlledServo() throws IOException{
        int knobVal = 1;
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            if(in.ready()){
                break;
            }

        knobVal = this.getSensorValue(2);
        // System.out.println(knobVal);
        this.setServoPosition(1, knobVal);

        }
    }

}
