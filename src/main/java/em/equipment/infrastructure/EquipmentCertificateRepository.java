package em.equipment.infrastructure;

import em.equipment.domain.EquipmentCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentCertificateRepository extends JpaRepository<EquipmentCertificate, String> {
}
