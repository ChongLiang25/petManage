package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalCheckup {
    private int checkupId;
    private int petId;
    private Date checkupDate;
    private Date nextCheckupDate;
    private String results;
    private String reminderStatus;
    private int ownerId;
}