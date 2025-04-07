package com.treetracker.repository;

import com.treetracker.model.BinaryTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryTreeRepository extends JpaRepository<BinaryTree, Long> {
}