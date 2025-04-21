package com.mouraforte.mfdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mouraforte.mfdesk.domain.Called;
import com.mouraforte.mfdesk.domain.Client;
import com.mouraforte.mfdesk.domain.Technician;
import com.mouraforte.mfdesk.domain.enums.Priority;
import com.mouraforte.mfdesk.domain.enums.Profiles;
import com.mouraforte.mfdesk.domain.enums.Status;
import com.mouraforte.mfdesk.repository.CalledRepository;
import com.mouraforte.mfdesk.repository.ClientRepository;
import com.mouraforte.mfdesk.repository.TechnicianRepository;

@SpringBootApplication
public class MfDeskApplication implements CommandLineRunner{
	
	@Autowired
	private TechnicianRepository technicianRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CalledRepository calledRepository;

	public static void main(String[] args) {
		SpringApplication.run(MfDeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Technician technician01 = new Technician(null, "Matus Moura", "26712013038","matus.moura@gmail.com", "123");
		technician01.addProfiles(Profiles.ADMIN);
		Technician technician02 = new Technician(null, "Beatriz Moura", "95803827002","beatriz.moura@gmail.com", "mmm123");
		technician01.addProfiles(Profiles.TECHNICIAN);
		
		Client client01 = new Client(null, "Doni Moura", "54567868005", "donivdemoura@gmail.com", "123");
		Client client02 = new Client(null, "Luna Moura", "60849078067", "lunavdemoura@gmail.com", "123543");
		
		Called called01 = new Called(null, Priority.MEDIUM, Status.PROGRESS,"Chamado 01","Peimeiro chamado",technician01, client01);
		Called called02 = new Called(null, Priority.LOW, Status.PROGRESS,"Chamado 02","Segundo chamado",technician01, client02);
		Called called03 = new Called(null, Priority.HIGH, Status.PROGRESS,"Chamado 03","Terceiro chamado",technician02, client01);
		Called called04 = new Called(null, Priority.MEDIUM, Status.PROGRESS,"Chamado 04","Quarto chamado",technician02, client02);
		
		technicianRepository.saveAll(Arrays.asList(technician01,technician02));
		clientRepository.saveAll(Arrays.asList(client01,client02));
		calledRepository.saveAll(Arrays.asList(called01,called02,called03,called04));
	}

}
