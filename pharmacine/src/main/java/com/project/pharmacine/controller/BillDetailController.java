package com.project.pharmacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacine.model.BillDetail;
import com.project.pharmacine.repository.BillDetailRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BillDetailController {
    @Autowired
    BillDetailRepo billDetailRepo;
    @PostMapping("/bill/post")
    public BillDetail postMethodName(@RequestBody BillDetail entity) {
        return billDetailRepo.save(entity);
    }
    
}
