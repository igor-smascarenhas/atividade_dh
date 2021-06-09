package com.digitalhouse.obtenerdiploma.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class StudentDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotBlank(message = "O nome do alun@ é obrigatório")
    @Size(min = 8, max = 50, message = "Nome do aluno deve conter no mínimo 8 caracteres, máximo 50 caracteres")
    @Pattern(regexp = "^[A-z ]+$", message = "Atenção, digite somente letras")
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Valid
    @Size(min = 2, message = "Devem conter no minimo duas matérias")
    private List<SubjectDTO> subjects;

    public StudentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

}
