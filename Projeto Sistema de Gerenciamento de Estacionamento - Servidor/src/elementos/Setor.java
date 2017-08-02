package elementos;

import java.util.ArrayList;

public class Setor {
    
	String nomeDoSetor;
	ArrayList <Vagas> vaga = new ArrayList<Vagas>();

	public Setor(String nomeDoSetor, ArrayList <Vagas> vaga) {
		this.nomeDoSetor = nomeDoSetor;
		this.vaga = vaga;
	}

	/**
	 * @return the nomeDoSetor
	 */
	public String getNomeDoSetor() {
		return nomeDoSetor;
	}

	/**
	 * @param nomeDoSetor the nomeDoSetor to set
	 */
	public void setNomeDoSetor(String nomeDoSetor) {
		this.nomeDoSetor = nomeDoSetor;
	}

	/**
	 * @return the vaga
	 */
	public ArrayList<Vagas> getVaga() {
		return vaga;
	}

	/**
	 * @param vaga the vaga to set
	 */
	public void setVaga(ArrayList<Vagas> vaga) {
		this.vaga = vaga;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoSetor == null) ? 0 : nomeDoSetor.hashCode());
		result = prime * result + ((vaga == null) ? 0 : vaga.hashCode());
		return result;
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
		Setor other = (Setor) obj;
		if (nomeDoSetor == null) {
			if (other.nomeDoSetor != null)
				return false;
		} else if (!nomeDoSetor.equals(other.nomeDoSetor))
			return false;
		if (vaga == null) {
			if (other.vaga != null)
				return false;
		} else if (!vaga.equals(other.vaga))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Estacionamento [nomeDoSetor=" + nomeDoSetor + ", vaga=" + vaga + "]";
	}
	
}
