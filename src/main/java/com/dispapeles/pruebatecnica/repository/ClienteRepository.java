/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dispapeles.pruebatecnica.repository;

import com.dispapeles.pruebatecnica.model.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jmcp1
 */
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
