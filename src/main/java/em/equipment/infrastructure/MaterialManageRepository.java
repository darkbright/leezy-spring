package em.equipment.infrastructure;

import em.equipment.domain.MaterialManage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialManageRepository extends JpaRepository<MaterialManage, String> {
}
