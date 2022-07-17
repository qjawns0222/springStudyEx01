package org.zerock.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.ToString;
@ToString
@Data
public class TodoDTO {
	private String title;
	@DateTimeFormat(pattern="yyyy/mm/dd")
	private Date dueDate;
}
