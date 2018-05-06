package com.reporting.demo;

import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Getter
@Setter
@ToString
public class PSRequestHeader {
	
	
	private Date dateTimestamp;
	private String UUID;
	private String channel;
	private String country;
	
}
