package tn.esprit.autoloc.repository;
import tn.esprit.autoloc.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
