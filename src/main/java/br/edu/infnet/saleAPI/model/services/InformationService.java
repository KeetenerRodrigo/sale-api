package br.edu.infnet.saleAPI.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.saleAPI.model.domains.Information;
import br.edu.infnet.saleAPI.model.repositories.IInformationRepository;

@Service
public class InformationService {
	
	@Autowired
	private IInformationRepository repository;

	public List<Information> findAll() {
		return (List<Information>) repository.findAll();
	}

	public Information insert(Information information) {
		return repository.save(information);
	};

}
