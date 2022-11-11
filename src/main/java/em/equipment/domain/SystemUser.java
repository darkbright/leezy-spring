package em.equipment.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SystemUser {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String name;

    private String personalAgency;
    private String department;
    private String rank;
    @Column(name = "material_date")
    private Date date;
    private String startDate;
    private String endDate;
    private String dutyStatus;
    private String nationality;
    private String birthYyMmDd;
    private String residentNumber;
    private String mobileNumber;

    private String phone;
    private String address;

    @Column(name = "user_level")
    private String level;

    @Column(name = "user_check")
    private String check;
    private String clearance;
    private String manufactoryId;

    private String type;
    private String authorityType;
    private String loginUserId;
    private String password;
    private String updateDate;
    private String recordPersonalId;

    private String remarks;

}
