// Name :-Aswani darsh
// Roll-no :-21ce006
import java.io.*;
public class prec5_4_2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new
                    FileInputStream("1.txt");
            fos = new FileOutputStream
                    ("4.txt");
            int temp;
            while ((temp = fis.read()) != -1) //read byte by byte
                fos.write((byte)temp); //write byte by byte
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
            System.out.println("\nThis program is created by Darsh Aswani 21ce006");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}