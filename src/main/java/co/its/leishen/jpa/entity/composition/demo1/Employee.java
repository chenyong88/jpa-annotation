package co.its.leishen.jpa.entity.composition.demo1;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class Employee {
	@Id
	protected Integer id;
	@Version
	protected Integer version;
	@ManyToOne
	protected Address address;
}
