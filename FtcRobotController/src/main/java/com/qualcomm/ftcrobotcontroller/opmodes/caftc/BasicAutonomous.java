package com.qualcomm.ftcrobotcontroller.opmodes.caftc;

/**
 * Created by Thomas_Hoffmann on 10/1/2015.
 */
public abstract class BasicAutonomous extends BasicHardware{
    @Override
    public void init(){
    super.init();
    }

    public void start(){}
    public void loop(){}
    public void stop(){}
}
