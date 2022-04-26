package com.transacciones.transbsol;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

//@Transactional
public interface PagosRepositorio extends Repository<Pagos,Integer> {
    //@Query("select p from transaccion p where p.tfecha >= :from and p.tfecha <= :to ")
    List<Pagos>findAll();
    //List<Pagos>findAll(@Param("from") LocalDateTime from, @Param("to") LocalDateTime to);
    Pagos findByid(int id);
    Pagos save(Pagos p);
    void delete(Pagos p);
    //@Query("SELECT s FROM transaccion s WHERE s.numtrans")
    //public List<Pagos>findnumtrans();
}
