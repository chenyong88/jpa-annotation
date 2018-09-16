package co.its.leishen.jpa.repository.composition.demo3;

import org.springframework.data.jpa.repository.JpaRepository;

import co.its.leishen.jpa.entity.composition.demo3.Person;
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
