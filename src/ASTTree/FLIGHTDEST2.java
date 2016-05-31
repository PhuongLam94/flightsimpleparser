/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.FOR;
import Token.TO;

/**
 *
 * @author Phuo
 */
public class FLIGHTDEST2 extends FLIGHTDEST{
    public FLIGHTDEST2(){
        type = Helper.Constant.FLIGHTDEST2;
        
    }
    public FOR foR;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTDEST+"("+foR.toString()+" "+cityNP.toString()+")";
    }
}
