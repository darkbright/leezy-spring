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
public class EquipmentManufacture {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    private String agency;

    private String name;

    private String type;

    private String date;

    private String desc;

    private String manufactoryId;

    private String model;

    private String version;

    private Date manufactureDate;

    private Date serviceType;

    private Date size;

    private String weight;

    private String picture;

    private String effectDate;

    private String startDate;

    private String endDate;

    private String finalDate;

    private String manufactureRemarks;

    private String approvalId;

    private String equipmentCertifyId;

    private String deliveryDate;

    private String deliveryPersonalId;

    private String receiveDate;

    private String receiveAgency;

    private String receivePersonalId;

    private String recordDatetime;

    private String recordPersonalId;

    private String remarks;

}
