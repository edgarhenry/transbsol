package com.transacciones.transbsol;

import java.time.LocalDateTime;
import java.util.List;

public interface PagosService {
    List<Pagos> listar();
    //List<Pagos> listar(LocalDateTime from,LocalDateTime to);
    Pagos listarId(int id);
    Pagos add(Pagos p);
    Pagos edit(Pagos p);
    Pagos delete(int id);


}
