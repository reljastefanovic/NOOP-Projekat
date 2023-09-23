package ProjekatProg.projekatRestoran;

import ProjekatProg.projekatRestoran.Service.DatabaseConnectionTest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.*;

@SpringBootApplication
public class ProjekatRestoranApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjekatRestoranApplication.class, args);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Replace with your database driver

			// Establish a database connection
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/baza1234", "root", "sifra123"
			);

			// Create a SQL query
			String sql = "SELECT * FROM REZERVACIJE";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Execute the query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Process the results
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String ime = resultSet.getString("ime");
				String datum = resultSet.getString("datum");
				String telefon = resultSet.getString("telefon");
				String vreme = resultSet.getString("vreme");
				String broj_gostiju = resultSet.getString("broj_gostiju");


				System.out.println("ID: " + id + ", Name: " + ime + ", datum: " + datum + ", telefon: " + telefon + ", vreme: " + vreme  + ", broj gostiju: " + broj_gostiju);
			}

			// Close resources
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}


	@Bean
	public CommandLineRunner testDatabaseConnection(DatabaseConnectionTest databaseConnectionTest) {
		return args -> {
			databaseConnectionTest.testConnection();
		};
	}

}
