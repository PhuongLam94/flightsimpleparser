/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author Phuo
 */
public class GetVar {
    public static int currentVar = 1;
    public static String getVar(){
        String varname = "var"+(currentVar>100?currentVar+"":((currentVar>10)?"0"+currentVar:"00"+currentVar));
        currentVar++;
        return varname;
    }
}
