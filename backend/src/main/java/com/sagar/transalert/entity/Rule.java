package com.sagar.transalert.entity;

import com.sagar.transalert.enums.RuleType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rule extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String ruleCode;

    @Column(nullable = false)
    private String ruleName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RuleType ruleType;

    @Column(nullable = false)
    private Double thresholdValue;

    @Column(nullable = false)
    private Integer priority;

    @Column(nullable = false)
    private Boolean enabled;

    @Column(length = 500)
    private String description;
}