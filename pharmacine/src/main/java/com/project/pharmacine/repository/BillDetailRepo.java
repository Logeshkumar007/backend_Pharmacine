package com.project.pharmacine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pharmacine.model.BillDetail;

@Repository
public interface BillDetailRepo extends JpaRepository<BillDetail,Integer>{
    
}
