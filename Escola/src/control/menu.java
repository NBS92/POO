/*
12) O protótipo do programa deve apresentar um menu a permitir as seguintes funcionalidades:

x a. Incluir um novo aluno;  
b. Incluir um novo funcionário;
c. Incluir uma nova turma;
x d. Emitir relatório de um aluno escolhido pelo usuário;
e. Emitir relatório de um funcionário escolhido pelo usuário;
f. Listar todos os funcionários pelo nome;
g. Mostrar o total de gastos com funcionários;
h. Listar todas as turmas por sigla e nome;
i. Mudar um aluno de turma;
j. Sair do sistema.

*/
package control;
import java.util.Scanner;

public class menu{
    static void gerarMenu(int qual){
        Scanner entrada = new Scanner(System.in);
        //Controladores
        controleAluno controleAluno = new controleAluno();
        controleFuncionario controleFunc = new controleFuncionario();
        controleTurma controleTurma = new controleTurma();
        String menu = "";
        int opcao;
        
        while(qual >=0){
            opcao = 0;
            switch(qual) {
            //Menu principal =======================================================
            case 0:
                menu = "\n"+
                       "Escolha uma categoria:\n"+
                       "[1] Aluno;\n"            +
                       "[2] Funcionario;\n"      +
                       "[3] Turma;\n\n";        
                       System.out.println(menu);
                       qual = entrada.nextInt();                             
                       
                break;
            //Menu Aluno ===========================================================
            case 1:
                menu = "\n"+
                       "Menu Aluno ============="+
                       "[1] Adicionar Aluno;\n"  +
                       "[2] Emitir Relatório Aluno;\n"+
                       "[0] Sair;\n\n";
                        while(opcao > 0){
                            System.out.println(menu);              
                            opcao = entrada.nextInt();
                            switch(opcao){

                                case 1://Adicionar Aluno
                                    System.out.println("\nEntre com nome do aluno:");
                                    String nome = entrada.nextLine();
                                    System.out.println("\nEntre com a matricula:(Atenção Nao pode ser alterada depois!");
                                    String matricula = entrada.nextLine();
                                    System.out.println("\nEntre com a data de nascimento!");
                                    String dataNascimento = entrada.nextLine();
                                    System.out.println("\nEntre com o documento de identiicação!");
                                    String doc = entrada.nextLine();                                    
                                    controleAluno.cadastrarAluno(nome, matricula, dataNascimento, doc);
                                    break;
                                case 2://Emitir relatorio de um aluno
                                    System.out.println("\nEntre com a matricula do aluno para pesquisa:");
                                    String matriculaPesq = entrada.nextLine();                                    
                                    controleAluno.getAluno(matriculaPesq);
                                    break;                            
                                default:
                                    System.out.println("Menu Invalido");
                                    break;                         
                            }
                        }
              break;
            //Menu Funcionario =====================================================
            case 2:
                menu = "\n"+
                       "Menu Funcionário ============="+
                       "[1] Adicionar Funcionário;\n"  +
                       "[2] Emitir Relatório Funcionário;\n"+
                       "[3] Emitir Relatório de Gastos Funcionários;\n"+
                       "[0] Sair;\n\n";            
                        while(opcao > 0){
                            System.out.println(menu);              
                            opcao = entrada.nextInt();
                            switch(opcao){

                                case 1://Adicionar Funcionario
                                    System.out.println("\nEntre com nome do Funcionario:");
                                    String nome = entrada.nextLine();
                                    System.out.println("\nEntre com a CPF:(Atenção Nao pode ser alterada depois!");
                                    String CPF = entrada.nextLine();
                                    System.out.println("\nEntre com o salario!");
                                    String salario = entrada.nextDouble();
                                    System.out.println("\nEntre com o documento de identiicação!");
                                    String doc = entrada.nextLine();
                                    System.out.print("Tipo de Funcionário (Coordenador, Diretor, Professor, Tecnico): ");
                                    String tipo = entrada.nextLine();                                    
                                    controleFunc.cadastrarFunc(nome, CPF, salario, doc, tipo);
                                    break;
                                case 2://Emitir relatorio de um Funcionario
                                    System.out.println("\nEntre com a matricula do aluno para pesquisa:");
                                    String matriculaPesq = entrada.nextLine();                                    
                                    controleFunc.getFuncionario(matriculaPesq);
                                    break;
                                case 3: //Emitir relatorio de gastos de um Funcionario
                                    System.out.println("Relatório de Gastos com Funcionários:");
                                    double totalGastos = controle.emitirRelatorioGastos();
                                    System.out.printf("Total de Gastos: R$ %.2f%n", totalGastos);
                                    break;                                              
                                default:
                                    System.out.println("Menu Invalido");
                                    break;                         
                            }
                        }   
                break;
            //Menu Turma ===========================================================
            case 3:
              menu = "\n"+
                       "Menu Turma ============="+
                       "[1] Adicionar Turma;\n"  +         
                       "[2] Mudar Turma Aluno;\n"  +     
                       "[0] Sair;\n\n";
                       while(opcao > 0){
                            System.out.println(menu);              
                            opcao = entrada.nextInt();
                            switch(opcao){

                                case 1://Adicionar Turma
                                    System.out.println("Entre com o nome do curso:");
                                    String nomeCurso = entrada.nextLine();
                                    System.out.println("Entre com o semestre/série:");
                                    int serieSemestre = entrada.nextInt();
                                    Curso curso = new Curso(nomeCurso);
                                    Turma turma = new Turma(curso, serieSemestre);
                                    
                                    // Você pode armazenar a turma em um controlador ou lista
                                    System.out.println("Turma adicionada com sucesso.");
                                    break;
                                case 2://Mudar a Turma
                                    System.out.println("Entre com a matrícula do aluno para pesquisa:");
                                    String matriculaAluno = entrada.nextLine();
                                    System.out.println("Entre com o nome do novo curso:");
                                    String nomeNovoCurso = entrada.nextLine();
                                    System.out.println("Entre com o semestre/série da nova turma:");
                                    int novoSerieSemestre = entrada.nextInt();                                    
                                    Curso novoCurso = new Curso(nomeNovoCurso); 
                                    Turma novaTurma = new Turma(novoCurso, novoSerieSemestre);
                                    
                                    Aluno aluno = controleAluno.getAluno(matriculaAluno);
                                    if (aluno != null) {
                                        controleTurma.mudarTurma(aluno, novaTurma);
                                        System.out.println("Aluno movido para a nova turma.");
                                    } else {
                                        System.out.println("Aluno não encontrado.");
                                    }
                                    break;                            
                                default:
                                    System.out.println("Menu Invalido");
                                    break;                         
                            }
                        } 
              
                break;

            default:
                menu = "Menu Invalido";
            }
        }                   
    }
    
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int menu_atual = 0;
         
        gerarMenu(menu_atual);            
        
    }
}
