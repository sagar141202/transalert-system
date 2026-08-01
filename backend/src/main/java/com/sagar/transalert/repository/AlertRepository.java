package com.sagar.transalert.repository;

import com.sagar.transalert.entity.Alert;
import com.sagar.transalert.enums.AlertStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Long> {

    List<Alert> findByStatus(AlertStatus status);

}