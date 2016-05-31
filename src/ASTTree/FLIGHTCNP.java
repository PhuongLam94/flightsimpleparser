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
public class FLIGHTCNP extends ASTNODE{
    public FLIGHTCNP(){
        type = Helper.Constant.FLIGHTCNP;
    }
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.FLIGHTCNP1)){
            return ((FLIGHTCNP1)this).toString();
        } else {
            return ((FLIGHTCNP2)this).toString();
        }
    }
}
