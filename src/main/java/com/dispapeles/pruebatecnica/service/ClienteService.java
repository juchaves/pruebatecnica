/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dispapeles.pruebatecnica.service;

import com.dispapeles.pruebatecnica.model.Cliente;
import java.util.List;

/**
 *
 * @author jmcp1
 */
public interface ClienteService {
    List<Cliente> obtenerTodos();
    Cliente obtenerPorId(int id);
    void agregar(Cliente c);
    void modificar(Cliente c);
    void eliminar(int id);
}
