/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import static Helper.Constant.DET;
import Token.DET;

/**
 *
 * @author Phuo
 */
public class FLIGHTNP1 extends FLIGHTNP{
    public FLIGHTNP1(){
        type = Helper.Constant.FLIGHTNP1;
    }
    public DET det;
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTNP+"("+det.toString()+" "+flightCNP.toString()+")";
    }
}
