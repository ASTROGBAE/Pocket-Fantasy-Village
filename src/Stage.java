import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Stage {
    private Village town;
    private ArrayList<Event> events;

    public Stage(Village _town) {
        town = _town;
        events = new ArrayList<Event>(); // make this sequence concurrency later
        // global
        events.add(new Climate()); // does nothing right now, void
        // projects
        events.add(new Farms(10));
        // threats
        events.add(new Threat("bandits", 10, 5, 20));
        events.add(new Threat("dragon", 3, 100, 500));
        // add all events to the list here
    }

    // get methods

    public Village getVillage() {
        return town;
    }

    // other methods

    public void updateDay() { // iterate through all events for a day
        Iterator<Event> eventIt = events.iterator();
        while (eventIt.hasNext()) {
            eventIt.next().updateEventDaily(town);
        }
        town.addDay(); // pass day now that everything has happened.
    }
}
