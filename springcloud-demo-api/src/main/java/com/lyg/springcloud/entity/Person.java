package com.lyg.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
@SuppressWarnings("all")
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id ;
	private String name;
	private String age;
	private String sex;
	private String source; //数据来源
}