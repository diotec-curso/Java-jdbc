package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1 : department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("=== TEST 2: seller findAll ===");
		List<Department>list = departmentDao.findAll();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("=== TEST 3: seller insert ===");
		Department department2 = new Department(null, "Automobilistico");
		departmentDao.insert(department2);
		System.out.println("Inserted! New department = " + department2);
	
		System.out.println();
		System.out.println("=== TEST 4: department update ===");
		department = departmentDao.findById(5);
		department.setName("Cama mesa e banho");
		departmentDao.update(department);
		System.out.println("Updated completed");
		
		System.out.println();
		System.out.println("=== TEST 5: seller delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
