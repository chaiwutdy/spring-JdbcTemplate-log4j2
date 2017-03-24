package com.wut.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wut.dao.InvAdvRptSitSub1DAO;
import com.wut.model.MastCarSeriesModel;
import com.wut.rowmapper.MastCarSeriesRowMapper;

public class InvAdvRptSitSub1DAOImpl extends JdbcDaoSupport implements InvAdvRptSitSub1DAO{

	public List<MastCarSeriesModel> getData() {
		List<MastCarSeriesModel> result = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT SERIES_ENAME, DISPLAY_SEQ ");
			sql.append("FROM MAST_CAR_SERIES_WOOT2 ");
			sql.append("WHERE DISPLAY_SEQ IS NOT NULL " );
			sql.append("ORDER BY DISPLAY_SEQ " );
			result =getJdbcTemplate().query(sql.toString(), new MastCarSeriesRowMapper());
		} catch (Exception ex) { 
			ex.printStackTrace();
		}
		return result;
	}
}
