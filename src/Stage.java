import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Stage {
    Village town;
    ArrayList<Event> events;

    public Stage(Village _town) {
        town = _town;
        events = new ArrayList<Event>();
        // add all events to the list here
    }

    public void update() { // iterate through all events
        Iterator<Event> eventIt = events.iterator();
        while (eventIt.hasNext()) {
            eventIt.next().update(town);
        }
    }
}
