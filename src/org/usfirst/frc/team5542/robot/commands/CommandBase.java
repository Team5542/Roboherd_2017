package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {
	protected static DriveTrain driveTrain;
	public static void init(){
		driveTrain = DriveTrain.getInstance();
	}
}
