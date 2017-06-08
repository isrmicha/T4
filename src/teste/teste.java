package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import principal.Funcionario;

public class teste {
	Funcionario f;
	
	@Test
	public void test() {
		
		assertEquals(f = new Funcionario("Davi",2),false);
		assertEquals(f = new Funcionario("Israel",800),false);
	}

}
