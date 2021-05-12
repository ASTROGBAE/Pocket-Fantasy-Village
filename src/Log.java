import java.io.IOException;
import java.io.PrintWriter;

public class Log {

    private PrintWriter logger;

    public Log (String villageName) {
        try {
            logger = new PrintWriter(villageName + ".txt", "UTF-8"); // from w3 schools lol
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    public void update (double value) {
        logger.println(String.valueOf(value));
        System.out.println('W');
        }

    public void close() {
        logger.close();
    }
    
}
