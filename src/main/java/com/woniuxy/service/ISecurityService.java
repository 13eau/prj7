package com.woniuxy.service;

import java.util.List;
import com.woniuxy.entity.Security;
public interface ISecurityService {
	void save(Security security);
	void delete (Integer plSid);
	void update(Security security);
	List<Security> findAll();
	Security findOne(Integer plSid);
}
