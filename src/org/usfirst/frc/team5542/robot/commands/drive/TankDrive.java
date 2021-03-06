package org.usfirst.frc.team5542.robot.commands.drive;

import org.usfirst.frc.team5542.robot.OI;
import org.usfirst.frc.team5542.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TankDrive extends CommandBase {

    public TankDrive() {
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
    	double left = -xbox.getRawAxis(OI.lyAxis);
    	double right = -xbox.getRawAxis(OI.ryAxis);
    	if(left < 0.20 && left > -0.20){
    		left = 0;
    	}
    	
    	if(right < 0.20 && right > -0.20){
    		right = 0;
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
    	
    	driveTrain.tankDrive(left, right, sensitivity);
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
    	
    }
}
