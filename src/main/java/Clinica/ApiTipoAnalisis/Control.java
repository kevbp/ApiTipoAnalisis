/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiTipoAnalisis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoAnalisis")
public class Control {

    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public TipoAnalisis grabar(@RequestBody TipoAnalisis tipAna) {
        return serv.grabar(tipAna);
    }

    @GetMapping("/buscar/{id}")
    public TipoAnalisis buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listar")
    public List<TipoAnalisis> listar() {
        return serv.listar();
    }

    @PutMapping("/actualizar/{id}")
    public TipoAnalisis actualizar(@PathVariable Long id, @RequestBody TipoAnalisis tipAna) {
        return serv.actualizar(id, tipAna);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);
    }
}
