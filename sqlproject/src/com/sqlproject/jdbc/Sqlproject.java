package com.sqlproject.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sqlproject {
	public static void main(String[] args) throws Exception {

		// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		System.out.println(connection);

		// Step 3: Execute a query
		String query = "INSERT INTO revature_selvan (NAME) VALUES('selvan')  ";

		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);

		System.out.println("No of rows inserted :" + rows);

	}

}
