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
          logger.println("Date,Production");
    }

    public void update (String value) { // make more specific to certain values per record?
        logger.println(value);
        System.out.println('W');
        }

    public void close() {
        logger.close();
    }
    
}
