package com.Springjpa.learnjpamapping.Repository;

import com.Springjpa.learnjpamapping.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Long> {
}
