package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.Vaccination;

import java.util.List;

@Mapper
public interface VaccinationMapper {

    @Select("select  * from vaccination")
    List<Vaccination> getVaccine();

    @Select("select * from vaccination where VaccinationID = #{id}")
    Vaccination getVaccineById(int id);

    @Insert("insert into vaccination(petid,OwnerID, vaccinetype, vaccinationdate, nextvaccinationdate, reminderstatus) VALUES " +
            "(#{petId},#{ownerId},#{vaccineType},#{vaccinationDate},#{nextVaccinationDate},#{reminderStatus})")
    void addVaccine(Vaccination vaccination);

    @Update("update vaccination set PetID = #{petId},OwnerID = #{ownerId},VaccineType = #{vaccineType},VaccinationDate = #{vaccinationDate}," +
            "NextVaccinationDate = #{nextVaccinationDate},ReminderStatus = #{reminderStatus} where VaccinationID = #{vaccinationId}")
    void updateVaccine(Vaccination vaccination);

    void delete(List<Integer> id);

    @Update("update vaccination set ReminderStatus = #{reminderStatus} where VaccinationID = #{vaccinationId}")
    void updateReminderStatus(Vaccination vaccination);

    @Select("select * from vaccination where OwnerID = #{id}")
    List<Vaccination> getVaccineByUId(int id);
}
