package com.example.autofixlistrepair.controller;

import com.example.autofixlistrepair.entity.RepairList;
//import com.example.autofixlistrepair.model.;
import com.example.autofixlistrepair.service.RepairListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/repair-list")
@CrossOrigin("*")
public class RepairListController {
    @Autowired
    RepairListService repairListService;

    @GetMapping
    public ResponseEntity<List<RepairList>> listRepairList() {
        List<RepairList> repairs = repairListService.getRepairsList();
        return ResponseEntity.ok(repairs);
    }

}
