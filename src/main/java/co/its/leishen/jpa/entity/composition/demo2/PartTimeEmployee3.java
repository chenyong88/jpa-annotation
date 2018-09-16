package co.its.leishen.jpa.entity.composition.demo2;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

import co.its.leishen.jpa.entity.composition.demo2.Employee2;

/**
 * 
 * @AttributeOverride使用 
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName PartTimeEmployee3
 * @time 2018年9月17日 上午2:23:07
 */
@Entity
@AttributeOverride(name="id", column=@Column(name="PTEMP_ID"))
public class PartTimeEmployee3  extends Employee2{
	
}
