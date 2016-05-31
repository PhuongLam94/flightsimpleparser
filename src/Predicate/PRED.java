/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Predicate;

import Helper.GetVar;

/**
 *
 * @author Phuo
 */
public class PRED {
    protected String type;
    protected String var;
    public String getType(){return this.type;}
    public PRED(){
        var = GetVar.getVar();
    }
    public String getVar() {return this.var;}
    public void setVar (String var){this.var = var;}
    
}
