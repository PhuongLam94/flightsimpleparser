/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.PTIME;

/**
 *
 * @author Phuo
 */
public class FLIGHTTIME2 extends FLIGHTTIME{
    public FLIGHTTIME2(){
        type = Helper.Constant.FLIGHTTIME2;
    }
    public PTIME pTime;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTTIME+"("+pTime.toString()+" "+timeMOD.toString()+")";
    }
}
