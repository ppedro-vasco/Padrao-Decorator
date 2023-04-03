package Decorator;

public class AutenticadorDoisFatores extends AutenticadorDecorator{
    public AutenticadorDoisFatores(IUsuario usuario){
        super(usuario);
    }

    @Override
    public int getNivelSegurancaAutenticacao(){
        return 1;
    }
    @Override
    public String getNomeAutenticacao(){
        return "Dois fatores";
    }
}

