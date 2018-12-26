import java.io.*;
import java.util.*;

class ReadFileContentQ4{

    public static void main (String[] args) {
        try
        {
            //opening the file to read
            FileReader file_r = new FileReader("/home/user/Documents/test1.txt");
            BufferedReader br = new BufferedReader(file_r);
            //writing the contents of the text file to new file
            PrintWriter out = (new PrintWriter(new FileWriter("res1.txt")));
            String str=""; // initialising the variable with empty string

            //to loop through the text file
            while((str = br.readLine()) != null)
            {
                out.write(str.toUpperCase()+ "\n");
            }
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}