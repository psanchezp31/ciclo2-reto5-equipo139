/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.reto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mintic.reto.modelo.Contenido;
import java.util.List;

/**
 *
 * @author paula
 */
public interface ContenidoRepositorio
        extends JpaRepository<Contenido, Integer> {

    public List<Contenido> findByTipoAndTituloContainingIgnoreCase(
            String tipo,
            String titulo);

    public void save(String text);

}
