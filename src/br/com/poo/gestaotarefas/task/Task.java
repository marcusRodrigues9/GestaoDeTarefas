package br.com.poo.gestaotarefas.task;

public class Task {
    private int id;
    private String name;
    private String day;
    private boolean completed;

    public Task(int id, String name, String day, boolean completed) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", completed=" + completed +
                '}';
    }
}
