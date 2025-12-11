/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiTipoAnalisis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public TipoAnalisis grabar(TipoAnalisis tipAna) {
        return repo.save(tipAna);
    }

    public TipoAnalisis buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<TipoAnalisis> listar() {
        return repo.findAll();
    }

    public TipoAnalisis actualizar(Long id, TipoAnalisis tipAna) {
        return repo.findById(id).map(existing -> {
            existing.setNom(tipAna.getNom());
            existing.setDes(tipAna.getDes());
            existing.setPre(tipAna.getPre());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
