package com.services;

import com.DTOs.LoanRequestDTO;
import com.DTOs.LoanResponseDTO;
import com.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<LoanResponseDTO> createLoan(LoanRequestDTO loanRequestDTO){

        String name = loanRequestDTO.name();
        String cpf = loanRequestDTO.cpf();
        int age = loanRequestDTO.age();
        String location = loanRequestDTO.location();
        Double income = loanRequestDTO.income();

        List<LoanResponseDTO> loan = new ArrayList<>();

            if (income > 3000) {
                loan.add(new LoanResponseDTO("PERSONAL", 4));
                loan.add(new LoanResponseDTO("GUARANTEED", 3));
            }

            if (income > 3000) {
                loan.add(new LoanResponseDTO("CONSIGNMENT", 2));
            }

            if (income > 3000 && income <= 5000 && age < 30 && "SP".equalsIgnoreCase(location)) {
                loan.add(new LoanResponseDTO("PERSONAL", 4));
                loan.add(new LoanResponseDTO("GUARANTEED", 3));
            }

            return loan;
    }
}
