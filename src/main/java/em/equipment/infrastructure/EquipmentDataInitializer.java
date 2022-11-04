package em.equipment.infrastructure;

import em.equipment.domain.Equipment;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

@Component
public class EquipmentDataInitializer implements ApplicationRunner {
    private final EquipmentRepository repository;

    public EquipmentDataInitializer(EquipmentRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    @Override
    public void run(ApplicationArguments args) throws ParseException {
        Equipment equipment = Equipment.builder()
                .id("ABC-01-001")
                .developTaskId("DDD-01")
                .approvalDate("2004-08-31")
                .equipmentCertiId("123456")
                .materialId("123456")
                .materialCertiId("123456")
                .approvalId("123456")
                .useResultEffectDate("2004-08-31")
                .build();
        repository.save(equipment);
        
    }
}
