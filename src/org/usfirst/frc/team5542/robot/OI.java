package org.usfirst.frc.team5542.robot;

import org.usfirst.frc.team5542.robot.commands.ServoControll;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	XboxController xbox = new XboxController(0);
	Joystick stick = new Joystick(1);
	
	public OI(){
		Button trigger = new JoystickButton(stick, 0);
		trigger.whenPressed(new ServoControll());
	}
	
	//axis map
	public static final int lxAxis = 0;
	public static final int lyAxis = 1;
	public static final int rxAxis = 4;
	public static final int ryAxis = 5;
	public static final int rTrigger = 3;
	public static final int lTrigger = 2;
	public static final int dPad = 0;
	
	//Joystick axis map
	public static final int stickX = 0;
	public static final int stickY = 1;
	public static final int stickZ = 2;
	public static final int slider = 3;
	public static final int pov = 0;

	public XboxController getXBox() {
		return xbox;
	}
	
	public Joystick getJoystick(){
		return stick;
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
