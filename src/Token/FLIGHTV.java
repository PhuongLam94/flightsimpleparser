/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Token;

import Helper.Constant;
/**
 *
 * @author Phuo
 */
public class FLIGHTV extends TOKEN {
    public FLIGHTV(){
        type = Constant.FLIGHTV;
        
    }
    @Override
    public String getSem(){
        if (getValue().equals("arrives")){
            return Constant.ARRIVE;
        } else {
            return Constant.LEAVE;
        }
    }
}
