package br.edu.infnet.saleAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.saleAPI.model.domains.Information;
import br.edu.infnet.saleAPI.model.services.InformationService;

@RestController
@RequestMapping("/api/information")
public class InformationController {

	@Autowired
	private InformationService informationService;
	
	@GetMapping(value = "/all")
	public List<Information> findAll(){

		return informationService.findAll();
		
	}

	@PostMapping(value = "/insert")
	public Information insert(@RequestBody Information information){

		return informationService.insert(information);

	};
}
