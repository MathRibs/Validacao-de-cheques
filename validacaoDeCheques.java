import java.util.Scanner;

public class validacaoDeCheques {
public static void main (String args []) {
	// Declaração de Variaveis
			Scanner leitor = new Scanner (System.in);
int quantidadeInformadoDeChequesNoLotes = 0 ;
double valorInformadoDoLote = 0;
int contadorCheques = 0 ;
double somaValorCheques = 0 ;
// Entrada de dados
System.out.print("Informe a quantidade que há no lotes:");
quantidadeInformadoDeChequesNoLotes = leitor.nextInt();
System.out.print("Informe a quantidade total de lotes há no cheque:");
valorInformadoDoLote = leitor.nextDouble();
do {
	contadorCheques++;
	System.out.print(" Informe o valor do cheque");
somaValorCheques = leitor.nextDouble();
System.out.print("Informe <S> se houver mais cheques");
}while (leitor.next().equalsIgnoreCase("S"));
//Saida de Dados
if ((contadorCheques == quantidadeInformadoDeChequesNoLotes)&& (somaValorCheques == valorInformadoDoLote)) {
	System.out.print("Parabéns !! Esse lote está corretamente validado");
}else { 
	System.out.print("FODEU ! Algum corno errou ou roubou alguma coisa!!!");
}






















}
}