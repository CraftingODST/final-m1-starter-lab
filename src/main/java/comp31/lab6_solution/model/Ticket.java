package comp31.lab6_solution.model;

public class Ticket {
    Integer ticketId;
    String ticketOwner;
    Integer eventId;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketOwner() {
        return ticketOwner;
    }

    public void setTicketOwner(String ticketOwner) {
        this.ticketOwner = ticketOwner;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "Ticket [ticketId=" + ticketId + ", ticketOwner=" + ticketOwner + ", eventId=" + eventId + "]";
    }

}
