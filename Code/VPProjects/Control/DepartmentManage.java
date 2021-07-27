package Control;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Department;
import inter.*;

public class DepartmentManage implements IActions {

	private Scanner sc;

	private ArrayList<Department> arr;

	public DepartmentManage() {
		sc = new Scanner(System.in);

		arr = new ArrayList<Department>();

	}

	private void function() {

		menu();

	}

	public void menu() {
		int menu = 0;
		do {
			System.out.println("");
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|  1. Add department                                          |");
			System.out.println("|  2. Edit department                                         |");
			System.out.println("|  3. Delete department                                       |");
			System.out.println("|  4. Search department by name                               |");
			System.out.println("|  5. ViewAll list department                                 |");
			System.out.println("|  6. Exit                                                    |");
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("______________________Pls choose the function__________________");

			int imenu = Integer.valueOf(sc.next());
			switch (imenu) {
			case 1:
				System.out.println("Nhập ID để thêm mới: ");
				add();
				break;
			case 2:
				System.out.println("Nhập ID để sửa: ");
				int idEdit = Integer.valueOf(sc.next());
		     	boolean isEditSuccess = edit(idEdit);
				System.out.println(isEditSuccess);
				break;

			case 3:
				System.out.println("Nhập ID để xóa: ");
				int idDelete = Integer.valueOf(sc.next());
				boolean isDeleteSuccess = delete(idDelete);
				System.out.println(isDeleteSuccess);
				break;
			case 4:
				System.out.println("Nhập teen tim kiem: ");
				String name = sc.next();
				Department department = searchByName(name);
				if (department == null) {
					System.out.println("Khong tim thay department");
				} else {
					System.out.println(department);
				}
				break;
			case 5:
				viewAll();
				
				break;
			case 6:
				return;

			default:
				System.out.println("pls choose agant");
				break;
			}

		} while (menu != 7);
	}

	public void add() {

		System.out.println(" Enter id : ");
		int idOfDep = Integer.valueOf(sc.next());

		System.out.println("Enter name : ");
		String nameOfDep = sc.next();

		Department department = new Department(idOfDep, nameOfDep);

		arr.add(department);

//		throw new UnsupportedOperationException();
	}

	public boolean delete(int id) {

		try {
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).getId() == id) {
					arr.remove(i);
					break;
				}
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}

	public boolean edit(int id) {
//		for(int i = 0; i< arr.size(); i++) {
//			if(id == arr.get(i).getId()) {
//				System.out.println("Enter new name : ");
//				String nameOfEdit = sc.next();
//				
//				
//				// duyệt arr ( duyệt danh sách)
//				arr.
//				
//			}
//		}


		try {
			System.out.println("Enter new name : ");
			String nameOfDep = sc.next();

			Department department = new Department(id, nameOfDep);
			delete(id);
			arr.add(department);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void viewAll() {
		for(Department department : arr) {
			System.out.println(department);
		}
		System.out.println("isEmpty");

//		try {
//			for(Department department : arr) {
//				System.out.println(department);
//			}
//		} catch (Exception e) {
//			
//			System.out.println(" isEmpty ");
//			
//		}
	
	}

	public Department searchByName(String name) {

		for (Department department : arr) {

			if (department.getName().equals(name)) {
				return department;
			}
		}
		
		return null;

	}

}
