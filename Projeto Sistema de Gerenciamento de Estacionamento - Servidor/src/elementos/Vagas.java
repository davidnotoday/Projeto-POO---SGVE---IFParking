package elementos;

public class Vagas {
	
	private int numeroDaVaga;
	private Boolean Ocup;
	private Cliente cl;
	
	
	public Vagas(Boolean ocup,int numeroDaVaga) {
		this.Ocup = ocup;
		this.numeroDaVaga = numeroDaVaga;
	}
	
	public Vagas(Boolean ocup, Cliente cl, int numeroDaVaga) {
				
		Ocup = ocup;
		this.cl = cl;
		this.numeroDaVaga = numeroDaVaga;
	}

	/**
	 * @return the ocup
	 */
	public Boolean getOcup() {
		return Ocup;
	}
	/**
	 * @param ocup the ocup to set
	 */
	public void setOcup(Boolean ocup) {
		Ocup = ocup;
	}
	/**
	 * @return the cl
	 */
	public Cliente getCl() {
		return cl;
	}
	/**
	 * @param cl the cl to set
	 */
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	
	
	/**
	 * @return the numeroDaVaga
	 */
	public int getNumeroDaVaga() {
		return numeroDaVaga;
	}
	/**
	 * @param numeroDaVaga the numeroDaVaga to set
	 */
	public void setNumeroDaVaga(int numeroDaVaga) {
		this.numeroDaVaga = numeroDaVaga;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagas other = (Vagas) obj;
		if (Ocup == null) {
			if (other.Ocup != null)
				return false;
		} else if (!Ocup.equals(other.Ocup))
			return false;
		
		if (cl == null) {
			if (other.cl != null)
				return false;
		} else if (!cl.equals(other.cl))
			return false;
		if (numeroDaVaga != other.numeroDaVaga)
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vagas [numeroDaVaga=" + numeroDaVaga + ", Ocup=" + Ocup + ", cl=" + cl + "]";
	}
}
