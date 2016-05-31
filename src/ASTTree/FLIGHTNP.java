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
public class FLIGHTNP extends ASTNODE{
    public FLIGHTNP(){
        type = Helper.Constant.FLIGHTNP;
    }
    public FLIGHTCNP flightCNP;
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.FLIGHTNP1)){
            return ((FLIGHTNP1)this).toString();
        } else {
            return ((FLIGHTNP2)this).toString();
        }
    }
}
