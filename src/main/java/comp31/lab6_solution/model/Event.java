package comp31.lab6_solution.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer eventId = 0;
    String eventType = "";
    String eventName = "";
    String eventLocation = "";
    LocalDate eventDate = LocalDate.now();
}
