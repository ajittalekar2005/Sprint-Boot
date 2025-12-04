package in.sp.resorce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.College;

@Configuration
public class CollegeConfiguration {

	@Bean
	 public College coolegeBean() {
		
		 College c = new College();
		 System.out.println("College object uis new created");
		 c.setCollegeName("Sangola college Sangola");
		 c.setCollegeId(56);
		  c.setCollegeGrade("A");
		 return c;
		 
	 }
}
