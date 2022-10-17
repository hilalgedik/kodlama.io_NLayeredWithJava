package kodlama.io_NLayered.dataAccess.Hibernate;

import kodlama.io_NLayered.dataAccess.CourseDao;
import kodlama.io_NLayered.entities.Course;
import kodlama.io_NLayered.entities.Entity;

public class HibernateCourseDao implements CourseDao{

	Entity courseEntity = new Course();
	

	@Override
	public void Add(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile eklendi !");
	}

	@Override
	public void Update(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void List(Entity entity) {
		// TODO Auto-generated method stub
		
	}

}
