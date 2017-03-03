package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.ArrayList;
import java.util.HashMap;

import org.usfirst.frc.team5542.robot.commands.CommandBase;
import org.usfirst.frc.team5542.robot.commands.auto.left.TurnLeftAuto;
import org.usfirst.frc.team5542.robot.commands.auto.line.*;
import org.usfirst.frc.team5542.robot.commands.auto.middle.MiddleForwardAuto;
import org.usfirst.frc.team5542.robot.commands.auto.right.TurnRightAuto;
import org.usfirst.frc.team5542.robot.commands.auto.util.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public abstract class AutoBase extends CommandBase {
	static HashMap<String, Integer> command = new HashMap<String, Integer>();
	public AutoBase(){
		
	}
	
	public void startCommandGroup(String name){
		command.put(name, 0);
		AutoCommandGroup group = AutoCommandGroup.getCommandGroup(name);
		group.getCommands().get(0).start();
	}
	
	public void executeNextCommand(String name){
		SmartDashboard.putString("Command Group name: ", name);
		int pos = command.get(name);
		AutoCommandGroup group = AutoCommandGroup.getCommandGroup(name);
		Command cmd = group.getCommands().get(pos + 1);
		SmartDashboard.putData("Auto command to run: ", cmd);
		SmartDashboard.putNumber("Auto pos: ", pos);
		SmartDashboard.putNumber("Array Max", command.size());
		cmd.start();
		command.put(name, pos + 1);
	}
	
	public static void defineGroups(){
		ArrayList<Command> middleCommands = new ArrayList<Command>();
		AutoCommandGroup middle = new AutoCommandGroup();
		middleCommands.add(new MiddleForwardAuto());
		middleCommands.add(new KickAuto("middle"));
		middleCommands.add(new BackwardAuto());
		middle.createCommandGroup("middle", middleCommands);
		
		/*(AutoCommandGroup left = new AutoCommandGroup("left");
		left.addCommand(new FirstForwardAuto("left"));
		left.addCommand(new TurnLeftAuto());
		left.addCommand(new SecondForwardAuto("left"));
		left.addCommand(new KickAuto("left"));
		left.addCommand(new BackwardAuto());
		left.finilizeGroup();
		
		AutoCommandGroup right = new AutoCommandGroup("right");
		right.addCommand(new FirstForwardAuto("right"));
		right.addCommand(new TurnRightAuto());
		right.addCommand(new SecondForwardAuto("right"));
		right.addCommand(new KickAuto("right"));
		right.addCommand(new BackwardAuto());
		right.finilizeGroup();
		*/
		ArrayList<Command> lineCommands = new ArrayList<Command>();
		AutoCommandGroup line = new AutoCommandGroup();
		lineCommands.add(new LineForwardAuto());
		line.createCommandGroup("line", lineCommands);
	}
}
