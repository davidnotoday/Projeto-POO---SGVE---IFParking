package elementos;

import java.time.LocalDate;

public class Usuario extends Pessoa {
	
private int numero;
private String senha;
private LocalDate horaDeLogin;

public Usuario(String nome, String cpf, LocalDate dataDeNascimento, String senha) {
	super(nome, cpf, dataDeNascimento);
	this.senha = senha;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public LocalDate getHoraDeLogin() {
	return horaDeLogin;
}
public void setHoraDeLogin(LocalDate horaDeLogin) {
	this.horaDeLogin = horaDeLogin;
}
public int getNumero(){
	return numero;
}
public void setNumero(int numero){
	this.numero = numero;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((horaDeLogin == null) ? 0 : horaDeLogin.hashCode());
	result = prime * result + ((senha == null) ? 0 : senha.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Usuario other = (Usuario) obj;
	if (horaDeLogin == null) {
		if (other.horaDeLogin != null)
			return false;
	} else if (!horaDeLogin.equals(other.horaDeLogin))
		return false;
	if (senha == null) {
		if (other.senha != null)
			return false;
	} else if (!senha.equals(other.senha))
		return false;
	return true;
}
@Override
public String toString() {
	return "Usuario [senha=" + senha + ", horaDeLogin=" + horaDeLogin + "]";
}

}
