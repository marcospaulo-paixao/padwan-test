package com.padwan.test.dto;

import com.padwan.test.entity.Jedi;
import com.padwan.test.enums.StatusEnum;

public class AtualizaJediDTO{

    private String nome;
    private StatusEnum status;
    private String nomeMentor;
    private Integer idMentor;
    private Integer idAprendiz;

    public AtualizaJediDTO(){}

    public AtualizaJediDTO(Jedi aprendiz,Jedi mentor){
        this.nome = aprendiz.getNome();
        this.idAprendiz = aprendiz.getId();
        this.idMentor = mentor.getId();
        this.status = aprendiz.getStatusEnum();
        this.nomeMentor = mentor.getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMentor() {
        return this.nomeMentor;
    }

    public void setNomeMentor(String nomeMentor) {
        this.nomeMentor = nomeMentor;
    }

    public StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Integer getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(Integer idMentor) {
        this.idMentor = idMentor;
    }

    public Integer getIdAprendiz() {
        return idAprendiz;
    }

    public void setIdAprendiz(Integer idAprendiz) {
        this.idAprendiz = idAprendiz;
    }
}
