package cunhaedu.com.passin.repositories;

import cunhaedu.com.passin.domain.checkin.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
