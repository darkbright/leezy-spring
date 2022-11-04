package em.equipment.infrastructure;

import em.equipment.domain.MaterialCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialCertificateRepository extends JpaRepository<MaterialCertificate, String> {
}
