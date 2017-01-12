package com.cice.tutorialjava.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator=System.getProperty("file.separator");
		File file=new File("src" + separator + "com"+ separator + "cice" + separator +"tutorialjava" + separator + "tiposPrimitivos.java" );
		System.out.println("Iniciando la copia del fichero");
		if (file.exists()){
			try(InputStream in=new FileInputStream(file); OutputStream out=new FileOutputStream("copy.txt")){
				int bytesLeidos=0;
				byte[] buffer=new byte[1024];
				
				/*while((byteLeido= in.read())!=-1){
					out.write(byteLeido);
				}*/
				do{
					bytesLeidos=in.read(buffer);
					if (bytesLeidos>0){
						out.write(buffer, 0, bytesLeidos);
					}
				}while(bytesLeidos==buffer.length);
				System.out.println("Terminada la copia del fichero");
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e1){
					e1.printStackTrace();
				}finally{
					
			}
		}
		
		/*if (mifichero{
		InputStream in= new FileInputStream("");
		OutputStream out;
		FileInputStream*/ 
	}

}
