/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Helper.Constant;

/**
 *
 * @author Phuo
 */
public class FLIGHTPROC extends PROCEDURE{
    public FLIGHTPROC(){
        type = Constant.FLIGHTPROC;
    }
    public String flightNo;
    public TIMEPROC atTime = new TIMEPROC(Constant.ATTIME);
    public TIMEPROC dTime = new TIMEPROC(Constant.DTIME);
    
    @Override
    public String toString(){
        String noTemp = flightNo == null?"?f":flightNo;
        return "("+Constant.FLIGHT+" "+noTemp+") "+atTime.toStringS(noTemp)+" "+dTime.toStringS(noTemp);
    }
}
