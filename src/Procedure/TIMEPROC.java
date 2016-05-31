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
public class TIMEPROC extends PROCEDURE{
    public TIMEPROC(String type){
        this.type = type;
    }
    public String city;
    public String time;
    
    public String toStringS(String flightVar){
        return "("+type+" "+flightVar+" "+(city==null?(type.equals(Constant.ATTIME)?"?s1":"?s2"):city)+" "+(time==null?(type.equals(Constant.ATTIME)?"?t1":"?t2"):time)+")";
    }
}
