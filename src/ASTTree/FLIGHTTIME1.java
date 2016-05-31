/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

/**
 *
 * @author Phuo
 */
public class FLIGHTTIME1 extends FLIGHTTIME{
    public FLIGHTTIME1(){
        type = Helper.Constant.FLIGHTTIME1;
    }
    @Override
    public String toString(){
        return Helper.Constant.FLIGHTTIME+"("+timeMOD.toString()+")";
    }
}
