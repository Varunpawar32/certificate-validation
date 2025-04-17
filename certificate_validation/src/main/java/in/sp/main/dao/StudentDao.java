package in.sp.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Student;

@Repository

public class StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(Student student1)  {
		
		boolean status = false;
	try
		{	
		String INSERT_SQL_QUERY = "INSERT INTO certificates(id,name,domain,internship_start_date,internship_end_date) VALUES(?,?,?,?,?)";
		int count = jdbcTemplate.update(INSERT_SQL_QUERY, student1.getId(), student1.getName(), student1.getDomain(), student1.getInternship_start_date(), student1.getInternship_end_date());
		if(count > 0)
		{
			status = true;
		}
		else {
			status = false;
		}
		
		}
	catch(Exception e){
		status = false;
		e.printStackTrace();
	}
	return status;
	}
	
	public boolean updateUser(Student student1)
	{
		boolean status = false;
		try {
		String UPDATE_SQL_QUERY = "UPDATE certificates SET name=?, domain=? WHERE id=? ";
		int count = jdbcTemplate.update(UPDATE_SQL_QUERY, student1.getName(), student1.getDomain(),student1.getId());
		if(count>0) {
			status = true;
		}
		else {
			status=false;
		}
		}
		catch(Exception e) {
			status=false;
			e.printStackTrace();
			
		}
		return status;
	}
	
	public Student getUserById(String Id)
	{
		
		
		String SELECT_SQL_QUERY = "SELECT * FROM certificates WHERE id=? ";
		return jdbcTemplate.queryForObject(SELECT_SQL_QUERY, new StudentRowMapper(), Id);
		
		
	}
	public static final class StudentRowMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Student student = new Student();
			student.setId(rs.getString("id"));
			student.setDomain(rs.getString("domain"));
			student.setName(rs.getString("name"));
			student.setInternship_start_date(rs.getString("internship_start_date"));
			student.setInternship_end_date(rs.getString("internship_end_date"));
			
			return student;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
