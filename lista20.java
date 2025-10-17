package primeiroProjeto;

public class lista20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 saudacao();
	        traco();

	        desenharRetangulo();
	        traco();

	        multiplosDe5();
	        traco();

	        contagemCrescente();
	        traco();

	        mesesDoAno();
	        traco();

	        verificarDivisibilidade(10);
	        traco();

	        mensagemDespedida("Guilherme");
	        traco();

	        unirNomes("Ana", "Silva");
	        traco();

	        verificarMaiorQue100(150);
	        traco();

	        classificarVelocidade(75);
	        traco();

	        saudacaoDia("terça-feira");
	        traco();

	        verificarEstoque(3);
	        traco();

	    }

	   
	    public static void traco() {
	        System.out.println("---------------------------------------------");
	    }

	   
	 // Funções sem parâmetro
	   
	    public static void saudacao() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Bom dia!");
	        }
	    }

	    
	    public static void desenharRetangulo() {
	        for (int i = 0; i < 3; i++) {
	            System.out.println("*****");
	        }
	    }

	    
	    public static void multiplosDe5() {
	        for (int i = 5; i <= 25; i += 5) {
	            System.out.println(i);
	        }
	    }

	    
	    public static void contagemCrescente() {
	        for (int i = 1; i <= 8; i++) {
	            System.out.println(i);
	        }
	        System.out.println("Pronto!");
	    }

	 
	    public static void mesesDoAno() {
	        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
	        for (String mes : meses) {
	            System.out.println(mes);
	        }
	    }

	 // Funções com parâmetro
	    public static void verificarDivisibilidade(int numero) {
	        if (numero % 5 == 0) {
	            System.out.println(numero + " é divisível por 5.");
	        } else {
	            System.out.println(numero + " não é divisível por 5.");
	        }
	    }

	    
	    public static void mensagemDespedida(String nome) {
	        System.out.println("Até logo, " + nome + "!");
	    }

	    
	    public static void unirNomes(String primeiroNome, String sobrenome) {
	        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
	    }

	    
	    public static void verificarMaiorQue100(int numero) {
	        if (numero > 100) {
	            System.out.println(numero + " é maior que 100.");
	        } else {
	            System.out.println(numero + " não é maior que 100.");
	        }
	    }

	    
	    public static void classificarVelocidade(int velocidade) {
	        if (velocidade < 40) {
	            System.out.println("Lenta");
	        } else if (velocidade <= 80) {
	            System.out.println("Normal");
	        } else {
	            System.out.println("Rápida");
	        }
	    }

	   
	    public static void saudacaoDia(String dia) {
	        System.out.println("Tenha uma ótima " + dia + "!");
	    }

	   
	    public static void verificarEstoque(int quantidade) {
	        if (quantidade >= 10) {
	            System.out.println("Estoque suficiente");
	        } else if (quantidade >= 5) {
	            System.out.println("Estoque baixo");
	        } else {
	            System.out.println("Estoque crítico");
	        }
	    }

	}