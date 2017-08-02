package elementos;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	
    Carro carro;
    LocalDate HoradeEntrada;
    LocalDate HoradeSa�da;
    
	public Cliente(String nome, String cpf, LocalDate dataDeNascimento, LocalDate HoradeEntrada,LocalDate HoradeSaida,Carro carro) {
		super(nome, cpf, dataDeNascimento);
		this.carro = carro;
	}

	/**
	 * @return the carro
	 */
	public Carro getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	/**
	 * @return the horadeEntrada
	 */
	public LocalDate getHoradeEntrada() {
		return HoradeEntrada;
	}

	/**
	 * @param horadeEntrada the horadeEntrada to set
	 */
	public void setHoradeEntrada(LocalDate horadeEntrada) {
		HoradeEntrada = horadeEntrada;
	}

	/**
	 * @return the horadeSa�da
	 */
	public LocalDate getHoradeSa�da() {
		return HoradeSa�da;
	}

	/**
	 * @param horadeSa�da the horadeSa�da to set
	 */
	public void setHoradeSa�da(LocalDate horadeSa�da) {
		HoradeSa�da = horadeSa�da;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [carro=" + carro + ", HoradeEntrada=" + HoradeEntrada + ", HoradeSa�da=" + HoradeSa�da + "]";
	}

    

	




}
