package Decorator;
public class AutenticadorBiometrico extends AutenticadorDecorator{
    public AutenticadorBiometrico(IUsuario usuario){
        super(usuario);
    }

    @Override
    public int getNivelSegurancaAutenticacao(){
        return 10;
    }
    @Override
    public String getNomeAutenticacao(){
        return "Biometria";
    }
}
