package Decorator;

public class AutenticadorFacial extends AutenticadorDecorator{
    public AutenticadorFacial(IUsuario usuario){
        super(usuario);
    }

    @Override
    public int getNivelSegurancaAutenticacao(){
        return 100;
    }
    @Override
    public String getNomeAutenticacao(){
        return "Facial";
    }
}