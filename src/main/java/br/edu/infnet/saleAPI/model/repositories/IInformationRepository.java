package br.edu.infnet.saleAPI.model.repositories;

import org.springframework.stereotype.Repository;

import br.edu.infnet.saleAPI.model.domains.Information;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IInformationRepository extends CrudRepository<Information, Integer>{}
