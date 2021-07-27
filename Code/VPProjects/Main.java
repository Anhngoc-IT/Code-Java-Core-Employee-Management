import Control.DepartmentManage;
import entity.*;

public class Main {

	private Department departmentList;
	private Employee EmployeeList;

	
	public static void main(String[] args) {
		
		DepartmentManage manage = new DepartmentManage();
		manage.menu();
		//throw new UnsupportedOperationException();
	}
}