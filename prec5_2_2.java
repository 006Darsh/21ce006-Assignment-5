// Name :-Param Thumar
// Roll-no :-21ce144
import java.io.*;
public class prec5_2_2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try
        {
            sourceStream = new FileInputStream("1.txt");
            targetStream = new FileOutputStream("2.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
            System.out.println("\nThis program is created by Darsh Aswani 21ce006");

        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}