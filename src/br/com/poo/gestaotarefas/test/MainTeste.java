package br.com.poo.gestaotarefas.test;

import br.com.poo.gestaotarefas.task.Task;

public class MainTeste {
    public static void main(String[] args) {
       Task task = new Task(1, "testTask", "5", true);
        System.out.println(task.toString());
    }
}
