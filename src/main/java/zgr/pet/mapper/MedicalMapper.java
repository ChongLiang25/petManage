package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.MedicalCheckup;

import java.util.List;

@Mapper
public interface MedicalMapper {

    @Select("select * from medicalcheckup")
    List<MedicalCheckup> getAllList();

    @Select("select * from medicalcheckup where checkupID = #{id}")
    MedicalCheckup getListById(int id);

    @Insert("insert into medicalcheckup(PetID,OwnerID, checkupdate, nextcheckupdate, results, reminderstatus) VALUES (#{petId},#{ownerId},#{checkupDate}," +
            "#{nextCheckupDate},#{results},#{reminderStatus})")
    void addList(MedicalCheckup mc);

    @Update("update medicalcheckup set PetID = #{petId},OwnerID = #{ownerId},CheckupDate = #{checkupDate},NextCheckupDate = #{nextCheckupDate}," +
            "Results = #{results},ReminderStatus = #{reminderStatus} where CheckupID = #{checkupId}")
    void updateMC(MedicalCheckup mc);

    void delete(List<Integer> id);

    @Update("update medicalcheckup set ReminderStatus = #{reminderStatus} where CheckupID = #{checkupId}")
    void updateReminderStatus(MedicalCheckup mc);

    @Select("select * from medicalcheckup where OwnerID = #{ownerId};")
    List<MedicalCheckup> getMedicalById(int id);
}