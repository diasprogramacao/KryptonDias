
public class ContaCorrente extends Conta {

	ContaCorrente(int numero,String agencia,String corrente){
		super(numero,agencia,corrente);
		}
	
	public boolean saque (double valor) { 
		if (valor <= super.getSaldo()) {
			double SaldoPersonalizado = valor +  0.10;
			super.setSaldo(super.getSaldo() - SaldoPersonalizado);
			return true;
			} else { 
		return false;
		}
	
	}
	
}
