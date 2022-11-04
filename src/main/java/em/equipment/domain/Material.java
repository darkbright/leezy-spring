package em.equipment.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Material {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String type;

    private String request;

    private String date;

    private String personalId;

    private String accord;

    private String copy;

    private String outgoingDate;

    private Date outgoingAgency;

    private Date outgoingPersonalId;

    private Date outgoingConfirmation;

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
