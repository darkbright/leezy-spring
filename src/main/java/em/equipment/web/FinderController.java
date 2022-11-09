package em.equipment.web;

import em.Toast.*;
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
    public ResponseEntity<ToastTrueResponse> getEquipments(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<Equipment> list = service.getEquipments();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "장비 증명서 목록조회 API", description = "장비 목록을 읽어온다")
    @GetMapping("/api/equipment/certificate")
    public ResponseEntity<ToastTrueResponse> getEquipmentCertificates(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<EquipmentCertificate> list = service.getEquipmentCertificates();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "장비 관리기록부 목록조회 API", description = "장비 목록을 읽어온다")
    @GetMapping("/api/equipment/management")
    public ResponseEntity<ToastTrueResponse> getEquipmentManages(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<EquipmentManage> list = service.getEquipmentManages();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "장비 제작 정보 목록조회 API", description = "장비 제작 정보를 읽어온다")
    @GetMapping("/api/equipment/manufacture")
    public ResponseEntity<ToastTrueResponse> getEquipmentManufacture(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<EquipmentManufacture> list = service.getEquipmentManufacture();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "자재 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/information")
    public ResponseEntity<ToastTrueResponse> getMaterials(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<Material> list = service.getMaterials();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "자재 증명서 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/certificate")
    public ResponseEntity<ToastTrueResponse> getMaterialCertificate(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {

        List<MaterialCertificate> list = service.getMaterialCertificates();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "자재 관리기록부 목록조회 API", description = "자재 목록을 읽어온다")
    @GetMapping("/api/material/management")
    public ResponseEntity<ToastTrueResponse> getMaterialManage(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<MaterialManage> list = service.getMaterialManages();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }

    @Operation(summary = "시스템 사용자 수정 API", description = "시스템 사용자를 추가/수정/삭제한다 (Toast Grid)")
    @GetMapping("/api/system/user")
    public ResponseEntity<ToastTrueResponse> getSystemUser(
            @RequestParam Integer page
//            @RequestParam Integer perPage
    ) {
        List<SystemUser> list = service.getSystemUser();

        return ResponseEntity.ok().body(new ToastTrueResponse(list, page));
    }
}
