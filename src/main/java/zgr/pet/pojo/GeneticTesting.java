package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneticTesting {
    private int gtid;
    private int petId;
    private Date date;
    private String location;
    private String testResults;
    private int ownerId;
}
