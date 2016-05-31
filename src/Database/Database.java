/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Procedure.FLIGHTPROC;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phuo
 */
public class Database {
    public static List<FLIGHTPROC> db = null;
    public static List<FLIGHTPROC> getDatatbase(){
        if (db==null){
            db = new ArrayList<>();
            FLIGHTPROC temp;
            
            temp = new FLIGHTPROC();
            temp.flightNo="F1";
            temp.atTime.city="Hue";
            temp.atTime.time="17:00HR";
            temp.dTime.city="Ho Chi Minh";
            temp.dTime.time = "15:00HR";
            db.add(temp);
            
            temp = new FLIGHTPROC();
            temp.flightNo="F2";
            temp.atTime.city="Ho Chi Minh";
            temp.atTime.time="16:00HR";
            temp.dTime.city="Hue";
            temp.dTime.time = "14:30HR";
            db.add(temp);
            
            temp = new FLIGHTPROC();
            temp.flightNo="F3";
            temp.atTime.city="Hue";
            temp.atTime.time="20:00HR";
            temp.dTime.city="Ho Chi Minh";
            temp.dTime.time = "18:30HR";
            db.add(temp);
            
            temp = new FLIGHTPROC();
            temp.flightNo="F1";
            temp.atTime.city="Ho Chi Minh";
            temp.atTime.time="10:00HR";
            temp.dTime.city="Hue";
            temp.dTime.time = "8:30HR";
            db.add(temp);           
        }
        return db;
    }
}
