package co.its.leishen.jpa.entity.composition.demo1;

import javax.persistence.AssociationOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

/**
 * 例子:覆盖映射的超类定义的关系的映射
 * 如果使用@AssociationOverride PartTimeEmployee1表将Address映射到列名为ADDR_ID上  
 * 如果不使用，则PartTimeEmployee1表将Address映射到列名为Address_ID列上
 * 
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName PartTimeEmployee1
 * @time 2018年9月17日 上午1:19:57
 */
@Entity
@AssociationOverride(name="address", joinColumns=@JoinColumn(name="ADDR_ID"))
public class PartTimeEmployee1  extends Employee{
	@Column(name="WAGE")
	protected Float hourlyWage;
}
