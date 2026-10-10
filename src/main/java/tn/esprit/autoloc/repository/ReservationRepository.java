package tn.esprit.autoloc.repository;
import tn.esprit.autoloc.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
