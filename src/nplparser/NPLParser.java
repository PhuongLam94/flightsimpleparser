/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nplparser;

import ASTTree.S;
import Predicate.FLIGHTVPRED;
import Procedure.FLIGHTPROC;
import Procedure.PRINTALLPROC;
import Token.TOKEN;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Phuo
 */
public class NPLParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter your sentence: ");
        String s = reader.nextLine();
        System.out.println("=======================");
        System.out.println("Stage 1: Parse to token");
        Lexicer lexicer = new Lexicer();
        List<TOKEN> lstToken = lexicer.Lexicer(s);
        if (lstToken == null){
            System.out.println("Failed");
        } else {
            System.out.println("Successful");
            lstToken.stream().forEach((t) -> {
                System.out.print(t.getType()+" ");
            });
            
            System.out.println("\n=======================");
            System.out.println("Stage 2: Parse to AST TREE");
            Parser parser = new Parser(lstToken);
            S sentence = parser.Parser();
            if (s == null){
                System.out.println("Failed");
            } else {
                System.out.println("Successful");
                System.out.println(sentence.toString());
                System.out.println("\n=======================");
                System.out.println("Stage 3: Parse to predicate");
                FLIGHTVPRED pred = SematicParser.SematicParser(sentence);
                System.out.println(pred.toString());
                System.out.println("\n=======================");
                System.out.println("Stage 4: Parse to procedure");
                PRINTALLPROC proc = ProcedureParser.procedureParser(pred);
                System.out.println(proc.toString());
                System.out.println("\n=======================");
                System.out.println("Stage 5: Answer question");
                List<FLIGHTPROC> db = Database.Database.getDatatbase();
                List<String> result = proc.getResult(db);
                System.out.println(result.toString());
            }
        }
    }
    
}
