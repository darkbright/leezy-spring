package em.equipment.application;

import em.Toast.ToastRequest;
import em.equipment.infrastructure.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
    private EquipmentManufactureRepository equipmentManufactureRepository;

    public EditorService(
            EquipmentRepository equipmentRepository,
            MaterialRepository materialRepository,
            EquipmentCertificateRepository equipmentCertificateRepository,
            MaterialCertificateRepository materialCertificateRepository,
            EquipmentManageRepository equipmentManageRepository,
            MaterialManageRepository materialManageRepository,
            EquipmentManufactureRepository equipmentManufactureRepository,
            SystemUserRepository systemUserRepository
    ) {
        this.equipmentRepository = equipmentRepository;
        this.materialRepository = materialRepository;
        this.equipmentCertificateRepository = equipmentCertificateRepository;
        this.materialCertificateRepository = materialCertificateRepository;
        this.equipmentManageRepository = equipmentManageRepository;
        this.materialManageRepository = materialManageRepository;
        this.equipmentManufactureRepository = equipmentManufactureRepository;
        this.systemUserRepository = systemUserRepository;
    }

    public void modifyEquipments(ToastRequest data) {
        equipmentRepository.saveAll(data.getCreatedRows());
        equipmentRepository.saveAll(data.getUpdatedRows());
        equipmentRepository.deleteAll(data.getDeletedRows());
    }

    public void modifyMaterials(ToastRequest data) {
        materialRepository.saveAll(data.getCreatedRows());
        materialRepository.saveAll(data.getUpdatedRows());
        materialRepository.deleteAll(data.getDeletedRows());
    }

    public void modifyEquipmentCertificates(ToastRequest data) {
        equipmentCertificateRepository.saveAll(data.getCreatedRows());
        equipmentCertificateRepository.saveAll(data.getUpdatedRows());
        equipmentCertificateRepository.deleteAll(data.getDeletedRows());
    }

    public void modifyMaterialCertificates(ToastRequest data) {
        materialCertificateRepository.saveAll(data.getCreatedRows());
        materialCertificateRepository.saveAll(data.getUpdatedRows());
        materialCertificateRepository.deleteAll(data.getDeletedRows());
    }

    public void modifyEquipmentManages(ToastRequest data) {
        equipmentManageRepository.saveAll(data.getCreatedRows());
        equipmentManageRepository.saveAll(data.getUpdatedRows());
        equipmentManageRepository.deleteAll(data.getDeletedRows());
    }


    public void modifyEquipmentManufacture(ToastRequest data) {
        equipmentManufactureRepository.saveAll(data.getCreatedRows());
        equipmentManufactureRepository.saveAll(data.getUpdatedRows());
        equipmentManufactureRepository.deleteAll(data.getDeletedRows());
    }

    public void modifyMaterialManages(ToastRequest data) {
        materialManageRepository.saveAll(data.getCreatedRows());
        materialManageRepository.saveAll(data.getUpdatedRows());
        materialManageRepository.deleteAll(data.getDeletedRows());
    }

    public void modifySystemUser(ToastRequest data) {
        systemUserRepository.saveAll(data.getCreatedRows());
        systemUserRepository.saveAll(data.getUpdatedRows());
        systemUserRepository.deleteAll(data.getDeletedRows());
    }

}
