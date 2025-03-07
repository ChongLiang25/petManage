package zgr.pet;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@MapperScan("zgr/pet/mapper")
@ServletComponentScan
@SpringBootApplication
public class PetApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetApplication.class,args);
    }
}
