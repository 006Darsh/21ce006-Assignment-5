// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("1.txt");
            out = new FileOutputStream("3.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("\nThis program is created by Darsh Aswani 21ce006");

        }
        catch(IOException ie) {
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}