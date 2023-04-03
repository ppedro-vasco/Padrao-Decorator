package Decorator;

public abstract class AutenticadorDecorator implements IUsuario{
    private IUsuario usuario;
    public String estrutura;

    public AutenticadorDecorator (IUsuario usuario){
        this.usuario = usuario;
    }

    public IUsuario getUsuario(){
        return usuario;
    }

    public void setUsuario(){
        this.usuario = usuario;
    }

    public abstract int getNivelSegurancaAutenticacao();
    @Override
    public int getNivelAutenticacao(){
        return this.usuario.getNivelAutenticacao() + (this.getNivelSegurancaAutenticacao());
    }

    public abstract String getNomeAutenticacao();
    @Override
    public String getAutenticacao(){
        return this.usuario.getAutenticacao() + " / " + this.getNomeAutenticacao();
    }
    public void setAutenticacao(String estrutura){
        this.estrutura = estrutura;
    }
}
