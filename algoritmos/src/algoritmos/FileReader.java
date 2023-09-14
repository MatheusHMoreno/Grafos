/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.io.FileNotFoundException;

/**
 *
 * @author MATHEUS MORENO
 */
public class FileReader {
    		
//ATRIBUTOS DA CLASSE
String caminho="";

//CONSTRUTOR
    public FileReader(String caminho){
       this.caminho = caminho;
}


public void carregarArquivo() {
	try{
  		//CARREGA ARQUIVO
                java.io.FileReader arq = new java.io.FileReader(caminho);
                BufferedReader lerArq = BufferedReader(arq);
                String line = "";
                line = lerArq.readLine();
                int qtdVertices = Integer.parseInt(line);
                
                line = lerArq.readLine();
                while(line!=null){
                    String[] parametros = line.split(" ");
                    System.out.println("parametros");
                    int vOrigem = Integer.parseInt(parametros[0]);
                    String parte1[], parte2[];
                    parte1 = parametros[1].split("-");
                    int vDestino = Integer.parseInt(parte1[0]);
                    int vPeso = Integer.parseInt(parte1[1]);
                    line = lerArq.readLine();
      		 }
	}
	//TRATA ERRO
	catch(Exception e){
		System.out.println("Deu zica menó");
	}
}
    private static BufferedReader BufferedReader(java.io.FileReader arq) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
