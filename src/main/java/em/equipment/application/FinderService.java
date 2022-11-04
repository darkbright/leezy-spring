package em.equipment.application;

import em.equipment.domain.*;
import em.equipment.infrastructure.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FinderService {
    private EquipmentRepository equipmentRepository;
    private MaterialRepository materialRepository;
    private EquipmentCertificateRepository equipmentCertificateRepository;
    private MaterialCertificateRepository materialCertificateRepository;
    private EquipmentManageRepository equipmentManageRepository;
    private MaterialManageRepository materialManageRepository;
    private SystemUserRepository systemUserRepository;

    public FinderService(
            EquipmentRepository equipmentRepository,
            MaterialRepository materialRepository,
            EquipmentCertificateRepository equipmentCertificateRepository,
            MaterialCertificateRepository materialCertificateRepository,
            EquipmentManageRepository equipmentManageRepository,
            MaterialManageRepository materialManageRepository,
            SystemUserRepository systemUserRepository
    ) {
        this.equipmentRepository = equipmentRepository;
        this.materialRepository = materialRepository;
        this.equipmentCertificateRepository = equipmentCertificateRepository;
        this.materialCertificateRepository = materialCertificateRepository;
        this.equipmentManageRepository = equipmentManageRepository;
        this.materialManageRepository = materialManageRepository;
        this.systemUserRepository = systemUserRepository;
    }

    public List<Equipment> getEquipments() {
        return equipmentRepository.findAll();
    }

    public List<Material> getMaterials() {
        return materialRepository.findAll();
    }

    public List<EquipmentCertificate> getEquipmentCertificates() {
        return equipmentCertificateRepository.findAll();
    }

    public List<MaterialCertificate> getMaterialCertificates() {
        return materialCertificateRepository.findAll();
    }

    public List<EquipmentManage> getEquipmentManages() {
        return equipmentManageRepository.findAll();
    }

    public List<MaterialManage> getMaterialManages() {
        return materialManageRepository.findAll();
    }

    public List<SystemUser> getSystemUser() {
        return systemUserRepository.findAll();
    }

}
