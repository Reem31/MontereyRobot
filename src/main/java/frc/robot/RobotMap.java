/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import java.io.IOException;
import java.nio.file.Paths;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.trajectory.Trajectory;
import edu.wpi.first.wpilibj.trajectory.TrajectoryConfig;
import edu.wpi.first.wpilibj.trajectory.TrajectoryUtil;
import edu.wpi.first.wpilibj.util.Units;
import edu.wpi.first.wpilibj2.command.RamseteCommand;
import robotDrive.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static int leftMotorMaster = 1;
  public static int rightMotorMaster = 2;
  public static int leftMotorFollower = 3;
  public static int rightMotorFollower = 4;

  // to be moved into robot container

  public void getAutonomousCommand() {
    final TrajectoryConfig Config = new TrajectoryConfig(Units.feetToMeters(1), Units.feetToMeters(1));

    try {
      final Trajectory trajectory = TrajectoryUtil
          .fromPathweaverJson(Paths.get("/home/lvuser/deploy/paths/SimplePath.wpilib.Json"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }}


 /* RamseteCommand Command; 
   Command = new Ramsetecommand(  
   trajectory, 
   robotDrive:: getPose,
   new RamseteController(0.0, 0.0)

  /* robotDrive.FeedForward()
  robotDrive.getKinematics()
robotDrive::getWheelSpeeds, 
robotDrive.getPIDController() 
robotDrive :: setOutput,)*/
  

