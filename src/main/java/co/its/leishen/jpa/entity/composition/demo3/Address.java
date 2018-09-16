package co.its.leishen.jpa.entity.composition.demo3;

import javax.persistence.Embeddable;

import lombok.Data;
/**
 * @Embeddable注解使用
 * @author chenyong
 * @projectName jpa-annotation
 * @typeName Address
 * @time 2018年9月17日 上午2:52:27
 */
@Embeddable
@Data
public class Address {
	private String country;
	private String province;
}
