package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.OI;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class ServoControll extends CommandBase {

    public ServoControll() {
        requires(servos);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	servos.setSevoPos(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*OI oi = new OI();
    	*Joystick stick = oi.getJoystick();
    	*double pov = stick.getPOV();
    	*pov = pov / 360;
    	*servos.setSevoPos(pov);
    	*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	servos.setSevoPos(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
