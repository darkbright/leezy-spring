package em.equipment.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "information")
public class Information {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "develop_task_id", length = 20)
    private String developTaskId;

    @Column(name = "approval_name")
    private String approvalName;

    @Column(name = "approval_date")
    private String approvalDate;

    @Column(name = "equipment_certi_id")
    private String equipmentCertiId;

    @Column(name = "material_id")
    private String materialId;

    @Column(name = "material_certi_id")
    private String materialCertiId;

    @Column(name = "approval_id")
    private String approvalId;

    @Column(name = "use_result_effect_date")
    private String useResultEffectDate;

    @Column(name = "manufacture_effect_date")
    private Date manufactureEffectDate;

    @Column(name = "destroy_result_effect_date")
    private Date destroyResultEffectDate;

    @Column(name = "equipment_destroy_date")
    private Date equipmentDestroyDate;

    @Column(name = "manage_agency")
    private String manageAgency;

    @Column(name = "operate_agency")
    private String operateAgency;

    @Column(name = "operate_department")
    private String operateDepartment;

    @Column(name = "operate_position")
    private String operatePosition;

    @Column(name = "operate_date")
    private String operateDate;

    @Column(name = "last_status_group")
    private String lastStatusGroup;

    @Column(name = "last_status_detail")
    private String lastStatusDetail;

    @Column(name = "manage_level")
    private String manageLevel;

    @Column(name = "communicate_level")
    private String communicateLevel;

    @Column(name = "encrypt_key")
    private String encryptKey;

    @Column(name = "program_key")
    private String programKey;

    @Column(name = "manage_personal_id_main")
    private String managePersonalIdMain;

    @Column(name = "manage_personal_id_sub")
    private String managePersonalIdSub;

    @Column(name = "last_check_datatime")
    private String lastCheckDatatime;

    @Column(name = "last_handover_datetime")
    private String lastHandoverDatetime;

    @Column(name = "record_datetime")
    private String recordDatetime;

    @Column(name = "record_personal_id")
    private String recordPersonalId;

    @Column(name = "remarks")
    private String remarks;

}