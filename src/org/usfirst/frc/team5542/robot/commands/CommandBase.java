package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.subsystems.Lifter;
import org.usfirst.frc.team5542.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5542.robot.subsystems.HoldBot;
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
	protected static HoldBot pid;
	protected static Lifter arm;
	public static void init(){
		driveTrain = DriveTrain.getInstance();
		servos = Servos.getInstance();
		pdp = PDPvalues.getInstance();
		pid = HoldBot.getInstance();
		arm = Lifter.getInstance();
	}
}
