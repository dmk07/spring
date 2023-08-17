package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.hcl.bo.CustomerBO;

public final class CustomerDAOImpl implements ICustomerDAO {

	private DataSource ds;
	private static final String INSERT_QUERY = "INSERT INTO CUSTOMER VALUES(CUSTID_SEQUENCE.NEXTVAL,?,?,?,?,?,?)";
	Connection con=null;
	PreparedStatement ps=null;
	// constructor inj
	public CustomerDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {

		int count = 0;
		
		try {
			con = ds.getConnection();
			 ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1, bo.getCustName());
			ps.setString(2, bo.getCustaddrs());
			ps.setFloat(3, bo.getPamt());
			ps.setFloat(4, bo.getRate());
			ps.setFloat(5, bo.getTime());
			ps.setFloat(6, bo.getIntrestAmount());
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
