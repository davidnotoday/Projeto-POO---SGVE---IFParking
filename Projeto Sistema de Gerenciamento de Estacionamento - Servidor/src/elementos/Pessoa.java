package elementos;

import java.time.LocalDate;

public class Pessoa {
private String nome;
private String cpf;
private LocalDate dataDeNascimento;
public Pessoa(String nome, String cpf,LocalDate dataDeNascimento) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.dataDeNascimento = dataDeNascimento;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public LocalDate getDataDeNascimento() {
	return dataDeNascimento;
}
public void setDataDeNascimento(LocalDate dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
	result = prime * result + ((dataDeNascimento == null) ? 0 : dataDeNascimento.hashCode());
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pessoa other = (Pessoa) obj;
	if (cpf == null) {
		if (other.cpf != null)
			return false;
	} else if (!cpf.equals(other.cpf))
		return false;
	if (dataDeNascimento == null) {
		if (other.dataDeNascimento != null)
			return false;
	} else if (!dataDeNascimento.equals(other.dataDeNascimento))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	return true;
}
@Override
public String toString() {
	return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + "]";
}
}
