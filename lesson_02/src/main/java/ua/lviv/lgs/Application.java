package ua.lviv.lgs;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		EmployeeDao employeeDao = new EmployeeDao(ConnectionUtils.openConnection());

		//READ_ALL
		employeeDao.readAll().forEach(System.out::println);

		System.out.println("**************************************************");

		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(new Employee("Andrew", "Teron"));
		listOfEmployee.add(new Employee("Bruece", "Willis"));
		listOfEmployee.add(new Employee("Canibal", "King"));
		listOfEmployee.add(new Employee("Daniel", "Rossi"));
		listOfEmployee.add(new Employee("Inga", "Still"));
		
		//INSERT
		listOfEmployee.forEach(employee -> {
			try {
				employeeDao.insert(employee);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		});
		
////		//READ_ALL
				employeeDao.readAll().forEach(System.out::println);

				System.out.println("**************************************************");

	
	//READ BY ID
		
				Employee employeeFromBD = employeeDao.read(2);
				System.out.println(employeeFromBD);
		
		//Up date by id
		employeeFromBD.setLastName(employeeFromBD.getLastName() + "-DeLordRossi");
//		employeeDao.update(employeeFromBD);
		
		//READ BY ID
		
		employeeFromBD = employeeDao.read(2);
		System.out.println(employeeFromBD);
		
		//DELETE
		
		employeeDao.delete(6);
		
		//READ_ALL
		employeeDao.readAll().forEach(System.out::println);

		System.out.println("**************************************************");

		
	}

}
