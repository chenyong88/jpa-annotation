package co.its.leishen.jpa.entity.composition.demo2;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

import co.its.leishen.jpa.entity.composition.demo2.Employee2;

/**
 * 
 * @AttributeOverrides用法
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName PartTimeEmployee4
 * @time 2018年9月17日 上午2:27:05
 */
@Entity
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="PTEMP_ID")),
    @AttributeOverride(name="hourlyWage", column=@Column(name="WAGE"))})
public class PartTimeEmployee4  extends Employee2{
	protected Float hourlyWage;
}
