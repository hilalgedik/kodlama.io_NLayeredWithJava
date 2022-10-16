package kodlama.io_NLayered.dataAccess;

import kodlama.io_NLayered.entities.Entity;

public interface BaseDao {
		
	void Add(Entity entity);
	void Update(Entity entity);
	void Delete(Entity entity);
	void List(Entity entity);
	
}
