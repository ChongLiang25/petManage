package zgr.pet.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import zgr.pet.pojo.GeneticTesting;

import java.util.List;

@Mapper
public interface GeneticTestingMapper {

    @Select("select * from genetictesting")
    List<GeneticTesting> getGT();

    @Select("select * from genetictesting where GtID = #{id}")
    GeneticTesting getGTById(int id);

    @Insert("insert into genetictesting(petid,OwnerID, date, location, testresults) VALUES (#{petId},#{ownerId},#{date},#{location},#{testResults})")
    void addGT(GeneticTesting gt);

    @Update("update genetictesting set PetID = #{petId},OwnerID = #{ownerId},Date = #{date},Location = #{location},TestResults = #{testResults} " +
            "where GtID = #{gtid}")
    void updateGT(GeneticTesting gt);

    void delete(List<Integer> id);

    @Select("select * from genetictesting where OwnerID = #{id}")
    List<GeneticTesting> getGTByUId(int id);
}
