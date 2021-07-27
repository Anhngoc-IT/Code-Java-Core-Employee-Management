package inter;

import entity.Department;

public interface IActions {

	void add();

	boolean edit(int id); 

	boolean delete(int id);

	Department searchByName(String name);

	void viewAll();

}