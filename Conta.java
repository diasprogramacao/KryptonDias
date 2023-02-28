
public class Conta {

	private Clientes titular;
	private int numero;
	private String agencia;
    private String corrente;
	private double saldo ;
	
	
	
	public Conta (int numero,String agencia,String corrente) {
		this.numero= numero;
		this.agencia = agencia;
		this.corrente = corrente;
		System.out.println("Criada a conta numero: " + this.numero);
		System.out.println("Criada a agencia numero: " + this.agencia);
		System.out.println("Criada a conta corrente numero: " + this.corrente);
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saque (double valor) { 
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		
		} else { 
		return false;
		}
	
	}
          public boolean transfere (double valor,Conta destino ) {
        	  if (this.saldo >= valor ) {
        		  this.saldo -= valor;
        		  destino.deposita(valor);
        		  return true;
        	  }else {
        		  return false;
        	  }
              	  
          } 
                 
          
          public void setAgencia(String numero) {
        	  this.agencia = numero;
          }         
          public String getAgencia () {
        	  return this.agencia;
          }
          
          public void setCorrente (String numero) {
        	  this.corrente = numero;
          }
          public String getCorrente() {
        	  return this.corrente;
          }
          
          public void setSaldo(double numero) {
        	  this.saldo = numero;
          }
          public double getSaldo() {
        	  return this.saldo;
          }
          
         public void setTitular(Clientes titular) {
        	 this.titular = titular;
         }
          
         public Clientes getTitular() {
        	 return this.titular;
         }
         
         
         public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public static void exibirConta (Conta nomeconta) {
          	System.out.println("Agência: " + nomeconta.agencia);
          	System.out.println("Corrente: " + nomeconta.corrente);
          	         	 
            }  

	}
