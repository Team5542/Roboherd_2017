package org.usfirst.frc.team5542.robot;

import edu.wpi.first.wpilibj.DriverStation.Alliance;

import org.usfirst.frc.team5542.robot.commands.gear.CloseGear;
import org.usfirst.frc.team5542.robot.commands.gear.KickGear;

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
		Button trigger;
		Button thumb;
		
		//Button button3;
		//Button button4;
		
		//Button button5;
		//Button button6;
		
		//Button leftBumper;
		//Button rightBumper;
		
		//leftBumper = new JoystickButton(xbox, 5);
		//leftBumper.whenPressed(new CloseGear());
		
		//rightBumper = new JoystickButton(xbox, 6);
		//rightBumper.whenPressed(new KickGear());
		
		trigger = new JoystickButton(stick, 1);
		trigger.whenPressed(new KickGear());
		
		thumb = new JoystickButton(stick, 2);
		thumb.whenPressed(new CloseGear());
		
		//button3 = new JoystickButton(stick, 3);
		//button3.whenPressed(new HoldPos());
		
		//button4 = new JoystickButton(stick, 4);
		//button4.whenPressed(new ReleasePos());
		
		//button5 = new JoystickButton(stick, 5);
		//button5.whenPressed(new DropperUp(true));
		//button5.whenReleased(new DropperUp(false));
		
		//button6 = new JoystickButton(stick, 6);
		//button6.whenPressed(new DropperDown(true));
		//button6.whenReleased(new DropperDown(false));
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
	
	/**
	 * Red = 1
	 * 
	 * Blue = 2
	 */
	public static int alliance = 0;
	
	/**
	 * Get's the xbox controller
	 * 
	 * @return xbox controller
	 */
	public XboxController getXBox() {
		return xbox;
	}
	
	/**
	 * get's the joystick
	 * 
	 * @return the joystick
	 */
	public Joystick getJoystick(){
		return stick;
	}
	
	/**
	 * set's the alliance value so i can call apon it from eveywhere
	 * 
	 * @param alliance the alliance
	 */
	public void setAlliance(Alliance alliance){
		if(alliance.equals(Alliance.Blue)){
			OI.alliance = 2;
		} else {
			OI.alliance = 1;
		}
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
