import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    Pessoa pessoa = new Pessoa();

    @Test
    public void testar_email_com_arroba() {
        assertTrue(pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres () {
        assertEquals(Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"), false);
    }

}
