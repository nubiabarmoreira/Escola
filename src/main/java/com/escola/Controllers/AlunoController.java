package com.escola.Controllers;

import com.escola.Dtos.AlunoDTO;
import com.escola.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    public ResponseEntity<List<AlunoDTO>> getAllAlunos() {
        return ResponseEntity.ok(alunoService.getAllAlunos());
    }
}
