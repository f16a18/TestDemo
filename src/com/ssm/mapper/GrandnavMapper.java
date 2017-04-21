package com.ssm.mapper;

import java.util.List;

import com.ssm.po.Navquery;

public interface GrandnavMapper {
	public List<Navquery> findGrandnavByUserid(int id) throws Exception;
		
}
