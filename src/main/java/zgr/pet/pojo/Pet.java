package zgr.pet.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private int petId;
    private String petName;
    private int ownerId;
    private String species;
    private String breed;
    private String gender;
    private int age;
    private double weight;
    private String healthStatus;

}
