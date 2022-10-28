package em.equipment.web;

import em.equipment.application.InformationService;
import em.equipment.domain.Information;
import em.profile.application.ProfileService;
import em.profile.domain.Profile;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/equipment/information")
public class InformationController {
    private final InformationService service;

    public InformationController(InformationService service) {
        this.service = service;
    }

    @Operation(summary = "목록조회 API", description = "목록을 읽어온다")
    @GetMapping
    public ResponseEntity<ToastResponse> list() {
        List<Information> list = service.getList();

        ToastPagination pagination = new ToastPagination(1, list.size());
        ToastData data = new ToastData(list, pagination);
        ToastResponse response = new ToastResponse(true, data);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Operation(summary = "등록 API", description = "정보를 등록한다.")
    @PostMapping
    public ResponseEntity<String> create(@RequestBody Information information) {
//        profileService.create(profile);
        log.info(information.toString());

        return new ResponseEntity<>(information.toString(), HttpStatus.OK);
    }

}
