package meuapp;
public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas("Minhas Tarefas");

        Tarefa tarefa1 = new Tarefa("Estudar Java");
        Tarefa tarefa2 = new Tarefa("Fazer exercícios");

        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);

        lista.listarTarefas();
    }
}


