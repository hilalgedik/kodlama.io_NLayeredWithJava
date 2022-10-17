package kodlama.io_NLayered.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io_NLayered.core.logging.Logger;
import kodlama.io_NLayered.dataAccess.CategoryDao;
import kodlama.io_NLayered.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger logger;

	public CategoryManager(CategoryDao categoryDao, Logger logger) {
		super();
		this.categoryDao = categoryDao;
		this.logger = logger;
	}

	List<Category> categories = new ArrayList<>();

	public void add(Category category) throws Exception {

		for (Category category2: categories) {
			if (category2.getName() == category.getName()) {
				throw new Exception("Kategori adı aynı olamaz");

			} else {
				categories.add(category);
				categoryDao.Add(category);
			}
		}

	}

}
