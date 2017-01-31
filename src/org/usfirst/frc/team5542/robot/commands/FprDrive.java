package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.OI;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class FprDrive extends CommandBase {

    public FprDrive() {
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	OI oi = new OI();
    	Joystick stick = oi.getJoystick();
    	double y = -stick.getRawAxis(OI.stickY);
    	double z = -stick.getRawAxis(OI.stickZ);
    	double slider = -stick.getRawAxis(OI.slider);
    	slider *= 2;
    	
    	if(y < 0.10 && y > -0.10){
    		y = 0;
    	} 
    	if(z < 0.10 && z > -0.10){
    		z = 0;
    	}
    	
    	//y = Math.pow(y, 1.1);
    	//z = Math.pow(z, 1.1);
    	driveTrain.fprDrive(y, z, slider);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	driveTrain.fprDrive(0, 0, .5);
    }
}
