package zgr.pet.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Walker {
    private int walkerId;
    private String walkerName;
    private String phone;
}
