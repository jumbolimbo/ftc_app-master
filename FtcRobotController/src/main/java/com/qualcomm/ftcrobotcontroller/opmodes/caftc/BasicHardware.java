package com.qualcomm.ftcrobotcontroller.opmodes.caftc;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Thomas_Hoffmann on 9/25/2015.  Also edited by Caleb and stuffs
 */

//Robot with basic driving capabilities
public abstract class BasicHardware extends OpMode{
    //Execution order : Start, Init, Loop, Stop
    DcMotor mLeft;
    DcMotor mRight;
    DcMotor lLeft;
    DcMotor lRight;
    Servo sLeft;
    Servo sRight;
    Servo vLeft;
    Servo vRight;
    SensorManager sensorManager;
    Sensor compass;
    @Override
    public void init(){
        
    }
    public float turnToDegree(){
        return 0;
    }
    //DcMotor lRight;
    //DcMotor lLeft;
}