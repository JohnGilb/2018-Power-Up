/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3684.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static final int LEFT_JOYSTICK_USB_PORT_0 = 0;
	public static final int RIGHT_JOYSTICK_USB_PORT_1 = 1;
	public static final int OPERATOR_JOYSTICK_USB_PORT_2 = 2;
	//initializing joysticks
	//public static final int CLAWBUTTONopen = 2;
	//public static final int CLAWBUTTONclose =1;
	//public static final int ForkliftUp =2;
	//public static final int ForkliftDown =1;
	//public static final int Climb = 3;
	public static final int Turn_Right = 5;
	public static final int Turn_Left = 4;
	public static final int Flip_Forward = 5;
	public static final int Flip_Backward = 3;
	public static final int ClawIntake = 2;
	public static final int ClawOutput = 1;
	//initializing buttons
	public static int DRIVETRAIN_Talon_LEFT = 2;
	public static int DRIVETRAIN_Talon_RIGHT = 3;
	public static int DRIVETRAIN_Talon_BACKLEFT = 0;
	public static int DRIVETRAIN_Talon_BACKRIGHT = 1;
	public static int LiftMotorUp = 4;
	public static int LiftMotorDown = 5;
	public static int ClawMotor1 = 6;
	public static int ClawMotor2 = 7;
	public static int FlipMotor = 0;
	//initializing Motor Controllers
	}

