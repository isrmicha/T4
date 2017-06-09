package funcexc;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionarioTest {
	Funcionario f;

	@Test(expected = ViolacaoCltException.class)
	public void testViolacaoCltException() {
		f = new Funcionario("Davi", 300);
		f = new Funcionario("Israel", 800);
		assertEquals(f.getNome(),"Israel");
	}

}
