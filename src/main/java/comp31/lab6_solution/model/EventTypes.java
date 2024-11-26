package comp31.lab6_solution.model;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class EventTypes {

    String[] eventTypes = { "Sports", "Rock", "Jazz", "Classical", "Theatre", "Conference" };

    Random randGen = new Random();

    public String[] getEventTypes() {
        return eventTypes;
    }

    public String getRandomType() {
        Integer randomType = randGen.nextInt(eventTypes.length);
        return eventTypes[randomType];
    }

}
