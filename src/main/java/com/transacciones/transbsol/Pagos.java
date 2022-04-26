package com.transacciones.transbsol;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "transaccion")
public class Pagos {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int numtrans;
    @Column
    private String tfecha;
    @Column
    private String observacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumtrans() {
        return numtrans;
    }

    public void setNumtrans(int numtrans) {
        this.numtrans = numtrans;
    }

    public String getTfecha() {
        return tfecha;
    }

    public void setTfecha(String tfecha) {
        this.tfecha = tfecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
