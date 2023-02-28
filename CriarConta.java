
public class CriarConta {
	
	public static void main(String[]agrs) {
		
		ContaCorrente CC1 = new ContaCorrente(1,"5467","04804");
		ContaCorrente CC2 = new ContaCorrente(1,"5469","04809");
		CC1.deposita(100);
		CC1.saque(10);
		//CC1.transfere(30, CC2);
		System.out.println("Saldo Conta Corrente 1 : " + CC1.getSaldo());
		//System.out.println("Saldo Conta Corrente 2 : " + CC2.getSaldo()); 
		
	}

}
