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

import elementos.cole��oUsuarios;

public class XML {

	public void GravarUsuario(cole��oUsuarios lista) throws FileNotFoundException, IOException{
			
		 XStream xStreamWriter = new XStream(new StaxDriver());
		 xStreamWriter.alias("lista", cole��oUsuarios.class);
		 File arquivo = new File("Cole��oUsuario.xml");
		 FileOutputStream out;
		 try {
	            out = new FileOutputStream(arquivo);
				out.write(xStreamWriter.toXML(lista).getBytes());
	            out.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		 
	}
	
	public cole��oUsuarios LerUsuarios() throws ClassNotFoundException, IOException{		
		cole��oUsuarios us = null;		
		XStream xStreamReader = new XStream(new StaxDriver());
		XStream.setupDefaultSecurity(xStreamReader);
		xStreamReader.addPermission(AnyTypePermission.ANY); 
        xStreamReader.alias("lista",cole��oUsuarios.class);
        BufferedInputStream input = new BufferedInputStream(new FileInputStream ("Cole��oUsuario.xml"));
        us = (cole��oUsuarios) xStreamReader.fromXML(input);
        
    	return us;
		
	}
		
}
