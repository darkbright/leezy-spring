package em.equipment.infrastructure;

import em.equipment.domain.Information;
import em.profile.domain.Profile;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

@Component
public class InformationDataInitializer implements ApplicationRunner {
    private final InformationRepository repository;

    public InformationDataInitializer(InformationRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

    @Override
    public void run(ApplicationArguments args) throws ParseException {
        Information information = Information.builder()
                .id("ABC-01-001")
                .developTaskId("DDD-01")
                .approvalDate("2004-08-31")
                .equipmentCertiId("123456")
                .materialId("123456")
                .materialCertiId("123456")
                .approvalId("123456")
                .useResultEffectDate("2004-08-31")
                .build();
        repository.save(information);
        
    }
}
