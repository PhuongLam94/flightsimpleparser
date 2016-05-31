/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTTree;

import Token.CITYNAME;
import Token.DET;

/**
 *
 * @author Phuo
 */
public class CITYNP2 extends CITYNP{
    public CITYNP2(){
        type = Helper.Constant.CITYNP2;
    }
    public DET det;
    @Override
    public String toString(){
        return Helper.Constant.CITYNP+"("+det.toString()+" "+cityN.toString()+")";
    }
}
