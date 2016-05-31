/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.FLIGHTV;

/**
 *
 * @author Phuo
 */
public class FLIGHTVPRED extends PRED{
    public FLIGHTVPRED(){
        type = Helper.Constant.FLIGHTVPRED;
    }
    public FLIGHTV verb;
    public FLIGHTNPRED subject;
    public FLIGHTTIMEPRED flighttime;
    
    @Override
    public String toString(){
        return "("+verb.getSem()+" "+this.var+" "+subject.toString()+" "+((flighttime!=null)?flighttime.toString():"")+")";
    }
}
