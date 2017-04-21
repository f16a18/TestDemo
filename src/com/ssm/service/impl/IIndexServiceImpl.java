package com.ssm.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.GrandnavMapper;
import com.ssm.po.Navquery;
import com.ssm.service.IIndexService;

public class IIndexServiceImpl implements IIndexService{

	@Resource
	@Autowired
	private GrandnavMapper grandMapper;
	@Override
	public List<Navquery> findGrandnavByUserid(int id) throws Exception {
		// TODO Auto-generated method stub
		
		return grandMapper.findGrandnavByUserid(id);
	}

}
