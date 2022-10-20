package em.equipment.infrastructure;

import em.equipment.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, String> {
}
