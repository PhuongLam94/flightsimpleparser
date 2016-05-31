/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nplparser;

import ASTTree.ASTNODE;
import ASTTree.CITYNP1;
import ASTTree.CITYNP2;
import ASTTree.FLIGHTCNP1;
import ASTTree.FLIGHTCNP2;
import ASTTree.FLIGHTDEST1;
import ASTTree.FLIGHTDEST2;
import ASTTree.FLIGHTNP1;
import ASTTree.FLIGHTNP2;
import ASTTree.FLIGHTTIME;
import ASTTree.FLIGHTVP2;
import ASTTree.S;
import Helper.Constant;
import static Helper.Constant.FLIGHTCNP2;
import static Helper.Constant.FLIGHTCNPPRED;
import static Helper.Constant.FLIGHTDESTPRED;
import static Helper.Constant.FLIGHTTIMEPRED;
import Helper.GetVar;
import Predicate.CITYNPPRED;
import Predicate.FLIGHTCNPPRED;
import Predicate.FLIGHTDESTPRED;
import Predicate.FLIGHTNPRED;
import Predicate.FLIGHTTIMEPRED;
import Predicate.FLIGHTVPRED;

/**
 *
 * @author Phuo
 */
public class SematicParser {
    public static FLIGHTVPRED SematicParser(S s){
        FLIGHTVPRED pred = new FLIGHTVPRED();
        pred.verb = s.flightVP.flightV;
        FLIGHTNPRED subject;
        FLIGHTTIMEPRED prep=null;
        
        subject = new FLIGHTNPRED();
        subject.det = s.flightNP.getType().equals(Constant.FLIGHTNP2)?null:((FLIGHTNP1)s.flightNP).det;
        subject.flightcnp = parseFlightCNPPred(s);
        
        if (s.query.getValue().equals("Which")){
           subject.query = s.query;
           if (s.flightVP.getType().equals(Constant.FLIGHTVP2)){
               FLIGHTTIME flightTime = ((FLIGHTVP2)s.flightVP).flightTIME;
               prep = new FLIGHTTIMEPRED();
               prep.time = flightTime.timeMOD;
           } 
        } else {
            prep = new FLIGHTTIMEPRED();
            prep.query = s.query;            
        }
        pred.flighttime = prep;
        pred.subject = subject;
        return pred;
    }
    private static FLIGHTCNPPRED parseFlightCNPPred(S s){
        FLIGHTCNPPRED flightCNPPred = new FLIGHTCNPPRED();
           if (s.flightNP.flightCNP.getType().equals(Constant.FLIGHTCNP1)){
               flightCNPPred.noun = ((FLIGHTCNP1)s.flightNP.flightCNP).flightN ;
           } else {
               FLIGHTCNP2 temp = (FLIGHTCNP2)s.flightNP.flightCNP;
               flightCNPPred.noun = ((FLIGHTCNP1)temp.flightCNP).flightN;
               FLIGHTDESTPRED flightDestPred = new FLIGHTDESTPRED();
               flightDestPred.prep = temp.flightDEST.getType().equals(Constant.FLIGHTDEST1)?((FLIGHTDEST1)temp.flightDEST).to:((FLIGHTDEST2)temp.flightDEST).foR;
               
               CITYNPPRED cityNPPred = new CITYNPPRED();
               cityNPPred.cityn = temp.flightDEST.cityNP.cityN;
               if (temp.flightDEST.cityNP.getType().equals(Constant.CITYNP1)){
                   CITYNP1 temp1 = (CITYNP1)temp.flightDEST.cityNP;
                   cityNPPred.name = temp1.cityNAME;
               } else {
                   CITYNP2 temp2 = (CITYNP2)temp.flightDEST.cityNP;
                   cityNPPred.det = temp2.det;
               }
               flightDestPred.citynp = cityNPPred;
               flightCNPPred.dest = flightDestPred;
           }
           return flightCNPPred;
    }
}
