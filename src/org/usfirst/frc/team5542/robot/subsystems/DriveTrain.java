package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive myDrive;
	private Talon lfMotor, rfMotor, lbMotor, rbMotor;
	
	private DriveTrain(){
		lfMotor = new Talon(RobotMap.leftForwardMotor);
		rfMotor = new Talon(RobotMap.rightForwardMotor);
		lbMotor = new Talon(RobotMap.leftBackMotor);
		rbMotor = new Talon(RobotMap.rightBackMotor);
		myDrive = new RobotDrive(lfMotor, lbMotor, rbMotor, rfMotor);
	}
	
	public static DriveTrain instance;
	
	public static DriveTrain getInstance() {
		if(instance == null) {
			
		}
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

