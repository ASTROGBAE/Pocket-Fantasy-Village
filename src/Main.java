import java.time.LocalDateTime; 

public class Main {
    public static void main(String[] args) {
        Village town = new Village(LocalDateTime.of(856, 1, 23, 7, 14, 41));

        // loop for testing
        System.out.println(town.getProduction());
        for (int i = 0; i < 200; i ++) {
            System.out.println(town.getProduction());
            town.passTime(town.getPreviousDate().plusDays(1));
        }
    }
}
