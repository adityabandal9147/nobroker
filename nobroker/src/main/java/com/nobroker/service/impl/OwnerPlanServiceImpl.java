package com.nobroker.service.impl;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.repository.OwnerPlanRepository;
import com.nobroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {
    private OwnerPlanRepository ownerPlanRepository;
    private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository,ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto OwnerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(OwnerPlanDto);
        OwnerPlan savedOwnerPlan = ownerPlanRepository.save(ownerPlan);
         return mapToDto(savedOwnerPlan);

    }

    @Override
    public List<OwnerPlanDto> getAllOwnerPlans() {
        List<OwnerPlan> ownerPlans = ownerPlanRepository.findAll();
        List<OwnerPlanDto> ownerPlanDtos = ownerPlans.stream().map(plan -> mapToDto(plan)).collect(Collectors.toList());
        return ownerPlanDtos;
    }

    OwnerPlan mapToEntity(OwnerPlanDto OwnerPlanDto){
        OwnerPlan ownerPlan = modelMapper.map(OwnerPlanDto, OwnerPlan.class);
        return ownerPlan;
    }
    OwnerPlanDto mapToDto(OwnerPlan OwnerPlan){
        OwnerPlanDto ownerplandto = modelMapper.map(OwnerPlan, OwnerPlanDto.class);
        return ownerplandto;
    }
}
