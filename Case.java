/*
 * Copyright (c) 2018 GNU General Public Liscense v3.0
 * All rights reserved.
 */
package dealornodeal;

/**
 *
 * @author Madeline Swaim
 */
public class Case {
    private double cValue;
    private boolean cOpened;
    private boolean cSelected;
    
    public Case(double val){
        cValue = val;
        cOpened = false;
        cSelected = false;
    }
    
    public Case(double val, boolean play){
        cValue = val;
        cOpened = false;
        cSelected = play;
    }
    
    public Case(){
        cValue = 0;
        cOpened = false;
        cSelected = false;
    }
    
    public void setValue(int val){
        cValue = val;
    }
    
    public double getValue(){
        return cValue;
    }
    
    public void openCase(){
        cOpened = true;
        Opening.calcAverage();
    }
    
    public boolean isCaseOpen(){
        return cOpened;
    }
    
    public void setAsPlayerCase(){
        cSelected = true;
    }
    
    public boolean isThisPlayersCase(){
        return cSelected;
    }
    
    public void resetCase(){
        cOpened = false;
        cSelected = false;
        cValue = 0.0;
    }
    
    public void resetCase(double val){
        cOpened = false;
        cSelected = false;
        cValue = val;
    }
    
}
