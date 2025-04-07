package com.treetracker.service;

import com.treetracker.model.BinaryTree;
import com.treetracker.model.Node;
import com.treetracker.repository.BinaryTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BinaryTreeService {

    @Autowired
    private BinaryTreeRepository treeRepository;

    public BinaryTree processNumbers(List<Integer> numbers) {
        Node root = null;
        for (int num : numbers) {
            root = insertNode(root, num);
        }

        BinaryTree tree = new BinaryTree(null, numbers.toString(), root);
        return treeRepository.save(tree);
    }

    public List<BinaryTree> getAllTrees() {
        return treeRepository.findAll();
    }

    private Node insertNode(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.getValue()) root.setLeft(insertNode(root.getLeft(), value));
        else root.setRight(insertNode(root.getRight(), value));
        return root;
    }
}