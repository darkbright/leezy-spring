package em.equipment.web;

import em.Toast.*;
import em.equipment.application.EditorService;
import em.equipment.domain.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EditorController {
    private final EditorService service;

    public EditorController(EditorService service) {
        this.service = service;
    }

    @Operation(summary = "장비 정보 수정 API", description = "장비 정보를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/information")
    public ResponseEntity<ToastTrueResponse> putEquipments(@RequestBody ToastRequest<Equipment> request) {
        service.modifyEquipments(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "장비 증명서 수정 API", description = "장비 증명서를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/certificate")
    public ResponseEntity<ToastTrueResponse> putEquipmentCertificates(@RequestBody ToastRequest<EquipmentCertificate> request) {
        service.modifyEquipmentCertificates(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "장비 관리기록부 수정 API", description = "장비 관리기록부를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/management")
    public ResponseEntity<ToastTrueResponse> putEquipmentManages(@RequestBody ToastRequest<EquipmentManage> request) {
        service.modifyEquipmentManages(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "장비 제작 정보 수정 API", description = "장비 제작 정보를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/manufacture")
    public ResponseEntity<ToastTrueResponse> putEquipmentManufacture(@RequestBody ToastRequest<EquipmentManufacture> request) {
        service.modifyEquipmentManufacture(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "자재 정보 수정 API", description = "자재 정보를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/information")
    public ResponseEntity<ToastTrueResponse> putMaterials(@RequestBody ToastRequest<Material> request) {
        service.modifyMaterials(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "자재 증명서 수정 API", description = "자재 증명서를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/certificate")
    public ResponseEntity<ToastTrueResponse> putMaterialCertificates(@RequestBody ToastRequest<MaterialCertificate> request) {
        service.modifyMaterialCertificates(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "자재 관리기록부 수정 API", description = "자재 관리기록부를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/management")
    public ResponseEntity<ToastTrueResponse> putMaterialManages(@RequestBody ToastRequest<MaterialManage> request) {
        service.modifyMaterialManages(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

    @Operation(summary = "시스템 사용자 수정 API", description = "시스템 사용자를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/system/user")
    public ResponseEntity<ToastTrueResponse> putSystemUser(@RequestBody ToastRequest<MaterialManage> request) {
        service.modifySystemUser(request);

        return ResponseEntity.ok().body(new ToastTrueResponse());
    }

}
