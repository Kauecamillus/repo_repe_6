package repeticao_6;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		String encerrar = "";
		
		while (!encerrar.equalsIgnoreCase("S"));
		String inputN = JOptionPane.showInputDialog("Digite quantas horas você trabalhou: ");
		double N = Double.parseDouble(inputN);
		
		double E = 0.0;
		double salarioexcedente = 0.0;
		double salariototal = 0.0;
		
		if (N > 50) {
			E = N - 50;
			salarioexcedente = E * 20.0;
			salariototal = (50 * 10.0) + salarioexcedente;
		}
		
		if ( N <= 50) {
			E = 0.0;
			salarioexcedente = 0.0;
			salariototal = N* 10.0;
		}
		JOptionPane.showMessageDialog(null, "Salário Excedecente: R$" + salarioexcedente + "\nSalário Total: R$" + salariototal);
		
		encerrar = JOptionPane.showInputDialog("Gostaria de encerrar o programa? (S/N");
		

	}

}