/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

/**
 *
 * @author Phuo
 */
public class FLIGHTVP1 extends FLIGHTVP{
    public FLIGHTVP1(){
        type = Helper.Constant.FLIGHTVP1;
    }
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTVP+"("+flightV.toString()+")";
    }
}
