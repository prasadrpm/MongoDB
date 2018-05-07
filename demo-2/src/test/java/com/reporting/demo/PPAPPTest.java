package com.reporting.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.reporting.dao.ReportingDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PPAPPTest {

	
//	@Autowired
//	private ReportingDAO reportingDAO;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Rq constructReq() {
		Rq rq = new Rq();
		PSRequestHeader header = new PSRequestHeader();
		PSRequestBody body = new PSRequestBody();
		
		header.setDateTimestamp(new Date());
		header.setChannel("ECL");
		header.setCountry("UK");
		header.setUUID("weqwewe231231");
		
		body.setFwLogId("sdfsd").setPPName("FT");
		
		PSLog log = new PSLog();
		log.setActionId("FXTX").setCitiUUID("dsfsdf").setFunctionId("FXTX")
			.setHost("SIT").setStartTime(new Date()).setEndTime(new Date()).setTimeTaken("121");
		List<PSLog> logs = new ArrayList<>();
		logs.add(log);
		body.setLogs(logs);
		
		rq.setPsRequestHeader(header);
		rq.setPsRequestBody(body);
		
		return rq;
	}
	
	@Test
	public void testApp() {
		
		mongoTemplate.save(constructReq());
	}
	@Test
	public void testFind() {
		List<Rq> rqs = mongoTemplate.findAll(Rq.class);
		rqs.forEach(r-> System.out.println(r));
		assertEquals(2, rqs.size());
	}
}
