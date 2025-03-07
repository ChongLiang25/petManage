package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetWalking {
    private int pwId;
    private int petId;
    private Date startDate;
    private Date endDate;
    private String serviceType;
    private int walkerId;
    private int ownerId;
}
