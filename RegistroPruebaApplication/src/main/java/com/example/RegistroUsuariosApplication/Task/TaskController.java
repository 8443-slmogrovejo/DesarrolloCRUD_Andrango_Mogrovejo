package com.example.RegistroUsuariosApplication.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;


@RestController
@RequestMapping(path = "api/v1/tasks")

public class TaskController {

    private final TaskService userService;
    private List<Task> tasks = new ArrayList<>();

    @Autowired
    public TaskController(TaskService userService) {
        this.userService = userService;
        tasks = userService.getProducts(); // Llenar la lista con las tareas obtenidas
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllProducts() {
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }


    //@PostMapping
    //public ResponseEntity<Object> crearUser(@RequestBody Task user) {
        //return userService.createProduct(user);
    //}

    @PostMapping
    public ResponseEntity<Object> crearUser(@ModelAttribute Task user) {
        return userService.createProduct(user);
    }
    @PutMapping
    public ResponseEntity<Object> actualizarUser(@RequestBody Task user) {
        return userService.updateProduct(user);
    }

    //@DeleteMapping(path = "{userId}")
    @DeleteMapping(path = "{userId}")
    public ResponseEntity<Object> eliminarUser(@PathVariable("userId") Long userId) {
        return userService.deleteProduct(userId);
    }

}