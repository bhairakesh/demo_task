package com.nic.demo_task.dao;

import com.nic.demo_task.entity.DistMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistDao extends JpaRepository<DistMaster, Long> {

}
