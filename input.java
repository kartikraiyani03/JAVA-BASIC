import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class input 
{
    public static void main(String args[]) 
    {
        try
        {
            PrintWriter pw = new PrintWriter("sample.txt");
            pw.write("Hello");
            Scanner sc = new Scanner(new File("C://Users//Kartik Raiyani//VS CODE//sample.txt"));
            System.out.println(sc.nextLine());
        }
        catch(IOException e)
        {
            System.out.println("Exception");
        }
    }
}