package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import aplicativo.Operacoes;
import aplicativo.Pessoa;
import ui.Menu;

public class PrincipalMedidaCerta {
	public static void main(String[] args) throws Exception {
    	
 	  
 	   Menu menu = new Menu();
 	   
 	   	try {
 	   		
     	     	   
     	   	FileInputStream fis = new FileInputStream("teste.txt");
     	    ObjectInputStream ois = new ObjectInputStream(fis);
     	
			ArrayList<Pessoa> pessoasSalvas = (ArrayList<Pessoa>) ois.readObject();
     	    ois.close();
     	    ois.close();
     	  
     	   menu.o.setPessoas(pessoasSalvas);
     	  
     	    
     	    
     	   
     
     	    
     	    
     	    
     	   
     	   
     	 

     	    
     	    
     	    
        }
        catch (FileNotFoundException e) {
     	    e.printStackTrace();
     	}
     	catch (IOException e) {
     	    e.printStackTrace();
     	}
     	catch (ClassNotFoundException e) {
     	    e.printStackTrace();
     	}
 	   	
 	   	
 	   menu.menu();
        
      
        
      
 	
 	
 	  
        
        
       try {

   	    FileOutputStream fos = new FileOutputStream("teste.txt");
   	    ObjectOutputStream oos = new ObjectOutputStream(fos);
   	    oos.writeObject(menu.o.pessoas);
   	    oos.close();
   	   
     	  
       }
       
       catch(Exception e ) {
     	  
     	  
       }
 	 	

 
 }
}
