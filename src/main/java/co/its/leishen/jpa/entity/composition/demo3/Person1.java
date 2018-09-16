package co.its.leishen.jpa.entity.composition.demo3;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Person表中将生成id,country,province三个字段
 * 
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName Person
 * @time 2018年9月17日 上午2:52:22
 */
@Entity
@Data
public class Person1 {

	@Id
	private Integer id;
	@Embedded
	private Address address;
}
