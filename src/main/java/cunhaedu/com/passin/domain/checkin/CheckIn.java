package cunhaedu.com.passin.domain.checkin;

import cunhaedu.com.passin.domain.event.Attendee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "check_ins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckIn {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
