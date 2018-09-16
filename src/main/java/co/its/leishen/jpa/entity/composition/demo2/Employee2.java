package co.its.leishen.jpa.entity.composition.demo2;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Employee2 {
	@Id
	protected Integer id;
}
