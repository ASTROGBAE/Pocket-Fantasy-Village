import java.io.IOException;
import java.io.PrintWriter;

public class Log {

    //TODO: add process for when file already exists so it doesn't just throw an error...

    private PrintWriter logger;

    public Log (String villageName) {
        try {
            logger = new PrintWriter(villageName + "_stats.cvs", "UTF-8"); // from w3 schools lol
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    // record methods
    // TODO: add date column!!!!

    public void recordStart () {
        logger.println("population,food"); // label row
    }

    public void recordDay (String[] valueArr) { // make more specific to certain values per record?
        for (String value: valueArr) { // iterate through array, add all values to each col
            logger.print(value + ','); // go by column
        }
        logger.println(); // end of row
        System.out.println('W'); // debugger
        }

    public void recordEnd() {
        logger.close();
    }
    
}
