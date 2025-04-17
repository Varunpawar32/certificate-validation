package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import in.sp.main.dao.StudentDao;
import in.sp.main.entity.Student;

@SpringBootApplication
public class CertificateValidationApplication implements CommandLineRunner {

	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(CertificateValidationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//			Student student1 = new Student("imdem","onsc","eojcn","2025-01-01","2025-01-31");
//			boolean status = studentDao.insertUser(student1);
//			if(status) {
//				System.out.println("User inserted successfully ...!");
//			}
//			else {
//				System.out.println("User inserted unsuccessfully ...!");
//			}
		
//		Update code
//		Student student1=new Student("Varun Suhas Pawar","Full-Stack Web Devlopement","imdem");
//			boolean status = studentDao.updateUser(student1);
//			if(status) {
//				System.out.println("User Updated successfully ...!");
//			}
//			else {
//				System.out.println("User Updated unsuccessfully ...!");
//			}
			
//			select part 
			
//			Student student =  studentDao.getUserById("imdem");
//			System.out.println("ID = "+student.getId());
//			System.out.println("Name = "+student.getName());
//			System.out.println("Domain = "+student.getDomain());
//			System.out.println("Internship Start Date = "+student.getInternship_start_date());
//			System.out.println("Internship End Date = "+student.getInternship_end_date());
//			
			
			
			
			
			
			
			
		
			
	
			
			
			
			
			
		
	}	
}
