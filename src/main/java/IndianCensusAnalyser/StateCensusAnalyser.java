package IndianCensusAnalyser;
import java.io.*;
import java.util.*;

/**
 * Loading the csv data from csv file
 * Using the iterator
 */
public class StateCensusAnalyser
{

    public String loaddatauseiterator()throws FileNotFoundException{
        Scanner sc = new Scanner(new File("E:\\java\\isocodes.csv"));
        sc.useDelimiter(":");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();
        return "HAPPY";
    }

    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println( "Welcome to StateCenSusAnalyser" );
        StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
        stateCensusAnalyser.loaddatauseiterator();
    }
}
