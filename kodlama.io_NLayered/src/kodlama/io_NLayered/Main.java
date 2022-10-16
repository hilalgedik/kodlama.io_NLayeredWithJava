package kodlama.io_NLayered;

import kodlama.io_NLayered.business.CourseManager;
import kodlama.io_NLayered.core.logging.DatabaseLogger;
import kodlama.io_NLayered.dataAccess.CourseDao;
import kodlama.io_NLayered.dataAccess.Hibernate.HibernateCourseDao;
import kodlama.io_NLayered.dataAccess.Jdbc.JdbcCourseDao;
import kodlama.io_NLayered.entities.Category;
import kodlama.io_NLayered.entities.Course;
import kodlama.io_NLayered.entities.Entity;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Course courseEntity = new Course(1,1,1,"x",1) ;
		
		CourseManager courseManager= new CourseManager(new HibernateCourseDao(), new DatabaseLogger());
		courseManager.add(courseEntity);
		
	}

}
