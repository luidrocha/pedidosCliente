package aplicacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enuns.StatusPedido;

public class Spedido {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Digite os dados do ClientSe: ");
		
		System.out.println("Cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Digite o Email: ");
		String email = sc.next();
		
		System.out.println("Aniversario: ");
		Date aniversario = SDF.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente, email, aniversario);
		
		
		System.out.println(" Entre com os dados do Pedido: ");
		
		System.out.println("Status pedido: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		
		Pedido pedido = new Pedido (new Date(), status, cliente);
		
		System.out.println("Quantos item de pedido: ");
		int n = sc.nextInt();
		
		for( int i = 1; i<=n; i++) {
			sc.nextLine();
			
			System.out.println("Produto #" + i ); 
			
			System.out.println("Digite o nome do Produto");
			String prod = sc.nextLine();
			
			System.out.println("Digite o preço: ");
			Double preco = sc.nextDouble();
			
			System.out.println("Quantidade: ");
			int qtd = sc.nextInt();
			
			Produto prodObj = new Produto(prod, preco);
			PedidoItem item = new PedidoItem(qtd, preco, prodObj);
			pedido.AdicionaItens(item);
						
			
		}
		
		System.out.println();
		System.out.println("Resumo Pedido");
		System.out.println(pedido.toString());
		
		
		
		
		sc.close();
		
		
	}

}
