package salariotest;

public class Salario {
	double bruto;
	double liquido;
	
	public Salario() {
		
	}
	
	public double inss(double bruto) {
		double inss = 0.0;
		
		if (bruto >= 0 & bruto <= 1693.72) {
			inss = (bruto * 0.08);
		}
		if (bruto >= 1693.73 & bruto <= 2822.90) {
			inss = (bruto * 0.09);
		}
		if (bruto >= 2822.91 & bruto <= 5645.80) {
			inss = (bruto * 0.11);
		}
		
		return inss;
	}
	
	public double irrf(double salario) {
		double contrib = inss(salario);
		double novoSalario = (salario - contrib);
		double irrf = 0;
		
		if (novoSalario >= 0 & novoSalario < 1903.99) {
			irrf = 0;
		}
		if (novoSalario > 1903.99 & novoSalario < 2826.65) {
			irrf = ((novoSalario * 0.075) - 142.80);
		}
		if (novoSalario > 2826.66 & novoSalario < 3751.05) {
			irrf = ((novoSalario * 0.15) - 354.80);
		}
		if (novoSalario > 3751.06 & novoSalario < 4664.68) {
			irrf = ((novoSalario * 0.225) - 636.13);
		}
		if (novoSalario > 4664.69) {
			irrf = ((novoSalario * 0.275) - 869.36);
		}
		
		return irrf;
	}
	
	public double salarioLiquido(double bruto) {
		double inss = inss(bruto);
		double irrf = irrf(bruto);
		     
		double salLiquido = (bruto - inss - irrf);
		
		return salLiquido;
	}

}
