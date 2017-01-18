package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.RobotMap;
import org.usfirst.frc.team5542.robot.commands.FprDrive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private RobotDrive myDrive;
	private CANTalon lfMotor, rfMotor, lbMotor, rbMotor;
	
	private DriveTrain(){
		lfMotor = new CANTalon(RobotMap.leftForwardMotor);
		rfMotor = new CANTalon(RobotMap.rightForwardMotor);
		lbMotor = new CANTalon(RobotMap.leftBackMotor);
		rbMotor = new CANTalon(RobotMap.rightBackMotor);
		myDrive = new RobotDrive(lfMotor, lbMotor, rbMotor, rfMotor);
	}
	
	public static DriveTrain instance;
	
	public static DriveTrain getInstance() {
		if(instance == null) {
			instance = new DriveTrain();
		}
		return instance;
	}
	
	public void fprDrive(double move, double turn){
		move = Math.pow(move, 2);
		turn = Math.pow(turn, 2);
		SmartDashboard.putNumber("move", move);
		SmartDashboard.putNumber("turn", turn);
		myDrive.arcadeDrive(move, turn);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new FprDrive());
    }
}

