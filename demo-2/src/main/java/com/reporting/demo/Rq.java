package com.reporting.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Document
@ToString
public class Rq {
	
	@Id
	private String id;
	private PSRequestHeader psRequestHeader;
	private PSRequestBody psRequestBody;

}
