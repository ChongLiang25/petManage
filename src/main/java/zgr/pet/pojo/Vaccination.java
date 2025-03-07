package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaccination {
    private int vaccinationId;
    private int petId;
    private String vaccineType;
    private Date vaccinationDate;
    private Date nextVaccinationDate;
    private String reminderStatus;
    private int ownerId;
}
