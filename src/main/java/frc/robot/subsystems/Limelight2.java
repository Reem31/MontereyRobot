/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard; 
import edu.wpi.first.networktables.NetworkTable; 
import edu.wpi.first.networktables.NetworkTableEntry; 
import edu.wpi.first.networktables.NetworkTableInstance; 

public class Limelight2 extends Subsystem{
  NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
  NetworkTableEntry tx = null;
  NetworkTableEntry ty = null;
  NetworkTableEntry ta = null;
  NetworkTableEntry tv = null;
  NetworkTableEntry thor = null;
  NetworkTableEntry tvert = null;

  public NetworkTableEntry ledMode = null;
  public NetworkTableEntry camMode = null;
  public NetworkTableEntry pipeline = null;
  public NetworkTableEntry stream = null;



public void UpdateTable(){
  tx = table.getEntry("tx");
ta = table.getEntry("ta");
ledMode = table.getEntry("ledMode");
camMode = table.getEntry("camMode");

}
public void updateData(){
  double x = tx.getDouble(0.0);
  double y = ty.getDouble(0.0);
  double area = ta.getDouble(0.0);
  double target = tv.getDouble(0.0);
  double tHorizontal = thor.getDouble(0.0);
  double tVertical = tvert.getDouble(0.0);
  System.out.print("Horizontal Error: " + x);
  System.out.print(" Vertical Error: " + y);
  System.out.print(" Area: " + area);
  System.out.print(" Target Status: " + target);
  System.out.print(" Thor: " + tHorizontal);
  System.out.println(" Tvert: " + tVertical);}

/**
 * Add your docs here.
 */
 

@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}}