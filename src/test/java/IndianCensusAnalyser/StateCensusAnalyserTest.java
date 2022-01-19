package IndianCensusAnalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.FileNotFoundException;

/**
 * Unit test for StateCensusAnalyser.
 */
public class StateCensusAnalyserTest
{
    StateCensusAnalyser censusAnalyser=new StateCensusAnalyser();
    CSVStateCensus csvStateCensus=new CSVStateCensus();

    @Test
    public void shouldReturnCheckthenumberofrecordsmatch() throws Exception {
        String result=censusAnalyser.loaddatauseiterator();
        String result1=csvStateCensus.loaddata();
        Assertions.assertEquals(result,result1);
    }

}
