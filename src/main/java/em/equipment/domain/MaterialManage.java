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
public class MaterialManage {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String agency;

    private String name;

    @Column(name = "description")
    private String desc;

    private String type;

    private String produceDate;

    private String produceCount;

    private String produceAgency;

    private String equipmentId;

    private String equipmentCertiId;

    private Date giveDate;

    private String giveCount;

    private String receiveGiveCertiId;

    private String giveAgency;

    private String callbackDate;

    private String callbackCount;

    private String returnCallbackCertifyId;

    private String callbackAgency;

    private String changeDate;

    private String changeCount;

    private String materialChangeCertiId;

    @Column(name = "user_check")
    private String check;

    @Column(name = "material_group")
    private String group;

    private String detail;

    private String installDate;

    private String position;

    private String department;

    private String opposition;

    private String idMain;

    private String idSub;

    private String datetime;

    private String handoverDatetime;

    private String remarks;

}
