package agenda;

import java.time.*;

public class Event {

    /**
     * The myTitle of this event
     */
    public String myTitle;
    
    /**
     * The starting time of the event
     */
    LocalDateTime myStart;

    /**
     * The durarion of the event 
     */
    public Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        // TODO : implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        LocalDate dayStart = myStart.plusDays(-1).toLocalDate();
        LocalDateTime myEnd = this.myStart.plus(this.myDuration);
        LocalDate dayEnd = myEnd.plusDays(1).toLocalDate();
                
        return aDay.isAfter(dayStart) && aDay.isBefore(dayEnd);
    }
   
    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

    @Override
    public String toString() {
        return "Event{" + "myTitle=" + myTitle + ", myStart=" + myStart + ", myDuration=" + myDuration + '}';
    }

   
    
}
