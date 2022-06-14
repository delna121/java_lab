import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;

class write {

    public static void main(String[] args) {
        String var = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter File name");
        String source = scan.nextLine();
        System.out.println("Enter File Contents");
        String contents = scan.nextLine();
        try {
            File file = new File(source);
            FileWriter fw = new FileWriter(file);
            fw.write(contents);
            System.out.println("\n Writing to Output File");
            fw.close();
            FileReader fr = new FileReader(source);
            String str = "";
            int i;
            System.out.println("Reading File " + source + "\n");
            while ((i = fr.read()) != -1) {
                str += (char) i;
            }
            System.out.println(str);
            fr.close();
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}