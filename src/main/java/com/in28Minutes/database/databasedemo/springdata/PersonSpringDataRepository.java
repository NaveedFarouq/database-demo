package com.in28Minutes.database.databasedemo.springdata;

import com.in28Minutes.database.databasedemo.entity.Person;
import com.in28Minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
