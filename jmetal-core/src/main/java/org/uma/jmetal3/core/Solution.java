package org.uma.jmetal3.core;

/**
 * Created by antonio on 03/09/14.
 */
public interface Solution {
  public void setObjective(int index, double value) ;
  public double getObjective(int index) ;

  public Object getVariable(int index) ;
  public void setVariable(int index, Object value) ;
 }
