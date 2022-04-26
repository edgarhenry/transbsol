package com.transacciones.transbsol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/transaccion"})
public class Controlador {
    @Autowired
    PagosService service;
    @GetMapping
    public List<Pagos> listar(){
        return service.listar();
    }
    /*@GetMapping
    public List<Pagos> getByStartDateBetween(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime from,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") LocalDateTime to) {
        return service.findByFechaAltaBetween(from, to);
    }*/

    @PostMapping
    public Pagos agregar(@RequestBody Pagos p){
        return service.add(p);
    }
    @GetMapping(path={"/{id}"})
    public Pagos listarId(@PathVariable("id")int id){

        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Pagos editar(@RequestBody Pagos p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Pagos delete(@PathVariable("id")int id){
                return service.delete(id);
    }

}
