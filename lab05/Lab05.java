package laboratorios.lab05;

import org.antlr.runtime.*;
import laboratorios.lab05.scanner.Lab05Scanner;

public class Lab05 {
    public static void main(String[] args) throws Exception{
        try{
            Lab05Scanner lexer = new Lab05Scanner(new ANTLRFileStream(args[0]));
            while (lexer.nextToken().getType() != Token.EOF);
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.err.println("Must provide a valid path to the filename with the tokens");
            System.exit(1);
        }catch(Exception e){
            System.err.println("Must provide a valid path to the filename with the tokens");
            System.exit(1);
        }
    }
}