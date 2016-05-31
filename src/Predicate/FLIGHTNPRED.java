/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.DET;
import Token.WHQUERY;

/**
 *
 * @author Phuo
 */
public class FLIGHTNPRED extends PRED{
    public FLIGHTNPRED(){
        type = Helper.Constant.FLIGHTNPRED;
    }
    public DET det;
    public WHQUERY query;
    public FLIGHTCNPPRED flightcnp;
    
    public String toString(){
        if (det == null){
            if (query == null){
                return flightcnp.toString();
            } else{
                return "("+query.getSem()+" "+flightcnp.getVar()+" "+flightcnp.toString()+")";
            }
        } else {
            return "<"+det.getSem()+" "+flightcnp.getVar()+" "+flightcnp.toString()+">";
        }
    }
    
}
