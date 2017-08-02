package elementos;

import java.util.ArrayList;

public class coleçãoUsuarios {
	
	private ArrayList <Usuario> lista;
	
	
	 public coleçãoUsuarios(){
		lista = new ArrayList <Usuario>();
	 }	
	
	 public ArrayList <Usuario> pesquisaPorNome(String nome){		
		 ArrayList <Usuario> nomes = new ArrayList<Usuario>(); 
		 for (Usuario p : lista){
			if (p.getNome().contains(nome)){
				nomes.add(p);
			}			
		}
		 return nomes;	
	 }	
	 
	 public Usuario VerificaExisteCpf(String cpf){		 
		 for (Usuario p : lista){
				if (p.getCpf().equals(cpf)){
					return p;
				}			
		 }		 
			return null;		 
	 }
	
	 public boolean adicionar(Usuario p){
		   if(VerificaExisteCpf(p.getCpf()) == null){ 
			   return lista.add(p);
		   }
		   return false;
	   }
	 
	 public boolean adicionarArrayList(ArrayList <Usuario> listaUsuarios){
		 
		 return  lista.addAll(listaUsuarios);
	 }
	 
	 
	
	 public int tamanhoColeção(){
		 int qtd = lista.size();
		 return  qtd;
	 }
	 
	 
	 public boolean removePeloNumero(String cpf){
	    	Usuario p;
	    	for(int i = 0 ;i<lista.size();i++){
	            p = VerificaExisteCpf(cpf);
	            if(p!=null){
	               lista.remove(p);	
	               return true;
	            }    		
	    	}
	    	return false;
	  } 
	 
	 public ArrayList <Usuario> listagemDeUsuarios (){
		 return lista;
	 }
	

}
