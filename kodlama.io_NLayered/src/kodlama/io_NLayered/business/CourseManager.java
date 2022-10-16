package kodlama.io_NLayered.business;

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
	
	public void add(Course course) throws Exception {
		if (course.getPrice()>0) {
			courseDao.Add(course);
			
		}else {
			throw new Exception("Kurs  fiyatı 10'dan küçük olamaz!");		}
		
	}

}
