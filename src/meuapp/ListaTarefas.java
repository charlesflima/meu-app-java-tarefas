package meuapp;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private String nome;
    private List<Tarefa> tarefas;

    public ListaTarefas(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        System.out.println("Lista de Tarefas (" + nome + "):");
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao());
        }
    }
}

