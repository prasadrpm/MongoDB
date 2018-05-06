package com.reporting.demo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@Getter
@Setter
@ToString
public class PSRequestBody {

	private String PPName;
	private String fwLogId;
	private List<PSLog> logs;
}
