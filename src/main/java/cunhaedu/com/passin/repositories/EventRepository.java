package cunhaedu.com.passin.repositories;

import cunhaedu.com.passin.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, String> {
}
