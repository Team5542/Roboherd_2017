package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class HoldBot extends PIDSubsystem {

    // Initialize your subsystem here
	CANTalon lifter = new CANTalon(RobotMap.liftMotor);
	
    public HoldBot() {
    	super("Lifter", 1.0, 0, 0);
    	setAbsoluteTolerance(.2);
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    public void initDefaultCommand() {
        //This really isn't needed
    }

    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return lifter.getEncPosition();
    }

    protected void usePIDOutput(double output) {
        lifter.set(output);
    }
    
    public void enablePID(double setPoint){
    	setSetpoint(setPoint);
    	enable();
    }
    
    public void dissablePID(){
    	disable();
    }
    
    protected static HoldBot instance;
    
    public static HoldBot getInstance(){
    	if(instance == null){
    		instance = new HoldBot();
    	}
    	return instance;
    }
}
