package em.equipment.infrastructure;

import em.equipment.domain.EquipmentManage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentManageRepository extends JpaRepository<EquipmentManage, String> {
}
