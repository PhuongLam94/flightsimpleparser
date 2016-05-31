/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Helper.Constant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phuo
 */
public class PRINTALLPROC extends PROCEDURE{
    public PRINTALLPROC(){
        type = Constant.PRINTALL;
    }
    public String resultType;
    public FLIGHTPROC query;
    
    public List<String> getResult(List<FLIGHTPROC> db){
        List<String> result = new ArrayList<>();
        for (FLIGHTPROC proc:db){
            if ((query.flightNo == null || proc.flightNo.equals(query.flightNo)) && 
                    (query.atTime.city == null || proc.atTime.city.equals(query.atTime.city)) &&
                    (query.atTime.time == null || proc.atTime.time.equals(query.atTime.time)) &&
                    (query.dTime.city == null || proc.dTime.city.equals(query.dTime.city)) &&
                    (query.dTime.time == null || proc.dTime.time.equals(query.dTime.time))){
                switch (resultType){
                    case "flightNo":
                        result.add(proc.flightNo);
                        break;
                    case "atTime":
                        result.add(proc.atTime.time);
                        break;
                    case "dTime":
                        result.add(proc.dTime.time);
                        break;
                }
            }
        }
        return result;
    }
    
    @Override
    public String toString(){
        return "("+Constant.PRINTALL+" "+(resultType.equals("flightNo")?"?f":(resultType.equals("atTime")?"?t1":"?t2"))+" "+query.toString()+")";
    }
}
