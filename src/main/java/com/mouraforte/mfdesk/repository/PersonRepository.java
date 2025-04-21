package com.mouraforte.mfdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraforte.mfdesk.domain.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{

}
