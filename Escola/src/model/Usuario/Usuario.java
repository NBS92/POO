/*
9) O sistema permite fazer login, com CPF e senha (outro) para professor, coordenador e diretor. 
Alunos também fazem login, usando matrícula e senha. Necessariamente, use uma interface para definir um contrato para 
qualquer classe que deseje que seus objetos sejam autenticáveis. Na interação com o usuário, é preciso ter uma opção para
fazer login e o resultado disso pode ser apenas uma simples mensagem indicando se o login foi feito ou não.
*/
package model.Usuario;
import model.Autenticavel;

public abstract class Usuario implements Autenticavel {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
    // Métodos adicionais comuns a todos os usuários podem ser adicionados aqui
}

