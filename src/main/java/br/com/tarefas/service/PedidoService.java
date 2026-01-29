package br.com.tarefas.service;

import br.com.tarefas.model.Pedido;
import br.com.tarefas.repository.PedidoRepository;

public class PedidoService {

   private PedidoRepository repository;

   public PedidoService(PedidoRepository repository){
       this.repository = repository;
   }

   public void pagarPedido(Long id){
       Pedido pedido = repository.getById(id);
       pedido.pagar();
   }
}
