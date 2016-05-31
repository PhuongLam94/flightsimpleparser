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
public class FLIGHTCNP2 extends FLIGHTCNP{
    public FLIGHTCNP2(){
        type = Helper.Constant.FLIGHTCNP2;
    }
    public FLIGHTCNP flightCNP;
    public FLIGHTDEST flightDEST;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTCNP+"("+flightCNP.toString()+" "+flightDEST.toString()+")";
    }
}
