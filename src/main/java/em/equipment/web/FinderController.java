package em.equipment.web;

import em.Toast.ToastData;
import em.Toast.ToastPagination;
import em.Toast.ToastRequest;
import em.Toast.ToastResponse;
import em.equipment.application.FinderService;
import em.equipment.domain.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class FinderController {
    private final FinderService service;

    public FinderController(FinderService service) {
        this.service = service;
    }

    @Operation(summary = "장비 목록조회 API", description = "장비 목록을 읽어온다")
    @GetMapping("/api/equipment/information")
    public ResponseEntity<ToastResponse> getEquipments() {
        List<Equipment> list = service.getEquipments();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "장비 증명서 목록조회 API", description = "장비 목록을 읽어온다")
    @GetMapping("/api/equipment/certificate")
    public ResponseEntity<ToastResponse> getEquipmentCertificates() {
        List<EquipmentCertificate> list = service.getEquipmentCertificates();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "장비 관리기록부 목록조회 API", description = "장비 목록을 읽어온다")
    @GetMapping("/api/equipment/management")
    public ResponseEntity<ToastResponse> getEquipmentManages() {
        List<EquipmentManage> list = service.getEquipmentManages();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "자재 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/information")
    public ResponseEntity<ToastResponse> getMaterials() {
        List<Material> list = service.getMaterials();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "자재 증명서 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/certificate")
    public ResponseEntity<ToastResponse> getMaterialCertificate() {
        List<MaterialCertificate> list = service.getMaterialCertificates();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "자재 관리기록부 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/management")
    public ResponseEntity<ToastResponse> getMaterialManage() {
        List<MaterialManage> list = service.getMaterialManages();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "시스템 사용자 수정 API", description = "시스템 사용자를 추가/수정/삭제한다 (Toast Grid)")
    @GetMapping("/api/system/user")
    public ResponseEntity<ToastResponse> getSystemUser() {
        List<SystemUser> list = service.getSystemUser();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data, "");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
