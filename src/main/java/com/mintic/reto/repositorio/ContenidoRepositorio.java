/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.reto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mintic.reto.modelo.Contenido;

/**
 *
 * @author paula
 */
public interface ContenidoRepositorio
        extends JpaRepository<Contenido, Integer> {

}
