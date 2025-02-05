package wk5;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<String> tasksList = new ArrayList<>();

    public void addTask(String task) {
        if(task.length() > 2 && !tasksList.contains(task)) {
            tasksList.add(task);
        }
    }

    public void addTasks(String... tasks){
        for(String task : tasks) {
            addTask(task);
        }
    }

    public void removeTask(String task) {
        tasksList.remove(task);
    }
    public String getTaskByNumber(int number) {
        return tasksList.get(number - 1);
    }

    public void updateTask(String oldTask, String newTask) {
        if(!tasksList.contains(oldTask)) {
            throw new IllegalArgumentException("Task '"+oldTask+"' does not exist " +
                    "in list");
        }
            tasksList.set( tasksList.indexOf(oldTask), newTask   );

    }

    public void splitTask(String oldTask, String... newTasks){
        if(!tasksList.contains(oldTask)){
            throw new IllegalArgumentException("Task '"+oldTask+"' NOT FOUND in task list");
        }
        tasksList.remove(oldTask);
        addTasks(newTasks);
    }
}
