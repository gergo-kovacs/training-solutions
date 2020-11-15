package intromethods;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTodo("meeting");
        todoList.addTodo("dinner");
        todoList.addTodo("talking");

        todoList.finishTodos("meeting");

        System.out.println(todoList.numberOfFinishedTodos());
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.listOfTodo);
        System.out.println(todoList);

    }
}
