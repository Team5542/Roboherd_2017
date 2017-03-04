package org.usfirst.frc.team5542.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

public class GyroDrive extends RobotDrive{

	public GyroDrive(CANTalon lfMotor, CANTalon lbMotor, CANTalon rbMotor, CANTalon rfMotor) {
		super(lfMotor, lbMotor, rbMotor, rfMotor);
	}
	
	static double startGyro;
	static boolean strait = false;
	public void correctingArcadeDrive(double move, double turn, double gyro){
		double leftud = 0;
		double rightud = 0;
		if(move == 0){
			if(!strait){
				startGyro = gyro;
				strait = true;
			} else {
				strait = false;
			}
			double variation = gyro - startGyro;
			if(variation >= 0){
				rightud = variation/10;
			} else {
				leftud = Math.abs(variation)/10;
			}
		} else {
			leftud = turn;
			rightud = -turn;
		}
		this.m_frontLeftMotor.setInverted(true);
		this.m_rearLeftMotor.setInverted(true);
		
		this.m_frontLeftMotor.set(move + leftud);
		this.m_rearLeftMotor.set(move + leftud);
		
		this.m_frontRightMotor.set(move + rightud);
		this.m_rearRightMotor.set(move + rightud);
	}
}
