import java.time.LocalDateTime; 

public class Main {
    public static void main(String[] args) {
        Stage genericStage = new Stage(new Village ("GenericVille", LocalDateTime.of(815, 3, 21, 0, 0, 0)));
        Log genericLogger = new Log(genericStage.getVillage().getName());

        // pass 100 days for a test, add logger here
        genericLogger.recordStart();
        for (int i = 0; i < 100; i ++) {
            String[] record = {genericStage.getVillage().getPopulation()+"", genericStage.getVillage().getFood()+""}; // TODO add this log function into stage?
            genericLogger.recordDay(record);
            genericStage.updateDay();
        }
        genericLogger.recordEnd();
    }
}
