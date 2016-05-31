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
public class FLIGHTDEST extends ASTNODE{
    public FLIGHTDEST(){
        type = Helper.Constant.FLIGHTDEST;
        
    }
    public CITYNP cityNP;
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.FLIGHTDEST1)){
            return ((FLIGHTDEST1)this).toString();
        } else {
            return ((FLIGHTDEST2)this).toString();
        }
    }
}
