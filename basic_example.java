import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author: acbart@udel.edu
 * Updated: 1/15/2019
 * Description: A sample of taking a filename from stdin, loading it into a
                string array, and printing out the first line. Remember,
                you need to match the class name to the file name!
*/
public class Main {
    
    /**
     * Read the contents of a file into a List of Strings (an ArrayList).
     * 
     * @param filename The filename to open and read.
     * @return The contents of the file, each line an element of the list.
     */
    public static List<String> readFile(String filename) {
        List < String > records = new ArrayList < String > ();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
        return records;
    }
    
    /**
     * Main method that gets a filename from STDIN, gets the contents, and
     * prints out its first line.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        scanner.close();
        
        List<String> records = readFile(filename);
        System.out.println(records.get(0));
    }
}