/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.WHQUERY;

/**
 *
 * @author Phuo
 */
public class S extends ASTNODE {
    public S(){
        type = Helper.Constant.S;
    }
    public WHQUERY query;
    public FLIGHTNP flightNP;
    public FLIGHTVP flightVP;
    @Override
    public String toString(){
        return "S("+query.toString()+" "+flightNP.toString()+" "+flightVP.toString()+")";
    }
}
