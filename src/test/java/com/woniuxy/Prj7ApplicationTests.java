package com.woniuxy;



import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.entity.Party;
import com.woniuxy.mapper.AssembleMapper;
import com.woniuxy.mapper.PartyMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Prj7ApplicationTests {
	@Resource
	private PartyMapper partyMapper;
	@Test
	public void contextLoads() {
		Party party = partyMapper.selectByPrimaryKey(1);
		System.out.println(party);
	}
}
