package com.transacciones.transbsol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PagosServiceImp implements PagosService{

@Autowired
private PagosRepositorio repositorio;


/*    @Override
    public List<Pagos> listar(LocalDateTime from,LocalDateTime to) {
        return repositorio.findAll(from,to);
    }
*/
    @Override
    public List<Pagos> listar() {
        return repositorio.findAll();
        //return repositorio.findnumtrans();
    }

    @Override
    public Pagos listarId(int id) {
        return repositorio.findByid(id);
    }

    @Override
    public Pagos add(Pagos p) {
        return repositorio.save(p);
    }

    @Override
    public Pagos edit(Pagos p) {
        return repositorio.save(p);
    }

    @Override
    public Pagos delete(int id) {
        Pagos p = repositorio.findByid(id);
        if(p!=null) {
            repositorio.delete(p);
        }
        return p;
    }


}
