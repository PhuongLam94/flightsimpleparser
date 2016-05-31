/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.FLIGHTN;

/**
 *
 * @author Phuo
 */
public class FLIGHTCNP1 extends FLIGHTCNP{
    public FLIGHTCNP1(){
        type = Helper.Constant.FLIGHTCNP1;
    }
    public FLIGHTN flightN;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTCNP+"("+flightN.toString()+")";
    }
}
