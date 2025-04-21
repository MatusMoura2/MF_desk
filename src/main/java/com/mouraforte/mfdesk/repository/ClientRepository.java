package com.mouraforte.mfdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouraforte.mfdesk.domain.Client;

public interface ClientRepository  extends JpaRepository<Client, Integer>{

}
