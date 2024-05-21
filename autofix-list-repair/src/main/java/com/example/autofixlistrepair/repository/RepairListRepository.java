package com.example.autofixlistrepair.repository;

import com.example.autofixlistrepair.entity.RepairList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
public interface RepairListRepository extends JpaRepository<RepairList, Long>{
    public RepairList findByRepairName(String name);
}
