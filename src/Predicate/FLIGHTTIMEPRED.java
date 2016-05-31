/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.TIMEMOD;
import Token.WHQUERY;

/**
 *
 * @author Phuo
 */
public class FLIGHTTIMEPRED extends PRED{
    public FLIGHTTIMEPRED(){
        type = Helper.Constant.FLIGHTTIMEPRED;
    }
    public WHQUERY query;
    public TIMEMOD time;
    
    @Override
    public String toString(){
        if (query != null){
            return "("+query.getSem()+" "+this.var+")";
        } else {
            return "("+time.getSem()+" "+this.var+" \""+time.getValue()+"\")";
        }
    }
}
