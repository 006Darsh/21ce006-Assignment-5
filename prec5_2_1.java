// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_2_1 {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new FileReader("1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.print((char) temp);
            System.out.println("\nThis program is created by Darsh Aswani 21ce006");
        }
        finally {
            if (source != null)
                source.close();
        }
    }
}