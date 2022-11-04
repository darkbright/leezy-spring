package em.equipment.application;

import em.equipment.domain.*;
import em.equipment.infrastructure.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EditorService {
    private EquipmentRepository equipmentRepository;
    private MaterialRepository materialRepository;
    private EquipmentCertificateRepository equipmentCertificateRepository;
    private MaterialCertificateRepository materialCertificateRepository;
    private EquipmentManageRepository equipmentManageRepository;
    private MaterialManageRepository materialManageRepository;
    private SystemUserRepository systemUserRepository;

    public EditorService(
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

    public void putEquipments(List<Equipment> list) {
        for (Equipment row: list) {
            equipmentRepository.save(row);
        }
    }

    public void putMaterials(List<Material> list) {
        for (Material row: list) {
            materialRepository.save(row);
        }
    }

    public void putEquipmentCertificates(List<EquipmentCertificate> list) {
        for (EquipmentCertificate row: list) {
            equipmentCertificateRepository.save(row);
        }
    }

    public void putMaterialCertificates(List<MaterialCertificate> list) {
        for (MaterialCertificate row: list) {
            materialCertificateRepository.save(row);
        }
    }

    public void putEquipmentManages(List<EquipmentManage> list) {
        for (EquipmentManage row: list) {
            equipmentManageRepository.save(row);
        }
    }

    public void putMaterialManages(List<MaterialManage> list) {
        for (MaterialManage row: list) {
            materialManageRepository.save(row);
        }
    }

    public void putSystemUser(List<SystemUser> list) {
        for (SystemUser row: list) {
            systemUserRepository.save(row);
        }
    }

}
