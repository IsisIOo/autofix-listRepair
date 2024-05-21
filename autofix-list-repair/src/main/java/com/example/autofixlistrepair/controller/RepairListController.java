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
@RequestMapping("/repair-list")
@CrossOrigin("*")
public class RepairListController {
    @Autowired
    RepairListService repairListService;

    @GetMapping
    public ResponseEntity<List<RepairList>> listRepairList() {
        List<RepairList> repairs = repairListService.getRepairsList();
        return ResponseEntity.ok(repairs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RepairList> getRepairListById(@PathVariable Long id) {
        RepairList repair = repairListService.getRepairListById(id);
        return ResponseEntity.ok(repair);
    }

    @GetMapping("/by-repair/{repairName}")
    public ResponseEntity<RepairList> getRepairListByName(@PathVariable String repairName) {
        RepairList repair = repairListService.getRepairListByName(repairName);
        return ResponseEntity.ok(repair);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RepairList> deleteRepairList(@PathVariable Long id) throws Exception {
        var isDeleted = repairListService.deleteRepairList(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/")
    public ResponseEntity<RepairList> updateRepairList(@PathVariable Long id, @RequestBody RepairList repair) {
        RepairList repairUpdated = repairListService.saveRepairList(repair);
        return ResponseEntity.ok(repairUpdated);
    }

    @PostMapping("/")
    public ResponseEntity<RepairList> saveRepairList(@RequestBody RepairList repair) {
        RepairList repairNew = repairListService.saveAndSendRepairList(repair);
        return ResponseEntity.ok(repairNew);
    }


}
