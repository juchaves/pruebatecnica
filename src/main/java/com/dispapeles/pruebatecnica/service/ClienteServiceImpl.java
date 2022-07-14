/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dispapeles.pruebatecnica.service;

import com.dispapeles.pruebatecnica.model.Cliente;
import com.dispapeles.pruebatecnica.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmcp1
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> obtenerTodos() {
        return (List<Cliente>) repo.findAll();
    }

    @Override
    public Cliente obtenerPorId(int id) {
        Optional<Cliente> retorno = repo.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        else
            return null;
    }

    @Override
    public void agregar(Cliente c) {
        repo.save(c);
    }

    @Override
    public void modificar(Cliente c) {
        repo.save(c);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
    
}
