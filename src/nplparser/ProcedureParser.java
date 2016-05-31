/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nplparser;

import Helper.Constant;
import Predicate.FLIGHTVPRED;
import Procedure.FLIGHTPROC;
import Procedure.PRINTALLPROC;

/**
 *
 * @author Phuo
 */
public class ProcedureParser {
    public static PRINTALLPROC procedureParser(FLIGHTVPRED pred){
        PRINTALLPROC proc = new PRINTALLPROC();
        proc.query = new FLIGHTPROC();
        if (pred.subject.query!=null){
            proc.resultType="flightNo";
            if (pred.flighttime!=null){
               if (pred.verb.getSem().equals(Constant.ARRIVE)){
                   proc.query.atTime.time = pred.flighttime.time.getValue();
               } else {
                   proc.query.dTime.time = pred.flighttime.time.getValue();
               }
            }
            if (pred.subject.flightcnp.dest!=null && pred.subject.flightcnp.dest.citynp.name!=null){
                proc.query.atTime.city = pred.subject.flightcnp.dest.citynp.name.getValue();
            }
        } else {
            if (pred.verb.getSem().equals(Constant.ARRIVE)){
                proc.resultType="atTime";
            } else {
                proc.resultType="dTime";
            }
            if (pred.subject.flightcnp.dest!=null && pred.subject.flightcnp.dest.citynp.name!=null){
                proc.query.atTime.city = pred.subject.flightcnp.dest.citynp.name.getValue();
            }
        }
        return proc;
    }
}
