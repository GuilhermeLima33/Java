package projetoDoacao;

public class doacao {
	
	private String nome;
	private String email;
	private String cartao;
	private int numero;
	private int valor;
	private int senha;
	 
	

public void informacaoDoacao () {
	System.out.println("PORQUE DOAR?\r\n"
			+ "Cada doação ajuda a garantir que crianças carentes recebam apoio, cuidado e oportunidades que podem mudar"
			+ " suas vidas. Seu gesto faz toda a diferença.");
	
}




public void doacao(String resposta) {
	if(resposta.equalsIgnoreCase("sim")) {
	System.out.println("Obrigado: " + nome + " pela doação ");
		
	}else {
		System.out.println("Fica para a próxima");
	}
}




public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}




public int getSenha() {
	return senha;
}




public void setSenha(int senha) {
	this.senha = senha;
}




public String getCartao() {
	return cartao;
}




public void setCartao(String cartao) {
	this.cartao = cartao;
}




public int getNumero() {
	return numero;
}




public void setNumero(int numero) {
	this.numero = numero;
}




public int getValor() {
	return valor;
}




public void setValor(int valor) {
	this.valor = valor;
}



}
