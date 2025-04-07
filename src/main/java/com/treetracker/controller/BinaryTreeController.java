package com.treetracker.controller;

import com.treetracker.model.BinaryTree;
import com.treetracker.service.BinaryTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BinaryTreeController {

    @Autowired
    private BinaryTreeService treeService;

    @PostMapping("/processNumbers")
    public ResponseEntity<BinaryTree> processNumbers(@RequestBody List<Integer> numbers) {
        BinaryTree response = treeService.processNumbers(numbers);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/previousTrees")
    public ResponseEntity<List<BinaryTree>> getPreviousTrees() {
        List<BinaryTree> response = treeService.getAllTrees();
        return ResponseEntity.ok(response);
    }
}