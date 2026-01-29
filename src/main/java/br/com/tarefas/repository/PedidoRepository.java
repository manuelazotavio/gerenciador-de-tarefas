package br.com.tarefas.repository;

import br.com.tarefas.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    public Pedido getById(Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("Pedido não encontrado."));
    }

    public void salvar(Pedido pedido){
        pedidos.add(pedido);
    }


}
