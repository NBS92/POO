package model.Usuario;
import model.Autenticavel;

public abstract class usuario implements Autenticavel {
    private String senha;

    public usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
    // Métodos adicionais comuns a todos os usuários podem ser adicionados aqui
}

