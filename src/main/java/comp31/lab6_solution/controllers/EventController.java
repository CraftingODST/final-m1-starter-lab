package comp31.lab6_solution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.SessionAttributes;

import comp31.lab6_solution.model.Event;
import comp31.lab6_solution.model.EventList;
import comp31.lab6_solution.model.EventTypes;
import comp31.lab6_solution.service.EventService;

@Controller
@RequestMapping("/events")

public class EventController {

    // EventList eventList;
    EventService eventService;
    EventTypes eventTypes;

    // Inject the eventList and eventTypes components.

    // public EventController(EventList eventList, EventTypes eventTypes) {
    // this.eventList = eventList;
    // this.eventTypes = eventTypes;
    // }

    // Return the injected (applicarion-scoped) eventList.

    public EventController(EventService eventService, EventTypes eventTypes) {
        this.eventService = eventService;
        this.eventTypes = eventTypes;
    }

    // @ModelAttribute("eventList")
    // EventList createEventList() {
    // return eventList;
    // }

    // -----Endpoint Handlers -----

    @GetMapping("list")
    public String getListEvents(@ModelAttribute("eventList") EventList eventList) {
        return "/events/list";
    }

    @GetMapping("add")
    public String getAddEventForm(@ModelAttribute("newEvent") Event event, Model model) {
        model.addAttribute("eventTypes", eventTypes.getEventTypes());
        return "/events/add";
    }

    @PostMapping("add")
    public String postAddEventForm(Event event) {
        eventService.add(event);
        return "redirect:/events/list";
    }

}
