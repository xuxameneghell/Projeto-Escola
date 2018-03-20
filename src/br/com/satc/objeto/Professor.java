/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author ricardo.150317
 */
public class  Professor extends Pessoa {
    ArrayList<Disciplina> diciplinas = new ArrayList<Disciplina> ();
    private Integer cargaHoraria;
    private float valorHora;
    private float salario;

    @Override
    public String toString() {
        return "Professor{" + "diciplinas=" + diciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

    

    public Professor(Integer cargaHoraria, float valorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario=calculaSalario(valorHora,cargaHoraria);
    }
    public float calculaSalario(float valorHora,float cargaHoraria){
    return valorHora*cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public ArrayList<Disciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(ArrayList<Disciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

    
    
}
