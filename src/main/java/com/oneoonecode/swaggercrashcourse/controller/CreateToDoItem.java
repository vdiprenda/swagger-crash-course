package com.oneoonecode.swaggercrashcourse.controller;

import com.oneoonecode.swaggercrashcourse.models.ToDoItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateToDoItem {
        @PostMapping(value = "/todos")
        public ResponseEntity<Object> createToDoItem(ToDoItem toDoItem) {
                return ResponseEntity.ok().body(toDoItem);
        }
        }
