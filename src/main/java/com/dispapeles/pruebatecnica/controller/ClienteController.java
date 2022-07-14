/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dispapeles.pruebatecnica.controller;

import com.dispapeles.pruebatecnica.model.Cliente;
import com.dispapeles.pruebatecnica.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jmcp1
 */
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
public class ClienteController {
    @Autowired
    private ClienteService service;
    
    @GetMapping("/cliente")
    public List<Cliente> obtenerClientes() {
        return service.obtenerTodos();
    }
    
    @GetMapping("/cliente/{id}")
    public Cliente obtenerCliente(@PathVariable int id ) {
        return service.obtenerPorId(id);
    }
    
    @PostMapping("/cliente")
    public void agregarCliente(@RequestBody Cliente c ) {
        service.agregar(c);
    }
    
    @PatchMapping("/cliente")
    public void modificarCliente(@RequestBody Cliente c ) {
        service.modificar(c);
    }
    
    @DeleteMapping("/cliente/{id}")
    public void eliminarCliente(@PathVariable int id ) {
        service.eliminar(id);
    }
            
}
