package co.its.leishen.jpa.entity.composition.demo1;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @AssociationOverrides 使用此此注解指定多个关联覆盖
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName PartTimeEmployee1
 * @time 2018年9月17日 上午1:19:57
 */
@Entity
@AssociationOverrides({
    @AssociationOverride(name="address", joinColumns=@JoinColumn(name="ADDR_ID")),
    @AssociationOverride(name="healthPlan", joinColumns=@JoinColumn(name="PLAN_ID"))
})
public class PartTimeEmployee2  extends Employee{
	@ManyToOne
	protected HealthPlan healthPlan;
}
