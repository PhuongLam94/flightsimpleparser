/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.FLIGHTN;

/**
 *
 * @author Phuo
 */
public class FLIGHTCNPPRED extends PRED{
    public FLIGHTCNPPRED(){
        type = Helper.Constant.FLIGHTCNPPRED;
    }
    public FLIGHTN noun;
    public FLIGHTDESTPRED dest;
    
    @Override
    public String toString(){
        if (dest == null){
            return "("+noun.getSem()+" "+this.var+")";
        } else {
            return "&(("+noun.getSem()+" "+this.var+")"+dest.reduceLamda(this.var)+")";
        }
    }
}
