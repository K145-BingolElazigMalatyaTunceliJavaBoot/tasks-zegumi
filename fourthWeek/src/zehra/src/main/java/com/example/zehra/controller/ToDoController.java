package zehra.src.main.java.com.example.zehra.controller;

import java.util.List;

public class ToDoController {
    @RestController

    @Autowired
    private ToDoRepo todorepo;

    public List<TodoItem> findAll(){
        return todorepo findAll();
    }
    @PostMapping
    public TodoItem
}
