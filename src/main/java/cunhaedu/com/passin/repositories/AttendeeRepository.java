package cunhaedu.com.passin.repositories;

import cunhaedu.com.passin.domain.event.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
