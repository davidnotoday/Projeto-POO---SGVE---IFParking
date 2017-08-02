package elementos;

import java.time.LocalDate;

public class Cliente extends Pessoa{
	
    Carro carro;
    LocalDate HoradeEntrada;
    LocalDate HoradeSaída;
    
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
	 * @return the horadeSaída
	 */
	public LocalDate getHoradeSaída() {
		return HoradeSaída;
	}

	/**
	 * @param horadeSaída the horadeSaída to set
	 */
	public void setHoradeSaída(LocalDate horadeSaída) {
		HoradeSaída = horadeSaída;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [carro=" + carro + ", HoradeEntrada=" + HoradeEntrada + ", HoradeSaída=" + HoradeSaída + "]";
	}

    

	




}
