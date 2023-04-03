package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AutenticadorTest {
    @Test
    void deveRetornarAutenticacaoMinima() {
        IUsuario usuario = new Autenticador();
        assertEquals("login e senha", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoComDoisFatores() {
        IUsuario usuario = new AutenticadorDoisFatores(new Autenticador());
        assertEquals("login e senha / Dois fatores", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoComBiometria() {
        IUsuario usuario = new AutenticadorBiometrico(new Autenticador());
        assertEquals("login e senha / Biometria", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoFacial() {
        IUsuario usuario = new AutenticadorFacial(new Autenticador());
        assertEquals("login e senha / Facial", usuario.getAutenticacao());
    }

    @Test
    void deveRetornarAutenticacaoComBiometriaEFacial() {
        IUsuario usuario = new AutenticadorBiometrico(new AutenticadorFacial(new Autenticador()));
        assertEquals("login e senha / Facial / Biometria", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoComDoisFatoresEBiometria(){
        IUsuario usuario = new AutenticadorBiometrico(new AutenticadorDoisFatores(new Autenticador()));
        assertEquals("login e senha / Dois fatores / Biometria", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoComDoisFatoresEFacial(){
        IUsuario usuario = new AutenticadorFacial(new AutenticadorDoisFatores(new Autenticador()));
        assertEquals("login e senha / Dois fatores / Facial", usuario.getAutenticacao());
    }
    @Test
    void deveRetornarAutenticacaoComDoisFatoresEFacialEBiometria(){
        IUsuario usuario = new AutenticadorFacial(new AutenticadorBiometrico(new AutenticadorDoisFatores(new Autenticador())));
        assertEquals("login e senha / Dois fatores / Biometria / Facial", usuario.getAutenticacao());
    }

    //

    @Test
    void deveRetornarNivelAutenticacaoMinima() {
        IUsuario usuario = new Autenticador();
        assertEquals(0, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoComDoisFatores() {
        IUsuario usuario = new AutenticadorDoisFatores(new Autenticador());
        assertEquals(1, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoComBiometria() {
        IUsuario usuario = new AutenticadorBiometrico(new Autenticador());
        assertEquals(10, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoFacial() {
        IUsuario usuario = new AutenticadorFacial(new Autenticador());
        assertEquals(100, usuario.getNivelAutenticacao());
    }

    @Test
    void deveRetornarNivelAutenticacaoComBiometriaEFacial() {
        IUsuario usuario = new AutenticadorBiometrico(new AutenticadorFacial(new Autenticador()));
        assertEquals(110, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoComDoisFatoresEBiometria(){
        IUsuario usuario = new AutenticadorBiometrico(new AutenticadorDoisFatores(new Autenticador()));
        assertEquals(11, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoComDoisFatoresEFacial(){
        IUsuario usuario = new AutenticadorFacial(new AutenticadorDoisFatores(new Autenticador()));
        assertEquals(101, usuario.getNivelAutenticacao());
    }
    @Test
    void deveRetornarNivelAutenticacaoComDoisFatoresEFacialEBiometria(){
        IUsuario usuario = new AutenticadorFacial(new AutenticadorBiometrico(new AutenticadorDoisFatores(new Autenticador())));
        assertEquals(111, usuario.getNivelAutenticacao());
    }
}
