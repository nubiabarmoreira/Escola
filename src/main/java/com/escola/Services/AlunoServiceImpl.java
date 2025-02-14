package com.escola.Services;

import com.escola.Dtos.AlunoDTO;
import com.escola.Models.AlunoModel;
import com.escola.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<AlunoDTO> getAllAlunos() {
        List<AlunoModel> alunos = alunoRepository.findAll();
        return alunos
                .stream()
                .map(alunoModel -> new AlunoDTO(alunoModel.getName(), alunoModel.getAge()))
                .collect(Collectors.toList());
    }
}
