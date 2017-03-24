package com.wut.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wut.model.MastCarSeriesModel;

public class MastCarSeriesRowMapper implements RowMapper<MastCarSeriesModel> {

	public MastCarSeriesModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		MastCarSeriesModel obj = new MastCarSeriesModel();
		obj.setSeriesEname(rs.getString("SERIES_ENAME"));
		obj.setDisplaySeq(rs.getString("DISPLAY_SEQ"));
		return obj;
	}

}
