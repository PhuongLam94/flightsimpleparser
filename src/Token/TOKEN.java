/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Token;


/**
 *
 * @author Phuo
 */
public class TOKEN {
    private String value;
    protected String type;
    protected String sem;
    
    public String getValue(){return this.value;}
    public void setValue(String value){this.value=value;}
    
    public String getType(){return this.type;}
    public String getSem(){return this.sem;}
    @Override
    public String toString(){
        return type+"("+value+")";
    }
}
