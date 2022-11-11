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
public class EquipmentManage {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String agency;

    private String name;

    private String type;

    @Column(name = "equipment_date")
    private Date date;

    private String count;

    private String manufactoryId;

    private String materialId;

    private String materialCertifyId;

    private String receiveGiveCount;

    private String receiveGiveCertifyId;

    private String receiveGiveAgency;

    private String callbackDate;

    private String callbackCount;

    private String returnCallbackCertifyId;

    private String returnCallbackAgency;

    private String changeDate;

    private String changeCount;

    private String equipmentChangeCertifyId;

    private String changeCheck;

    private String statusGroup;

    private String statusDetail;

    private String installDate;

    private String position;

    private String department;

    private String main;

    private String sub;

    private String checkDatetime;

    private String handoverDatetime;

    private String recordDatetime;

    private String recordPersonalID;

    private String remarks;

}
