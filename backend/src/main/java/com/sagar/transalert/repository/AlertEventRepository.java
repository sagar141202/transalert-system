package com.sagar.transalert.repository;

import com.sagar.transalert.entity.AlertEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertEventRepository extends JpaRepository<AlertEvent, Long> {

    List<AlertEvent> findByAlertId(Long alertId);

}