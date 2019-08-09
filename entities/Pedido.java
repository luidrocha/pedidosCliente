package entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.enuns.StatusPedido;

public class Pedido {
	public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date dataPedido;
	private StatusPedido statusP;

	private Cliente cliente;

	List<PedidoItem> itens = new ArrayList<>();

	public Pedido() {

	}

	public Pedido(Date dataP, StatusPedido status, Cliente cliente) {

		this.dataPedido = dataP;
		this.statusP = status;
		this.cliente = cliente;

	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatusP() {
		return statusP;
	}

	public void setStatusP(StatusPedido statusP) {
		this.statusP = statusP;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void AdicionaItens(PedidoItem item) {

		itens.add(item);

	}

	public void RemoveItens(PedidoItem item) {

		itens.remove(item);

	}

	public Double Total() {

		Double totPedido = 0.0;

		for (PedidoItem p : itens) {

			totPedido += p.SubTotal();

		}

		return totPedido;
	}

	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Data Pedido: ");
		sb.append(SDF.format(dataPedido) + "\n");
		sb.append("Estatus Pedido: ");
		sb.append(statusP + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedido: ");

		for (PedidoItem i : itens) {

			sb.append(i + "\n");
		}

		sb.append("Preco Total: ");
		sb.append(String.format("%.2f", Total()));

		return sb.toString();

	}

}
