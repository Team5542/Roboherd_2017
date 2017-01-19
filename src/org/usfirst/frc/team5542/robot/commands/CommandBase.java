package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5542.robot.subsystems.PDPvalues;
import org.usfirst.frc.team5542.robot.subsystems.Servos;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {
	protected static DriveTrain driveTrain;
	protected static Servos servos;
	protected static PDPvalues pdp;
	public static void init(){
		driveTrain = DriveTrain.getInstance();
		servos = Servos.getInstance();
		pdp = PDPvalues.getInstance();
	}
}
