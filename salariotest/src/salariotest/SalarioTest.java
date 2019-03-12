package salariotest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalarioTest {

	@Test
	void testInss() {
		Salario salario = new Salario();
		double bruto = 1000;
		double inss = 80;
		
		assertEquals(inss, salario.inss(bruto));
	}

	@Test
	void testIrrf() {
		Salario salario = new Salario();
		double bruto = 3200;
		double irrf = 72.39;
		
		assertEquals(irrf, salario.irrf(bruto));
	}

	@Test
	void testSalarioLiquido() {
		Salario salario = new Salario();
		double bruto = 6300;
		double salLiquido = 5436.86;
		
		assertEquals(salLiquido, salario.salarioLiquido(bruto));
	}

}
