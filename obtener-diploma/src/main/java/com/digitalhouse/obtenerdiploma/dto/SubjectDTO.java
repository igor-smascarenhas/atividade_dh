package com.digitalhouse.obtenerdiploma.dto;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class SubjectDTO {

  @NotBlank(message = "O nome da matéria é obrigatório")
  @Size(min = 8, max = 50, message = "Nome da matéria deve conter no mínimo 8 caracteres, máximo 50 caracteres")
  @Pattern(regexp = "^[A-z ]+$", message = "Atenção, digite somente letras")
  private String subject;

  @Min(value = 0, message = "Notas com numero negativo nao sao permitidas")
  @Max(value = 10, message = "O valor maximo para a nota é 10")
  private Integer note;

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

}
