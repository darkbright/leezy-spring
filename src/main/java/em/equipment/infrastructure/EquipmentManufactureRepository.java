package em.equipment.infrastructure;

import em.equipment.domain.EquipmentManufacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentManufactureRepository extends JpaRepository<EquipmentManufacture, String> {
}
