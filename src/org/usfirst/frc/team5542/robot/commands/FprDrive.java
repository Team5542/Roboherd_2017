package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.OI;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
    private static double sensitivity = 1.0;

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	OI oi = new OI();
    	XboxController xbox = oi.getXBox();
    	double move = -xbox.getRawAxis(OI.lyAxis);
    	double turn = -xbox.getRawAxis(OI.rxAxis);
    	
    	if(move < 0.10 && move > -0.10){
    		move = 0;
    	} 
    	if(turn < 0.10 && turn > -0.10){
    		turn = 0;
    	}
    	
    	int pov = xbox.getPOV();
    	
    	if(pov >= 315 || pov <= 45 && pov >= 0){
    		sensitivity = sensitivity + .005;
    	} else if (pov <= 255 && pov >= 135){
    		sensitivity = sensitivity - .005;
    	}
    	
    	if(sensitivity <= 0){
    		sensitivity = 0;
    	}
    	
    	if(sensitivity >= 3){
    		sensitivity = 3;
    	}
    	
    	SmartDashboard.putNumber("pov", pov);
    	
    	//y = Math.pow(y, 1.1);
    	//z = Math.pow(z, 1.1);
    	driveTrain.fprDrive(move, turn, sensitivity);
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
