/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.SpeedController;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonFX;


/**
 * Add your docs here.
 * 
 * 
 * 
 * 
 */
public class Drivetrain extends Subsystem {

  WPI_TalonSRX m_leftFrontMotor = null; 
  WPI_TalonSRX m_rightFrontMotor = null; 
  WPI_TalonSRX m_leftRearMotor = null; 
  WPI_TalonSRX m_rightRearMotor = null; 
  DifferentialDrive differentialDrive = null; 
  



 public Drivetrain(){
  m_leftFrontMotor = new WPI_TalonSRX(RobotMap.leftMotorMaster); 
  m_rightFrontMotor = new WPI_TalonSRX(RobotMap.rightMotorMaster); 
  m_leftRearMotor = new WPI_TalonSRX(RobotMap.leftMotorFollower); 
  m_leftFrontMotor = new WPI_TalonSRX(RobotMap.leftMotorMaster); 

  SpeedControllerGroup m_right = new SpeedControllerGroup(m_rightFrontMotor, m_rightRearMotor);
  SpeedControllerGroup m_left = new SpeedControllerGroup(m_leftFrontMotor, m_leftRearMotor);  
  DifferentialDrive m_drive = new DifferentialDrive( m_left, m_right); 

  m_leftRearMotor.follow(m_leftFrontMotor); 
  m_rightRearMotor.follow(m_rightFrontMotor); 

  public static final stop(){
    m_leftFrontMotor(0.0); 
    m_rightFrontMotor(0.0); 
  }; //stops the motors 

  public void setDriveTrain(double speed, double turnspeed); 

  DifferentialDrive.arcadeDrive(throttleSpeed, turnSpeed);
  
  DifferentialDrive.arcadeDrive(throttleSpeed, turnSpeed); 
  
 }
  
  


  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
