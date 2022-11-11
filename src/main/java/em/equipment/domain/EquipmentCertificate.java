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
public class EquipmentCertificate {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String type;

    private String name;

    private String request;

    @Column(name = "equipment_date")
    private Date date;

    private String personalID;

    private String accord;

    private String copy;

    private String outgoingDate;

    private String outgoingAgency;

    private String outgoingPersonalId;

    private String outgoingConfirmation;

    private String outgoingTotal;

    private String outgoingProcessResult;

    private String outgoingRemarks;

    private String incomingDate;

    private String incomingAgency;

    private String incomingPersonalId;

    private String incomingConfirmation;

    private String incomingTotal;

    private String ProcessResult;

    private String incomingRemarks;

    private String remarks;
}
