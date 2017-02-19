package org.usfirst.frc.team5542.robot.subsystems;

import org.usfirst.frc.team5542.robot.commands.values.UpdateGyro;

import com.analog.adis16448.frc.ADIS16448_IMU;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GyroValues extends Subsystem {
	
	ADIS16448_IMU imu;
	private GyroValues(){
		imu = new ADIS16448_IMU();
	}
	
	public void updateGyro(){
		double x = imu.getAngleX();
		double y = imu.getAngleY();
		double z = imu.getAngleZ();
		SmartDashboard.putNumber("Gyro X", x);
		SmartDashboard.putNumber("Gyro Y", y);
		SmartDashboard.putNumber("Gyro Z", z);
	}
	
	public double getGyroX(){
		double x = imu.getAngleX();
		return x;
	}
	
	public double getGyroY(){
		double y = imu.getAngleY();
		return y;
	}
	
	public double getGyroZ(){
		double z = imu.getAngleZ();
		return z;
	}
	
	protected static GyroValues instance;
	public static GyroValues getInstance(){
		if(instance == null){
			instance = new GyroValues();
		}
		return instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new UpdateGyro());
    }
}

