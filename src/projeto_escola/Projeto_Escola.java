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
import java.util.ArrayList;
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
       int escMenu=0;
        
       ArrayList<Disciplina>materias = new ArrayList<>();
        ArrayList<Aluno>alunolist = new ArrayList<>();
       ArrayList<Professor>listProfessor = new ArrayList<>();
       
       
       do{
           escMenu=Integer.parseInt(JOptionPane.showInputDialog("escolha uma das opiçoes \n"
            +"1. Cadastro Disciplinas\n"
            +"2.Cadastro de alunos \n"
            +"3.cadastro professores\n"
           +"4. sair /n"));
       switch(escMenu){
           case 1 :{
               do{
                   String nome = JOptionPane.showInputDialog("qual nome ");
                   String departamento= JOptionPane.showInputDialog("Qual o departamento");
                   char Status = JOptionPane.showInputDialog("Status").charAt(0);
                   materias.add(new Disciplina(nome,departamento,Status));
               }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
               break;
               }
           case 2 :{
               String nomeAluno=JOptionPane.showInputDialog("Informe o nome do aluno ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula "));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data de matricula"));
        String rgAluno=JOptionPane.showInputDialog("iNFORME O rg DO ALUNO");
        String cpfAluno=JOptionPane.showInputDialog("Informe o cpf do aluno");
        Date dataNascimentoAluno=sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
        alunolist.add(new Aluno(matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno));
        
        if(JOptionPane.showConfirmDialog(null, "Oaluno ja se cadastrou em alguma disciplina?")==0);{
        String materiasExistentes="";
        for(Disciplina materia:materias){
            materiasExistentes += materias.indexOf(materia)+""+materia.getNome()+"\n";
        }
         do{   
            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a materia-- \n"+ materiasExistentes));
            alunolist.get(alunolist.size()-1).getDisciplinas().add(materias.get(esc));
            
    }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
           }
           break;
           }
       
           
           
           case 3 : {
               
           
           String nomeProfessor= JOptionPane.showInputDialog("Informe o nome do professor");
        int cargaHoraria =Integer.parseInt(JOptionPane.showInputDialog("Informe a acarga horaria"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String rg = JOptionPane.showInputDialog("Informe o rg");
        String cpf= JOptionPane.showInputDialog("cpf");
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento"));
           listProfessor.add(new Professor (cargaHoraria, valorHora, cpf, rg, cpf, dataNascimento));
           
           
           
           if(JOptionPane.showConfirmDialog(null, "O professor ja se cadastrou?")==0);
        String materiaExistentes="";
        for(Disciplina materia:materias){
            materiaExistentes += materias.indexOf(materia)+""+materia.getNome()+"\n";
        
         do{   
            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a materia-- \n"+ materiaExistentes));
            listProfessor.get(listProfessor.size()-1).getDiciplinas().add(materias.get(esc));
               
            }while((JOptionPane.showConfirmDialog(null,"deseja continuar?"))==0);
        }
           break;
           }
       }
       
      
       }while(escMenu!=4);

           }
       
       }
       
               
      
      
       
       
       
       
       








































    

    


// TODO code application logic here
       /* Disciplina disciplina;
        
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
    
}*/
