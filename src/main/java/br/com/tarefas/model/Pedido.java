package br.com.tarefas.model;

import br.com.tarefas.exception.PedidoJaPagoException;

import java.math.BigDecimal;

public class Pedido {
    private Long id;
    private BigDecimal valor;
    private Status status;

    public Pedido(Long id, BigDecimal valor, Status status){
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public Long getId(){
        return id;
    }

    public void pagar() {
        if(status == Status.PAGO){
            throw new PedidoJaPagoException("O pedido já está pago.");
        }

        this.status = Status.PAGO;
    }




}
