package com.nobroker.service;

import com.nobroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto OwnerPlanDto);

    List<OwnerPlanDto> getAllOwnerPlans();
}
