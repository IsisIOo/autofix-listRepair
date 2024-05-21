package com.example.autofixlistrepair.service;

import com.example.autofixlistrepair.entity.RepairList;
//import com.example.autofixlistrepair.model.Repair;
import com.example.autofixlistrepair.repository.RepairListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class RepairListService {

    @Autowired
    RepairListRepository repairListRepository;
    @Autowired
    RestTemplate restTemplate;

    public ArrayList<RepairList> getRepairsList() {
        return (ArrayList<RepairList>) repairListRepository.findAll();
    }

    public RepairList getRepairListById(Long id) {
        return repairListRepository.findById(id).get();
    }

    public RepairList getRepairListByName(String name) {
        return repairListRepository.findByRepairName(name);
    }

    public RepairList saveRepairList(RepairList repairList) {
        return repairListRepository.save(repairList);
    }

    public RepairList saveAndSendRepairList(RepairList repairList) {
        return repairListRepository.save(repairList);
    }

    public boolean deleteRepairList(Long id) throws Exception {
        try{
            repairListRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
