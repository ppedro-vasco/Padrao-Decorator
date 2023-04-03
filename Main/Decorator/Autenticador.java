package Decorator;

public class Autenticador implements IUsuario{
    public int nivelSeguranca = 0;

    public Autenticador(){
    }
    @Override
    public int getNivelAutenticacao(){
        return nivelSeguranca;
    }
    @Override
    public String getAutenticacao(){
        return "login e senha";
    }
}
