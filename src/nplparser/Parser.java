/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nplparser;

import ASTTree.CITYNP;
import ASTTree.CITYNP1;
import ASTTree.CITYNP2;
import ASTTree.FLIGHTCNP;
import ASTTree.FLIGHTCNP1;
import ASTTree.FLIGHTCNP2;
import ASTTree.FLIGHTDEST;
import ASTTree.FLIGHTDEST1;
import ASTTree.FLIGHTDEST2;
import ASTTree.FLIGHTNP;
import ASTTree.FLIGHTNP1;
import ASTTree.FLIGHTNP2;
import ASTTree.FLIGHTTIME;
import ASTTree.FLIGHTTIME1;
import ASTTree.FLIGHTTIME2;
import ASTTree.FLIGHTVP;
import ASTTree.FLIGHTVP1;
import ASTTree.FLIGHTVP2;
import ASTTree.S;
import Helper.Constant;
import Token.CITYN;
import Token.CITYNAME;
import Token.DET;
import Token.FLIGHTN;
import Token.FLIGHTV;
import Token.FOR;
import Token.PTIME;
import Token.TIMEMOD;
import Token.TO;
import Token.TOKEN;
import Token.WHQUERY;
import java.util.List;

/**
 *
 * @author Phuo
 */
public class Parser {

    List<TOKEN> lstToken;

    public Parser(List<TOKEN> lstToken) {
        this.lstToken = lstToken;
        
    }

    public S Parser() {
        S sentence = null;
        WHQUERY query = parseQuery();
        if (query == null){
            return null;
        } else {
            FLIGHTNP flightNP = parseFlightNP();
            if (flightNP == null){
                return null;
            } else {
                FLIGHTVP flightVP = parseFlightVP();
                if (flightVP == null || lstToken.size() > 0){
                    return null;
                } else {
                    sentence = new S();
                    sentence.query = query;
                    sentence.flightNP = flightNP;
                    sentence.flightVP = flightVP;
                }
            }
        }
        return sentence;
    }

