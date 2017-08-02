package procediementos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
public class Buscar {
	
	  private  String modelo = "";
	  private  String cor = "";
	  private  String tipo = "";
	  private  String inputLine;
	  private  ArrayList <String> lista =  new ArrayList <String>();
	  
	    public ArrayList <String> buscaPlaca(String placa) throws Exception{	    	
	    	String com = "http://wsdetran.pb.gov.br/DT_DUT_Cliente/ConsultaDUT?placaMask=oxo-6954&display=web&placa="+placa+"&display=web&st=%22";
	        URL link = new URL(com);
	        URLConnection yc = link.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        while ((inputLine = in.readLine()) != null)
	        	if (inputLine.contains("Placa Não Cadastrada")){
	        		lista.add("");
	        		return lista;
	        	}else{	        		
	        		if (inputLine.contains("Marca/Modelo:")){
	    	             int inicio = inputLine.indexOf("<b> ");
	    	             int fim = inputLine.lastIndexOf("</b>");
	            		 this.modelo = inputLine.substring(inicio+4,fim);
	            		}else{
	                      if (inputLine.contains("Cor Predominante:")){
	                    	  int inicio = inputLine.indexOf("<b>");
	          	              int fim = inputLine.lastIndexOf("</b>");
	                  		  this.cor = inputLine.substring(inicio+3,fim);
	            		  }else{  
	            	        if (inputLine.contains("Esp&eacute;cie/Tipo:")){
	            	        	 int inicio = inputLine.indexOf("<b>");
	               	             int fim = inputLine.lastIndexOf("</b>");
	                       		 this.tipo = inputLine.substring(inicio+3,fim);        		         
	            		     }          		
	            	      }
	            		}		
	        	}
      	    in.close();           	        	   
	        lista.add(cor);
	        lista.add(modelo);
	        lista.add(tipo);
	    	return lista;
	    }
}