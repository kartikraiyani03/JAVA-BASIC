import java.util.*;
 
public class file1
{
    public static void main(String args[])
    {
        java.io.File f = new java.io.File("facto.java");
        // System.out.println(f.exists());
        // System.out.println(f.length());
        // System.out.println(f.getAbsolutePath());
        // System.out.println(new java.util.Date(f.lastModified()));

        // java.io.File f2 = new java.io.File("newfile.java");

        if(f.exists())
        {
            System.out.println("Exist");
        }
        else
        {
            System.out.println("Not exist");
        }

        // java.io.PrintWriter p = new java.io.PrintWriter();
        Scanner sc = new Scanner(new File(f));


    }
}