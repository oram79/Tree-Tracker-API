package com.treetracker.model;

import jakarta.persistence.*;

@Entity
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nodeId;

    private int value;

    @OneToOne(cascade=CascadeType.ALL)
    private Node left;

    @OneToOne(cascade=CascadeType.ALL)
    private Node right;


    public Node(int value) {
        this.value = value;
    }

    public Node() {}

    public Long getId() {
        return nodeId;
    }

    public void setId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
