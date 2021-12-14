package ua.lviv.lgs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper {

	public static Employee map(ResultSet rezult) throws SQLException {

		int id = rezult.getInt("id");
		String firstName = rezult.getString("first_name");
		String lastName = rezult.getString("last_name");

		return new Employee(id, firstName, lastName);

	}

}
