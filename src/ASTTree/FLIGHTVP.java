/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.FLIGHTV;

/**
 *
 * @author Phuo
 */
public class FLIGHTVP extends ASTNODE{
    public FLIGHTVP(){
        type = Helper.Constant.FLIGHTVP;
    }
    public FLIGHTV flightV;
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.FLIGHTVP1)){
            return ((FLIGHTVP1)this).toString();
        } else {
            return ((FLIGHTVP2)this).toString();
        }
    }
}
