package com.controllers;

import com.DTOs.LoanRequestDTO;
import com.DTOs.LoanResponseDTO;
import com.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Map<String, Object> createLoan(@RequestBody LoanRequestDTO loanRequestDTO){

        List<LoanResponseDTO> loan = loanService.createLoan(loanRequestDTO);

        Map<String, Object> response = new HashMap<>();

        response.put("user", loanRequestDTO.name());
        response.put("loans", loan);

        return response;
    }
}
