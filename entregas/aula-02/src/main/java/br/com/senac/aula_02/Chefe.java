package br.com.senac.aula_02;

public class Chefe extends Funcionario
{
	//Atributs
	private Secretaria secretario;

	//Propriets
	public Secretaria getSecretario() {
		return secretario;
	}

	public void setSecretario(Secretaria secretario) {
		this.secretario = secretario;
	}
	
	//Construtor
	public Chefe()
	{
		
	}
}