    private WHQUERY parseQuery() {
        WHQUERY query = null;

        if (lstToken.get(0).getType().equals(Constant.WHQUERY)) {
            query = (WHQUERY) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private CITYN parseCityN() {
        CITYN query = null;

        if (lstToken.get(0).getType().equals(Constant.CITYN)) {
            query = (CITYN) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private CITYNAME parseCityName() {
        CITYNAME query = null;

        if (lstToken.get(0).getType().equals(Constant.CITYNAME)) {
            query = (CITYNAME) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private DET parseDet() {
        DET query = null;

        if (lstToken.get(0).getType().equals(Constant.DET)) {
            query = (DET) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private FLIGHTN parseFlightN() {
        FLIGHTN query = null;

        if (lstToken.get(0).getType().equals(Constant.FLIGHTN)) {
            query = (FLIGHTN) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private FLIGHTV parseFlightV() {
        FLIGHTV query = null;

        if (lstToken.get(0).getType().equals(Constant.FLIGHTV)) {
            query = (FLIGHTV) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private FOR parseFor() {
        FOR query = null;

        if (lstToken.get(0).getType().equals(Constant.FOR)) {
            query = (FOR) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private PTIME parsePTime() {
        PTIME query = null;
        if (lstToken.get(0).getType().equals(Constant.PTIME)) {
            query = (PTIME) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private TIMEMOD parseTimeMod() {
        TIMEMOD query = null;

        if (lstToken.get(0).getType().equals(Constant.TIMEMOD)) {
            query = (TIMEMOD) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private TO parseTo() {
        TO query = null;
        if (lstToken.get(0).getType().equals(Constant.TO)) {
            query = (TO) lstToken.get(0);
            lstToken.remove(0);
        }
        return query;
    }

    private FLIGHTNP parseFlightNP() {
        FLIGHTNP flightNP = parseFlightNP1();
        if (flightNP == null) {
            flightNP = parseFlightNP2();
        }
        return flightNP;
    }

    private FLIGHTNP1 parseFlightNP1() {
        FLIGHTNP1 flightNP1 = null;
        DET det = parseDet();
        if (det == null){
            return null;
        } else {
            FLIGHTCNP flightCNP = parseFlightCNP();
            if (flightCNP == null){
                return null;
            } else {
                flightNP1 = new FLIGHTNP1();
                flightNP1.flightCNP = flightCNP;
                flightNP1.det = det;
            }
        }
        return flightNP1;
    }

    private FLIGHTNP2 parseFlightNP2() {
        FLIGHTNP2 flightNP2 = null;
        FLIGHTCNP flightCNP = parseFlightCNP();
        if (flightCNP == null){
            return null;
        } else {
            flightNP2 = new FLIGHTNP2();
            flightNP2.flightCNP = flightCNP;
        }
        return flightNP2;
    }

    private FLIGHTCNP parseFlightCNP() {
        FLIGHTCNP flightCNP = parseFlightCNP2();
        if (flightCNP == null) {
            return null;
        } else {
            FLIGHTDEST flightDEST = parseFlightDEST();
            while (flightDEST!=null){
                FLIGHTCNP2 temp = new FLIGHTCNP2();
                temp.flightCNP = flightCNP;
                temp.flightDEST = flightDEST;
                flightCNP = temp;
                flightDEST = parseFlightDEST();
            }
        }
        return flightCNP;
    }

    
    private FLIGHTCNP1 parseFlightCNP2() {
        FLIGHTCNP1 flightCNP1 = null;
        FLIGHTN flightN = parseFlightN();
        if (flightN == null){
            return null;
        } else {
            flightCNP1 = new FLIGHTCNP1();
            flightCNP1.flightN = flightN;
        }
        return flightCNP1;
    }

    private FLIGHTTIME parseFlightTIME() {
        FLIGHTTIME flightTIME = parseFlightTIME1();
        if (flightTIME == null) {
            flightTIME = parseFlightTIME2();
        }
        return flightTIME;
    }

    private FLIGHTTIME1 parseFlightTIME2() {
        FLIGHTTIME1 flightTIME1 = null;
        TIMEMOD timeMOD = parseTimeMod();
        if (timeMOD == null){
            return null;
        } else {
            flightTIME1 = new FLIGHTTIME1();
            flightTIME1.timeMOD = timeMOD;
        }
        return flightTIME1;
    }

    private FLIGHTTIME2 parseFlightTIME1() {
        FLIGHTTIME2 flightTIME2 = null;
        PTIME pTIME = parsePTime();
        if (pTIME == null){
            return null;
        } else {
            TIMEMOD timeMOD = parseTimeMod();
        if (timeMOD == null){
            return null;
        } else {
            flightTIME2 = new FLIGHTTIME2();
            flightTIME2.timeMOD = timeMOD;
            flightTIME2.pTime = pTIME;
        }
        }
        
        return flightTIME2;
    }

    private FLIGHTVP parseFlightVP() {
        FLIGHTVP flightVP = parseFlightVP2();
        if (flightVP == null) {
            return null;
        } else {
            if (lstToken.size() > 0){
                
            FLIGHTTIME flightTIME = parseFlightTIME();
            if (flightTIME!=null){
                FLIGHTVP2 temp = new FLIGHTVP2();
                temp.flightV = flightVP.flightV;
                temp.flightTIME = flightTIME;
                flightVP = temp;
            } else {
                return null;
            }
            }
        }
        return flightVP;
    }

    
    private FLIGHTVP1 parseFlightVP2() {
        FLIGHTVP1 flightVP1 = null;
        FLIGHTV flightV = parseFlightV();
        if (flightV == null) {
            return null;
        } else {
            flightVP1 = new FLIGHTVP1();
            flightVP1.flightV = flightV;
        }
        return flightVP1;
    }

    private CITYNP parseCityNP() {
        CITYNP cityNP = parseCityNP1();
        if (cityNP == null) {
            cityNP = parseCityNP2();
        }
        return cityNP;
    }

    private CITYNP1 parseCityNP1() {
        CITYNP1 cityNP1 = null;
        CITYNAME cityNAME = parseCityName();
        if (cityNAME == null) {
            return null;
        } else {
            CITYN cityN = parseCityN();
            if (cityN == null) {
                return null;
            } else {
                cityNP1 = new CITYNP1();
                cityNP1.cityN = cityN;
                cityNP1.cityNAME = cityNAME;
            }
        }
        return cityNP1;
    }

    private CITYNP2 parseCityNP2() {
        CITYNP2 cityNP2 = null;
        DET det = parseDet();
        if (det == null) {
            return null;
        } else {
            CITYN cityN = parseCityN();
            if (cityN == null) {
                return null;
            } else {
                cityNP2 = new CITYNP2();
                cityNP2.cityN = cityN;
                cityNP2.det = det;
            }
        }
        return cityNP2;
    }

    private FLIGHTDEST parseFlightDEST() {
        FLIGHTDEST flightDEST = parseFlightDEST1();
        if (flightDEST == null) {
            flightDEST = parseFlightDEST2();
        }
        return flightDEST;
    }

    private FLIGHTDEST1 parseFlightDEST1() {
        FLIGHTDEST1 flightDEST1 = null;
        TO to = parseTo();
        if (to == null) {
            return null;
        } else {
            CITYNP cityNP = parseCityNP();
            if (cityNP == null) {
                return null;
            } else {
                flightDEST1 = new FLIGHTDEST1();
                flightDEST1.to = to;
                flightDEST1.cityNP = cityNP;
            }
        }
        return flightDEST1;
    }

    private FLIGHTDEST2 parseFlightDEST2() {
        FLIGHTDEST2 flightDEST2 = null;
        FOR foR = parseFor();
        if (foR == null) {
            return null;
        } else {
            CITYNP cityNP = parseCityNP();
            if (cityNP == null) {
                return null;
            } else {
                flightDEST2 = new FLIGHTDEST2();
                flightDEST2.foR = foR;
                flightDEST2.cityNP = cityNP;
            }
        }
        return flightDEST2;
    }
}
