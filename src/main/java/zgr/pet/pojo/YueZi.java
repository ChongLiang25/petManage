package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YueZi {
    private int yzId;
    private int petId;
    private Date startDate;
    private Date endDate;
    private String serviceType;
    private int ownerId;
}
