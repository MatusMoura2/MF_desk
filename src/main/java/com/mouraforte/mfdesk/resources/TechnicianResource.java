package com.mouraforte.mfdesk.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouraforte.mfdesk.domain.Technician;
import com.mouraforte.mfdesk.domain.dtos.TechnicianDTO;
import com.mouraforte.mfdesk.service.TechnicianService;

@RestController
@RequestMapping(value = "/technician")
public class TechnicianResource {
	
	@Autowired
	private TechnicianService technicianService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TechnicianDTO> findById(@PathVariable Integer id){
		Technician obj = technicianService.findById(id);
		return ResponseEntity.ok().body(new TechnicianDTO(obj));
	}
}
