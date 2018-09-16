package co.its.leishen.jpa.repository.composition.demo1;

import org.springframework.data.jpa.repository.JpaRepository;

import co.its.leishen.jpa.entity.composition.demo1.HealthPlan;
public interface HealthPlanRepository extends JpaRepository<HealthPlan, Integer> {

}
