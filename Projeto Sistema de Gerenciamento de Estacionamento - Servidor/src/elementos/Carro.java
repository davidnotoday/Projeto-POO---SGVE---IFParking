package elementos;

public class Carro {
String Modelo;
String Placa;
String Cor;
String Tipo;
public Carro(String modelo, String placa, String cor, String tipo) {
	super();
	Modelo = modelo;
	Placa = placa;
	Cor = cor;
	Tipo = tipo;
}
public String getModelo() {
	return Modelo;
}
public void setModelo(String modelo) {
	Modelo = modelo;
}
public String getPlaca() {
	return Placa;
}
public void setPlaca(String placa) {
	Placa = placa;
}
public String getCor() {
	return Cor;
}
public void setCor(String cor) {
	Cor = cor;
}
public String getTipo() {
	return Tipo;
}
public void setTipo(String tipo) {
	Tipo = tipo;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Cor == null) ? 0 : Cor.hashCode());
	result = prime * result + ((Modelo == null) ? 0 : Modelo.hashCode());
	result = prime * result + ((Placa == null) ? 0 : Placa.hashCode());
	result = prime * result + ((Tipo == null) ? 0 : Tipo.hashCode());
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
	Carro other = (Carro) obj;
	if (Cor == null) {
		if (other.Cor != null)
			return false;
	} else if (!Cor.equals(other.Cor))
		return false;
	if (Modelo == null) {
		if (other.Modelo != null)
			return false;
	} else if (!Modelo.equals(other.Modelo))
		return false;
	if (Placa == null) {
		if (other.Placa != null)
			return false;
	} else if (!Placa.equals(other.Placa))
		return false;
	if (Tipo == null) {
		if (other.Tipo != null)
			return false;
	} else if (!Tipo.equals(other.Tipo))
		return false;
	return true;
}
@Override
public String toString() {
	return "Carro [Modelo=" + Modelo + ", Placa=" + Placa + ", Cor=" + Cor + ", Tipo=" + Tipo + "]";
}
}
