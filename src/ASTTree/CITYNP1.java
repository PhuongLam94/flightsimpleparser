/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.CITYNAME;

/**
 *
 * @author Phuo
 */
public class CITYNP1 extends CITYNP{
    public CITYNP1(){
        type = Helper.Constant.CITYNP1;
    }
    public CITYNAME cityNAME;
    @Override
    public String toString(){
        return Helper.Constant.CITYNP+"("+cityNAME.toString()+" "+cityN.toString()+")";
    }
}
