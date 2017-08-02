package elementos;

import java.util.ArrayList;

public class coleçãoVagas {
	
	 private ArrayList <Vagas> lista;
	
	 public coleçãoVagas(){
		lista = new ArrayList <Vagas>();
	 }	
	
	 public void adicionar(Vagas p){	   
	    lista.add(p);		
	 }
	
	 public boolean verificaVagaLivre(Vagas v) {
		 if (v.getOcup() == false) {
			 return false;
		 }else {
			 return true;
		 }
	 }

	 public ArrayList <Vagas> listagemDeUsuarios (){
		 return lista;
	 }
	 
	 
	 
	 
}
