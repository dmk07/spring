package com.hcl.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.hcl.bo.PatientBO;

public class PatientDAOImpl implements PatientDAOI {

	private DataSource ds;
	private static final String INSERT_QUERY = "INSERT INTO PATIENT VALUES(PATIENTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	Connection con=null;
	PreparedStatement ps=null;
	public PatientDAOImpl(DataSource ds)
	{
		super();
		//ds=this.ds;
		this.ds=ds;
	}
	
	@Override
	public int insert(PatientBO bo) throws Exception {

		int count = 0;

		try {
			con = ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1, bo.getPatientName());
			ps.setString(2, bo.getPatientAddr());
			ps.setFloat(3, bo.getPatientMobile());
			ps.setFloat(4, bo.getPatientDays());
			ps.setFloat(5, bo.getPatientBillPerDay());
			ps.setFloat(6, bo.getPatientTotalBill());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception ee) {
			ee.printStackTrace();
			throw ee;
		} finally {
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
