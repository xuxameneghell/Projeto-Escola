/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_escola;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo.150317
 */
public class Projeto_Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Disciplina disciplina;
        
        String nome = JOptionPane.showInputDialog("Informe o nome da disciplina");
        String departamento = JOptionPane.showInputDialog("Informe o departamento");
        char status= JOptionPane.showInputDialog("INFORME O STATUS").charAt(0);
        disciplina=new Disciplina(nome, departamento, status);
        JOptionPane.showMessageDialog(null,disciplina.toString());
        
        Professor professor;
        String nomeProfessor= JOptionPane.showInputDialog("Informe o nome do professor");
        int cargaHoraria =Integer.parseInt(JOptionPane.showInputDialog("Informe a acarga horaria"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora"));
        String rg = JOptionPane.showInputDialog("Informe o rg");
        String cpf= JOptionPane.showInputDialog("cpf");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
        professor = new Professor(cargaHoraria, valorHora, nome, rg, cpf, dataNascimento, cargaHoraria);
        JOptionPane.showMessageDialog(null,professor.toString());
        
        Aluno aluno;
        
        
        String nomeAluno=JOptionPane.showInputDialog("Informe o nome do aluno ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula "));
        Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data de matricula"));
        String rgAluno=JOptionPane.showInputDialog("iNFORME O rg DO ALUNO");
        String cpfAluno=JOptionPane.showInputDialog("Informe o cpf do aluno");
        Date dataNascimentoAluno=sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
        aluno=new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento, matricula);
        JOptionPane.showMessageDialog(null,aluno.toString());
    }
    
}
