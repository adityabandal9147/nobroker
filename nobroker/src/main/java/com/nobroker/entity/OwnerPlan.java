package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="owner_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlan {
    @Id
     private long PlanId;
    @Column(name ="plan_name",unique = true)
     private String planName;
    @Column(name ="price")
     private double price;
    @Column(name ="plan_Validity")
     private int planValidity;
    @Column(name ="relationship_manager")
     private boolean relationshipManager;
    @Column(name ="Rental_agreement")
     private boolean RentalAgreement;
    @Column(name ="Property_promotion")
    private boolean PropertyPromotion;
    @Column(name ="guaranteed_tenants")
    private boolean guaranteedTenants;
    @Column(name ="Showing_property")
    private boolean ShowingProperty;
    @Column(name ="Facebook_marketing_of_property")
    private boolean FacebookMarketingOfProperty;
}
