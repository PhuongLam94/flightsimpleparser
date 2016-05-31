/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.TOKEN;

/**
 *
 * @author Phuo
 */
public class FLIGHTDESTPRED extends PRED{
    public FLIGHTDESTPRED(){
        type = Helper.Constant.FLIGHTDESTPRED;
    }
    public TOKEN prep;
    public CITYNPPRED citynp;
    
    public String reduceLamda(String var){
        return "("+ prep.getSem()+ " "+var+" "+citynp.toString()+ ")";
    }
}
