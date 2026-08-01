package com.sagar.transalert.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "alert_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertEvent extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alert_id", nullable = false)
    private Alert alert;

    @Column(name = "event_type", nullable = false)
    private String eventType;

    @Column(name = "performed_by")
    private String performedBy;

    @Column(length = 500)
    private String remarks;

    @Column(name = "event_time", nullable = false)
    private LocalDateTime eventTime;
}