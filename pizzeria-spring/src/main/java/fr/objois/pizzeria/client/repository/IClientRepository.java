package fr.objois.pizzeria.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.objois.pizzeria.client.domain.Client;
@Repository
public interface IClientRepository extends JpaRepository<Client, Integer>{
	

}
