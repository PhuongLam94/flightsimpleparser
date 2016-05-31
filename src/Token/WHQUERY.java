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
public class WHQUERY extends TOKEN {
    public WHQUERY(){
        type = Constant.WHQUERY;
        
    }
    @Override
    public String getSem(){
        if (getValue().equals("Which")){
            return Constant.WHICH;
        } else {
            return Constant.WHO;
        }
    }
}
