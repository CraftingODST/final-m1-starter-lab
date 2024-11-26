package comp31.lab6_solution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import comp31.lab6_solution.model.EventList;
import comp31.lab6_solution.model.EventTypes;
import comp31.lab6_solution.model.TicketList;

@Controller
@SessionAttributes("ticketList")
@RequestMapping({ "/tickets" })
public class TicketController {

    // Inject the eventList and eventTypes into the controller via the constructor.

    EventList eventList;
    EventTypes eventTypes;

    public TicketController(EventList eventList, EventTypes eventTypes) {
        this.eventList = eventList;
        this.eventTypes = eventTypes;
    }

    @ModelAttribute("eventList")
    EventList createEventList() {
        return eventList;
    }

    @ModelAttribute("ticketList")
    TicketList creaTicketList() {
        System.err.println(">> create ticket list");
        return new TicketList();
    }

    @GetMapping("/buy")
    public String getListEvents(@ModelAttribute("eventList") EventList eventList) {
        return "/tickets/buy";
    }

    // Endpoint for displaying list of tickets.
    // Note that the Model is preloaded with all session attributes
    // (i.e. "ticketLiast") so we don't have to add the ticket list
    // to the Model inside the handler body.

    @GetMapping("/list")
    public String getListTickets(Model model) {
        return "/tickets/list";
    }
}
