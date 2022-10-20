package em.equipment.application;

import em.equipment.domain.Information;
import em.equipment.infrastructure.InformationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    private InformationRepository repository;

    public InformationService(InformationRepository repository) {
        this.repository = repository;
    }

    public List<Information> getList() {
        return repository.findAll();
    }
}
