package zgr.pet.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private int ownerId;
    private String ownerName;
    private String username;
    private String password;
    private String phone;
}
