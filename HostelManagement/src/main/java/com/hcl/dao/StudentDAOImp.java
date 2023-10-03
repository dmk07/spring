package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.hcl.bo.StudentBO;

public class StudentDAOImp implements StudentDAO {

	private DataSource ds;
	private static final String INSERT_QUERY = "INSERT INTO Student VALUES(CUSTID_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
	Connection con=null;
	PreparedStatement ps=null;
	// constructor inj
	public StudentDAOImp(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {

		int count = 0;
		
		try {
			con = ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1, bo.getStudName());
			ps.setString(2, bo.getAddr());
			ps.setString(3, bo.getEdu());
			ps.setInt(4, bo.getRoomNo());
			ps.setString(5, bo.getCheckIn());
			ps.setString(6, bo.getCheckOut());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} 
		catch(Exception ee)
		{
			ee.printStackTrace();
			throw ee;
		}
		finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}

		return count;
	}


}
