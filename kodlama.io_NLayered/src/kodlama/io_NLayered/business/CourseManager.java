package kodlama.io_NLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io_NLayered.core.logging.Logger;
import kodlama.io_NLayered.dataAccess.CourseDao;
import kodlama.io_NLayered.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger logger;
	public CourseManager(CourseDao courseDao, Logger logger) {
		super();
		this.courseDao = courseDao;
		this.logger = logger;
	}
	
	List<Course> courses = new ArrayList<>();
	public void add(Course course) throws Exception {
		if (course.getPrice()>0) {
			courseDao.Add(course);
			
		}else {
			throw new Exception("Kurs  fiyatı 0'dan küçük olamaz!");		}
		
		for(Course course2 : courses) {
			if (course2.getName()==course.getName()) {
				throw new Exception("Kurs adı aynı olamaz!");
			}else {
				courses.add(course);
				courseDao.Add(course);
			}
			
		}
		 
	}
	
	

}
