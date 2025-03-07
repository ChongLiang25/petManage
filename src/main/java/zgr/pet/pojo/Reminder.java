package zgr.pet.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reminder {
    private int reminderId;
    private int petId;
    private String reminderType;
    private Date reminderDate;
    private String reminderStatus;
}
