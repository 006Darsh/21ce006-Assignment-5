// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_4_1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) //read char by char

            System.out.print((char)fChar); //write char char
            System.out.println("\nThis program is created by Darsh Aswani 21ce006");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}