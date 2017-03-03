package org.usfirst.frc.team5542.robot.commands.auto;

import java.util.ArrayList;
import java.util.HashMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoCommandGroup {
	private ArrayList<Command> commands;
	private String name;
	
	/*public AutoCommandGroup(String name){
		*commands = new ArrayList<Command>();
		*this.name = name;
	*}
	*/
	static HashMap<String, AutoCommandGroup> groups = new HashMap<String, AutoCommandGroup>();
	
	public ArrayList<Command> getCommands(){
		return commands;
	}
	
	public static AutoCommandGroup getCommandGroup(String name){
		return groups.get(name);
	}
	
	public void addCommand(Command command){
		commands.add(command);
	}
	
	public void finilizeGroup(){
		groups.put(name, this);
	}
	
	public void createCommandGroup(String name, ArrayList<Command> commands){
		this.name = name;
		this.commands = commands;
		groups.put(name, this);
	}
	
}
