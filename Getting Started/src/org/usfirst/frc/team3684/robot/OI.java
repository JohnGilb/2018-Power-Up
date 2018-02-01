/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3684.robot;

import org.usfirst.frc.team3684.robot.commands.ClawIntake;
import org.usfirst.frc.team3684.robot.commands.ClawOutput;
import org.usfirst.frc.team3684.robot.commands.ClimbWithLift;
import org.usfirst.frc.team3684.robot.commands.MoveLiftDOWN;
import org.usfirst.frc.team3684.robot.commands.MoveLiftUP;
import org.usfirst.frc.team3684.robot.commands.Turnleft;
import org.usfirst.frc.team3684.robot.commands.Turnright;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	
	public Joystick m_leftstick= new Joystick(RobotMap.LEFT_JOYSTICK_USB_PORT_0);
	public Joystick m_rightstick= new Joystick(RobotMap.RIGHT_JOYSTICK_USB_PORT_1);
	//Joysticks here
	
	
	
	public OI() {
	//creating buttons
	Button left_trigger= new JoystickButton(m_leftstick, RobotMap.CLAWBUTTONclose);
	Button leftbutton5= new JoystickButton (m_leftstick, RobotMap.Turn_Left);
	Button leftbutton1= new JoystickButton (m_leftstick, RobotMap.CLAWBUTTONopen);
	Button rightbutton3 = new JoystickButton (m_rightstick, RobotMap.Climb);
	Button rightbutton0 = new JoystickButton (m_rightstick, RobotMap.ForkliftUp);
	Button right_trigger= new JoystickButton (m_rightstick, RobotMap.ForkliftDown);
	Button rightbutton5= new JoystickButton (m_rightstick, RobotMap.Turn_Right);
	//binding buttons to commands
	left_trigger.whileHeld(new ClawOutput());
	leftbutton5.whileHeld(new Turnleft());
	rightbutton0.whileHeld(new MoveLiftUP());
	right_trigger.whileHeld(new MoveLiftDOWN());
	rightbutton5.whileHeld(new Turnright());
	rightbutton3.whileHeld(new ClimbWithLift());
	//these are all held, so commands will run until you let go. 
	
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
