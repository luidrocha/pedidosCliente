package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Cliente {

	private String nomeCliente;
	private String email;
	private Date aniversario;
	
	SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

	
	
	public Cliente() {
	
	
}

	public Cliente(String nomeCliente, String email, Date aniversario) {
		
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.aniversario = aniversario;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getAniversario() {
		return aniversario;
	}


	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	
	 public String toString() {
		 
		 return "\n" + nomeCliente + " " + SDF.format(aniversario) + " " + email;
		 
		 
		 
	 }
	
}
