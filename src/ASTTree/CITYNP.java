/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.CITYN;
import Token.FLIGHTV;

/**
 *
 * @author Phuo
 */
public class CITYNP extends ASTNODE{
    public CITYNP(){
        type = Helper.Constant.CITYNP;
    }
    public CITYN cityN;
    @Override
    public String toString(){
        if (type.equals(Helper.Constant.CITYNP1)){
            return ((CITYNP1)this).toString();
        } else {
            return ((CITYNP2)this).toString();
        }
    }
}
