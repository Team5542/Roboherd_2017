package org.usfirst.frc.team5542.robot.commands.auto.right;

import org.usfirst.frc.team5542.robot.OI;
import org.usfirst.frc.team5542.robot.commands.auto.AutoBase;

/**
 *
 */
public class TurnRightAuto extends AutoBase {

    public TurnRightAuto() {
        requires(driveTrain);
    }
    double angle;
    // Called just before this Command runs the first time
    protected void initialize() {
    	if(OI.alliance == 1){
    		angle = 1.0;
    	} else { //TODO determine angles
    		angle = 0.0;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.fprDrive(0, -.5, 1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (gyro.getGyroX() == angle);
    }

    // Called once after isFinished returns true
    protected void end() {
    	executeNextCommand("right");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
