package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.Timer;
import java.util.TimerTask;

import org.usfirst.frc.team5542.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LineAuto extends CommandBase {

    public LineAuto() {
        requires(driveTrain);
    }
    
    long startTime;

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putBoolean("Driving", true);
    	startTime = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.tankDrive(.5, .5, 1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return ((System.currentTimeMillis() - startTime) >= 4000);
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putBoolean("Driving", false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
