package elementos;

import java.util.ArrayList;

public class cole��oVagas {
	
	 private ArrayList <Vagas> lista;
	
	 public cole��oVagas(){
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
