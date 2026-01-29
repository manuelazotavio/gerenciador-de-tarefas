package br.com.tarefas.service;

import br.com.tarefas.model.Pedido;
import br.com.tarefas.repository.PedidoRepository;

//papel do service é coordenar a acao, chamando o repository e os metodos do pedido. nao é papel dele realizar a acao

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
