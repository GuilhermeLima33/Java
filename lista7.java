package primeiroProjeto;

import java.util.Scanner;

public class lista7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1 - Classificação de Filme
		
Scanner scanner = new Scanner(System.in); //java.util
System.out.println("Qual sua idade? ");	
int idade = scanner.nextInt();
if (idade < 16 && idade > 70) {
System.out.println("Classificação especial");
}else {
	System.out.println("Classificação regular");
}
		
		
System.out.println("//--------------------------------------------------");		
//2 - Promoção de Produto
System.out.println("Qual o valor do produto?");	
double produto = scanner.nextDouble();
System.out.println("Qual a quantidade comprada?");
double quant = scanner.nextDouble();
double total = produto * quant;
double desconto = total * 0.15;
double descfinal = total - desconto;
if ( total > 200 && quant > 5) {
System.out.println("Com o desconto você pagará: R$" + descfinal);
}else {
System.out.println("Vocãe não tem desconto, pagará R$" + total);
}


System.out.println("//--------------------------------------------------");
//3 - Alerta de Saúde
System.out.println("Qual sua frequência cardíaca?");
int frec = scanner.nextInt();
System.out.println("Você sente alguma tontura? ");
String tontura = scanner.next();
if (frec >= 100 && tontura.equalsIgnoreCase("sim")) {
System.out.println("Procure atendimento médico");
}else {
System.out.println("Sem sinais de alerta");
}
System.out.println("//--------------------------------------------------");

//4 - Participação em Concurso
System.out.println("Qual sua idade?");
int idad = scanner.nextInt();
System.out.println("Você é residente do estado?");
String resi = scanner.next();
if (idad >= 18 && idad <= 30 && resi.equalsIgnoreCase("sim")) {
	System.out.println("Elegível para o concurso");
}else {
System.out.println("Não elegível para o concurso");	
}

//5 - Recompensa por Desempenho
System.out.println("Quantos projetos foram concluídos?");
int projeto = scanner.nextInt();
System.out.println("Quantos erros foram reportados? ");
int erros = scanner.nextInt();
if (projeto > 10 && erros < 3) {
System.out.println("Recompensa concedida");
}else {
System.out.println("Sem recompensa");
}

//6 - Autorização para Viagem


System.out.println("Qual sua idade?");
int idadee = scanner.nextInt();
System.out.println("Você possuí passaporte válido?");
String passaporte = scanner.next();
if (idadee >= 18 && passaporte.equalsIgnoreCase("sim")) {
System.out.println("Viagem autorizada");
}else {
System.out.println("Viagem não autorizada");	
}

//7 - Aprovação em Curso Online

System.out.println("Qual sua nota final?");
int nota = scanner.nextInt();
System.out.println("qual o número de aulas assistidas? ");
int aulas = scanner.nextInt();
if (nota > 70 && aulas >= 40 ) {
System.out.println("Aprovado");
}else {
System.out.println("Reprovado");
}

//8 - Controle de Irrigação
System.out.println("Qual a umidade do solo? (%)");
int umidade = scanner.nextInt();
System.out.println("Qual a temperaura?");
int tempo = scanner.nextInt();
if (umidade < 30 && tempo > 30) {
	System.out.println("Irrigação necessária");
}else {
	System.out.println("Irrigação não necessária");
}


//9 - Inscrição em Feira Profissional
System.out.println("Qual sua idade?");
int idadeee = scanner.nextInt();
System.out.println("Possui experiência prévia?");
String experi = scanner.next();
if (idadeee >= 20 && idadeee <= 40 && experi.equalsIgnoreCase("sim")) {
System.out.println("Inscrição aceita");
}else {
System.out.println("Inscrição não permitida");
}


	}

}
