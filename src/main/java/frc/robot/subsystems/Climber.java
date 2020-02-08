/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;



/**
 * Add your docs here.
 */
public class Climber extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
   


  DoubleSolenoid m_ClimberSolenoid;
  DoubleSolenoid m_ClimberSolenoidTwo; 

 m_ClimberSolenoid = new DoubleSolenoid(ClimbConstants.kforwardChannel, ClimbConstants.kreverseChannel); 
 public void popOff(){
m_ClimberSolenoidTwo = new DoubleSolenoid(ClimbConstants.kforwardChannel, ClimbConstants.kreverseChannel); 
  m_ClimberSolenoid.set(Value.kForward);
  m_ClimberSolenoidTwo.set(Value.kForward);
 }

public void RetractClimb(){

  m_ClimberSolenoid.set(Value.kReverse); 
  m_ClimberSolenoidTwo.set(Value.kReverse); 
}



 
    public void ClimbOff(){

      m_ClimberSolenoid.set(Value.kOff); 
      m_ClimberSolenoidTwo.set(Value.kOff); 

    }


    
  


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
