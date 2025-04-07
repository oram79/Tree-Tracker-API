package com.treetracker.model;

import jakarta.persistence.*;

@Entity
public class BinaryTree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TreeId;

    @Column(nullable = false)
    private String inputNumbers;

    @OneToOne(cascade = CascadeType.ALL)
    private Node root;

    public BinaryTree() {}

    public BinaryTree(Long TreeId, String inputNumbers, Node root) {
        this.TreeId = TreeId;
        this.inputNumbers = inputNumbers;
        this.root = root;
    }

    public Long getId() {
        return TreeId;
    }

    public void setId(Long TreeId) {
        this.TreeId = TreeId;
    }

    public String getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(String inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
