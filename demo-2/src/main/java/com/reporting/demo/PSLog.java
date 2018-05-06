package com.reporting.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Getter
@Setter
@ToString
public class PSLog {
	
	private String type;
	private String citiUUID;
	private String host;
	private String actionId;
	private String functionId;
	private Date startTime;
	private Date endTime;
	private String timeTaken;
	
}
