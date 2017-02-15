package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class HoldBot extends PIDSubsystem {

    // Initialize your subsystem here
	CANTalon lifterTop = new CANTalon(RobotMap.liftMotorTop);
	
    public HoldBot() {
    	super("Lifter", 0.00005, 1.0, 1.0);
    	setAbsoluteTolerance(1000.0);
    	SmartDashboard.putData("PID", this);
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
        return lifterTop.getEncPosition();
    }

    protected void usePIDOutput(double output) {
    	output = output / 3;
        lifterTop.set(-output);
    }
    
    public void enablePID(){
    	setSetpoint(Lifter.encoder);
    	SmartDashboard.putNumber("enc pos at enable", Lifter.encoder);
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
