/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


 /*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * Add your docs here.
 */
public class Conveyor extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  VictorSPX FrontConveyorMotor;
  VictorSPX BackConveyorMotor;
  Solenoid stopper;
  public static boolean close = false;
  public static boolean open = true;
  SpeedControllerGroup conveyorMotors;

  Solenoid intakeSol;
  VictorSPX leftIntakeMotor;
  VictorSPX rightIntakeMotor;
  public static boolean up = false;
  public static boolean down = true;
  SpeedControllerGroup intakeMotors;
  
  public Conveyor(){
    FrontConveyorMotor = new VictorSPX(Constants.topMotor);
    BackConveyorMotor = new VictorSPX(Constants.bottomMotor);
    BackConveyorMotor.setInverted(false);
    stopper = new Solenoid(Constants.stopper);

    intakeSol = new Solenoid(Constants.intakeSol);
    leftIntakeMotor = new VictorSPX(Constants.leftIntakeMotor);
    leftIntakeMotor.setInverted(false);
    rightIntakeMotor = new VictorSPX(Constants.rightIntakeMotor);

    BackConveyorMotor.follow(FrontConveyorMotor);
    leftIntakeMotor.follow(rightIntakeMotor);
  }

  public void setConveyorMotors(double speed){
    FrontConveyorMotor.set(ControlMode.PercentOutput, speed);
  }

  public void setStopper(boolean state){
    stopper.set(state);
  }

  public void setIntake(boolean state){
    intakeSol.set(state);
  }

  public void setIntakeMotors(double speed){
    rightIntakeMotor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}