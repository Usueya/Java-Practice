package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class J20210427_01_emp {

	public static void main(String[] args) {
		//Employees테이블에서 Salary가 10,000이상인 사원
		//Employee_id, First_name, Salary, Hire_date조회
		//연봉의 내림차순으로 정렬
		
		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, Hire_date\r\n" + 
					"FROM EMPLOYEES\r\n" + 
					"WHERE SALARY >= 10000\r\n" + 
					"ORDER BY SALARY DESC";
		List<EmployeesDTO> list = new ArrayList<>();
		
		Connection way = DBconn.getConn();
		Statement del = null;
		ResultSet result = null;
		
		try {
			del = way.createStatement();
			result = del.executeQuery(sql);
			
			while(result.next()) {
				int id = result.getInt("EMPLOYEE_ID");
				String name = result.getString("FIRST_NAME");
				int sal = result.getInt("SALARY");
				Date date = result.getDate("Hire_date");
				EmployeesDTO dto = new EmployeesDTO(id,name,sal,date);

				list.add(dto);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL fail");
			e.printStackTrace();
		}finally {
			result.close();
			del.close();
			way.close();
			
			
		}
		
		for (EmployeesDTO e : list) {
			System.out.println(e.getEmployee_id() + " "
					+e.getFirst_name()+" "
					+e.getSalary()+" "
					+e.getHire_date());
		}

		

	}

}
