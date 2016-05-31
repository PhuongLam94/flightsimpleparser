/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.TO;

/**
 *
 * @author Phuo
 */
public class FLIGHTDEST1 extends FLIGHTDEST{
    public FLIGHTDEST1(){
        type = Helper.Constant.FLIGHTDEST1;
        
    }
    public TO to;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTDEST+"("+to.toString()+" "+cityNP.toString()+")";
    }
}
