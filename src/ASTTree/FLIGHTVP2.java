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
public class FLIGHTVP2 extends FLIGHTVP{
    public FLIGHTVP2(){
        type = Helper.Constant.FLIGHTVP2;
    }
    public FLIGHTTIME flightTIME;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTVP+"("+flightV.toString()+" "+flightTIME.toString()+")";
    }
}
