

public class EventManager{

	private final Event[] events;

    public EventManager() {
        events = new Event[6]; // events array

        //  instance all events and set the information
        // the extra info is set using the constructor
        events[0] = new WashoosEvent("Event 01", 10, true, 5, true, 3);
        events[1] = new CanJamEvent("Event 02", 3, true, 20, 4);
        events[2] = new HorseShoesEvent("Event 03", 5, false, 5, 2);
        events[3] = new CornHoleEvent("Event 04", 55, false, 2, 1);
        events[4] = new LadderBallEvent("Event 05", 5, false, 5, 5);
        events[5] = new StickGameEvent("Event 06", 2, true, 5, 6);
        
    }

    // return the events
    public Event[] getEvents() {
        return events;
    }

}// end EventManager