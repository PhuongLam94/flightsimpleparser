/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Token.CITYN;
import Token.CITYNAME;
import Token.DET;

/**
 *
 * @author Phuo
 */
public class CITYNPPRED extends PRED{
    public CITYNPPRED(){
        type = Helper.Constant.CITYNPPRED;
    }
    public DET det;
    public CITYNAME name;
    public CITYN cityn;
    
    @Override
    public String toString(){
        if (det == null){
            return "(&("+name.getSem()+" "+this.var+" \""+name.getValue()+"\")"+"("+cityn.getSem()+" "+this.var+"))";
        } else {
            return "<"+det.getSem()+" "+this.var+" "+"("+cityn.getSem()+" "+this.var+")>";
        }
    }
}
