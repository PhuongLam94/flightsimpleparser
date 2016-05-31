/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.TIMEMOD;

/**
 *
 * @author Phuo
 */
public class FLIGHTTIME extends ASTNODE{
    public FLIGHTTIME(){
        type = Helper.Constant.FLIGHTTIME;
    }
    public TIMEMOD timeMOD;
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.FLIGHTTIME1)){
            return ((FLIGHTTIME)this).toString();
        } else {
            return ((FLIGHTTIME)this).toString();
        }
    }
}
