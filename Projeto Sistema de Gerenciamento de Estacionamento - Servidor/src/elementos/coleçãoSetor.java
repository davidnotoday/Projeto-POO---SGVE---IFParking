package elementos;

import java.util.ArrayList;

public class coleçãoSetor {

	private ArrayList <Setor> lista;
	
	 public coleçãoSetor(){
		lista = new ArrayList <Setor>();
	 }	
	
	 public Setor VerificaExisteSetor(String nomeSetor){		 
		 for (Setor p : lista){
				if (p.getNomeDoSetor().equals(nomeSetor) ){
					return p;
				}			
		 }		 
			return null;		 
	 }
	
	 public boolean adicionar(Setor p){
		   if(VerificaExisteSetor(p.getNomeDoSetor()) == null){ 
			   return lista.add(p);
		   }
		   return false;
	   }
	 
	 public boolean removeSetor(String setor){
	    	Setor p;
	    	for(int i = 0 ;i<lista.size();i++){
	            p = VerificaExisteSetor(setor);
	            if(p!=null){
	               lista.remove(p);	
	               return true;
	            }    		
	    	}
	    	return false;
	  } 
	
	
	
	
	
	
	
	
}
