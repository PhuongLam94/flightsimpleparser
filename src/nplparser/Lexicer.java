/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nplparser;

import static Helper.Constant.CITYN;
import static Helper.Constant.DET;
import static Helper.Constant.TO;
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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phuo
 */
public class Lexicer {
    public List<TOKEN> Lexicer(String source){
        List<TOKEN> lstToken = new ArrayList<>();
        String[] lstString = source.split(" ");
        for (int i=0; i<lstString.length; i++){
            TOKEN token = null;
            switch (lstString[i]){
                case "What":
                    if (lstString[i+1].equals("time") && lstString[i+2].equals("does")){
                        token = new WHQUERY();
                        token.setValue("What time does");
                        i+=2;
                        break;
                    } else {
                        return null;
                    }
                case "When":
                    if (lstString[i+1].equals("does")){
                        token = new WHQUERY();
                        token.setValue("When does");
                        i++;
                        break;
                    } else {
                        return null;
                    }
                case "Which":
                    token = new WHQUERY();
                    token.setValue("Which");
                    break;
                case "the":
                    token = new DET();
                    token.setValue("the");
                    break;
                case "flight":
                    token = new FLIGHTN();
                    token.setValue("flight");
                    break;
                case "at":
                case "on":
                case "in":
                    token = new PTIME();
                    token.setValue(lstString[i]);
                    break;
                case "city":
                    token = new CITYN();
                    token.setValue("city");
                    break;
                case "arrives":
                case "leave":
                    token = new FLIGHTV();
                    token.setValue(lstString[i]);
                    break;
                case "Ho":
                    if (lstString[i+1].equals("Chi") && lstString[i+2].equals("Minh")){
                        token = new CITYNAME();
                        token.setValue("Ho Chi Minh");
                        i+=2;
                        break;
                    } else {
                        return null;
                    }
                case "Hue":
                    token = new CITYNAME();
                    token.setValue("Hue");
                    break;
                case "to":
                    token = new TO();
                    token.setValue("to");
                    break;
                case "for":
                    token = new FOR();
                    token.setValue("for");
                    break;
                case "?":
                    return lstToken;
                default:
                    if (lstString[i].matches("((1*[0-9])|(2*[0-3])):[0-5]*[0-9]HR")){
                        token = new TIMEMOD();
                        token.setValue(lstString[i]);
                    } else {
                        return null;
                    }
            }
            lstToken.add(token);
        }
        return lstToken;
    }
}
