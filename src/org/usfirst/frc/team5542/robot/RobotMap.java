package org.usfirst.frc.team5542.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int leftBackMotor = 4;
	public static int leftForwardMotor = 1;
	
	public static int rightBackMotor = 3;
	public static int rightForwardMotor = 2;
	
	public static int liftMotor = 6;
	
	public static int gateServo = 0;
	public static int kickServo = 1;
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
