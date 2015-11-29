package com.qualcomm.ftcrobotcontroller.opmodes.caftc;

import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;

import java.util.ArrayList;

/**
 * Created by Thomas_Hoffmann on 11/29/2015.
 */
public class SweepUS extends Aparatus{
    public Servo sweep;
    public UltrasonicSensor sensor;
    public double minDegree = 0;
    public double maxDegree = 180;
    public SweepUS(BasicHardware hardware) {
        sweep = hardware.hardwareMap.servo.get("sweeper");
        sensor = hardware.hardwareMap.ultrasonicSensor.get("ultrasonic");
    }

    /***
     *
     * @param samples How many datapoints you want to sample.
     * @return The datapoints recoreded by the sweeper, with the angle relative to the compass/robot.
     */
    public SweeperData[] sweep(int samples){

     return null;
    }
}
