package StudentRegistrationService;

import Controller.StudentDetails;
import Dao.Studentdao;

public class StudentService {
   public boolean saveStudent(StudentDetails s) {
	   Studentdao dao=new Studentdao();
	   return dao.saveStudent(s);
	   
   }
}
