package em.equipment.web;

import em.Toast.ToastData;
import em.Toast.ToastPagination;
import em.Toast.ToastRequest;
import em.Toast.ToastResponse;
import em.equipment.application.EditorService;
import em.equipment.application.FinderService;
import em.equipment.domain.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class EditorController {
    private final EditorService service;

    public EditorController(EditorService service) {
        this.service = service;
    }

    @Operation(summary = "장비 정보 수정 API", description = "장비 정보를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/information")
    public ToastResponse putEquipments(@RequestBody ToastRequest<Equipment> request) {
        service.putEquipments(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "장비 증명서 수정 API", description = "장비 증명서를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/certificate")
    public ToastResponse putEquipmentCertificates(@RequestBody ToastRequest<EquipmentCertificate> request) {
        service.putEquipmentCertificates(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "장비 관리기록부 수정 API", description = "장비 관리기록부를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/equipment/management")
    public ToastResponse putEquipmentManages(@RequestBody ToastRequest<EquipmentManage> request) {
        service.putEquipmentManages(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "자재 정보 수정 API", description = "자재 정보를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/information")
    public ToastResponse putMaterials(@RequestBody ToastRequest<Material> request) {
        service.putMaterials(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "자재 증명서 수정 API", description = "자재 증명서를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/certificate")
    public ToastResponse putMaterialCertificates(@RequestBody ToastRequest<MaterialCertificate> request) {
        service.putMaterialCertificates(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "자재 관리기록부 수정 API", description = "자재 관리기록부를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/material/management")
    public ToastResponse putMaterialManages(@RequestBody ToastRequest<MaterialManage> request) {
        service.putMaterialManages(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

    @Operation(summary = "시스템 사용자 수정 API", description = "시스템 사용자를 추가/수정/삭제한다 (Toast Grid)")
    @PutMapping("/api/system/user")
    public ToastResponse putSystemUser(@RequestBody ToastRequest<MaterialManage> request) {
        service.putMaterialManages(request.getUpdatedRows());

        return new ToastResponse(true, new ToastData(null, new ToastPagination(0, 0)), "");
    }

}
