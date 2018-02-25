package com.examplealgaeorks.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplealgaeorks.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
