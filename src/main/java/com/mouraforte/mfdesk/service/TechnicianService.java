package com.mouraforte.mfdesk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouraforte.mfdesk.domain.Technician;
import com.mouraforte.mfdesk.repository.TechnicianRepository;

@Service
public class TechnicianService {
	
	@Autowired
	private TechnicianRepository technicianRepository;
	
	public Technician findById(Integer id) {
		Optional<Technician> obj = technicianRepository.findById(id);
		return obj.orElse(null);
	}
}
