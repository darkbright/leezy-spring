package em.profile.web;

import em.profile.application.ProfileService;
import em.profile.domain.Profile;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "profile", description = "Profile API")
@RestController
@RequestMapping("/api/profile")
public class ProfileRestController {

    private final ProfileService profileService;

    public ProfileRestController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @Operation(summary = "인물정보 목록조회 API", description = "인물정보 목록을 읽어온다")
    @GetMapping
    public ResponseEntity<List<Profile>> list() {
        List<Profile> profiles = profileService.getProfiles();

        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

    @Operation(summary = "인물정보 단일조회 API", description = "{id}의 인물정보를 읽어온다")
    @GetMapping("/{id}")
    public ResponseEntity<Profile> read(@PathVariable("id") Long id) {
        Profile profile = profileService.getProfile(id);

        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @Operation(summary = "인물정보 신규 등록 API", description = "인물정보를 신규 등록한다.")
    @PostMapping
    public ResponseEntity<Profile> create(@RequestBody Profile profile) {
        profileService.create(profile);

        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @Operation(summary = "인물정보 수정 API", description = "인물정보를 수정한다.")
    @PutMapping("/{id}")
    public ResponseEntity<Profile> update(@PathVariable("id") Long id, @RequestBody Profile profile) {
        profileService.update(id, profile);

        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @Operation(summary = "인물정보 삭제 API", description = "인물정보를 삭제한다.")
    @DeleteMapping("/{id}")
    public ResponseEntity<Profile> delete(@PathVariable("id") Long id) {
        Profile profile = new Profile();
        profile.setId(id);

        profileService.delete(profile);

        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

}
