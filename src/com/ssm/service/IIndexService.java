package com.ssm.service;

import java.util.List;

import com.ssm.po.Navquery;

public interface IIndexService {
	public List<Navquery> findGrandnavByUserid(int id) throws Exception;
}
