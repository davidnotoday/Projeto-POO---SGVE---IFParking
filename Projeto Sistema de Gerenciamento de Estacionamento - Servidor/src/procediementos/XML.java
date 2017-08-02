package procediementos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import elementos.coleçãoUsuarios;

public class XML {

	public void GravarUsuario(coleçãoUsuarios lista) throws FileNotFoundException, IOException{
			
		 XStream xStreamWriter = new XStream(new StaxDriver());
		 xStreamWriter.alias("lista", coleçãoUsuarios.class);
		 File arquivo = new File("ColeçãoUsuario.xml");
		 FileOutputStream out;
		 try {
	            out = new FileOutputStream(arquivo);
				out.write(xStreamWriter.toXML(lista).getBytes());
	            out.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		 
	}
	
	public coleçãoUsuarios LerUsuarios() throws ClassNotFoundException, IOException{		
		coleçãoUsuarios us = null;		
		XStream xStreamReader = new XStream(new StaxDriver());
		XStream.setupDefaultSecurity(xStreamReader);
		xStreamReader.addPermission(AnyTypePermission.ANY); 
        xStreamReader.alias("lista",coleçãoUsuarios.class);
        BufferedInputStream input = new BufferedInputStream(new FileInputStream ("ColeçãoUsuario.xml"));
        us = (coleçãoUsuarios) xStreamReader.fromXML(input);
        
    	return us;
		
	}
		
}
