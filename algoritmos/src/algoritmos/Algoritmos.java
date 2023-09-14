
package algoritmos;

/**
 *
 * @author MATHEUS MORENO
 */
import java.util.ArrayList;

import com.IO.Keyboard;
import static java.awt.SystemColor.text;
import java.io.FileNotFoundException;
import static java.lang.System.in;
import java.util.Scanner;
//import java.io.FileReader;

public class Algoritmos {
	public static void main(String arg[]) throws FileNotFoundException {
		Grafo inicial = new Grafo();
		Grafo resultado = new Grafo();
		//FileReader fileReader = new FileReader("C:\\Users\\MATHEUS MORENO\\Documents\\NetBeansProjects\\algoritmos\\src\\algoritmos\\teste.txt");
		Aresta arestaAux;
		Vertice verticeAux1, verticeAux2;
		int opcao = 5, peso;
		String origem, destino;
                
               
                
                //carregarArquivo();
		while(opcao!=0){
			System.out.println("1 - Add vertices e aresta");
			System.out.println("2 - Imprimir Grafo dado");
			//System.out.println("3 - Obter arvore de Kruskal");
			System.out.println("4 - Obter caminho de Dijkstra");
			System.out.println("5 - Obter arvore de Busca em Profundidade");
			//System.out.println("6 - Obter Fecho Transitivo do Grafo");
			System.out.println("7 - Obter arvore de Busca em Largura");
			//System.out.println("8 - Obter Ordenacao Topologica");
			//System.out.println("9 - Obter Matriz do Algoritmo de Warshall");
			System.out.println("0 - fim");
			opcao = Keyboard.readInt();			
			//dando um reset no grafo de resultado
			resultado.clearLists();
			
			//limpando verificadores booleanos
			inicial.limparArestaVisitada();
			inicial.limparVerticeVisitado();
		switch (opcao){
			case 1:  
                          int opcao2 = 0;        
                         // 
                           do{
                           System.out.println("Digite o peso/origem/destino/");
                            peso = Keyboard.readInt();
                            origem = Keyboard.readString();
                            destino = Keyboard.readString();
                            inicial.addAresta(peso,origem,destino); 
                               System.out.println("Digite 0 para continuar\n digite -1 para sair");
                               opcao2 = Keyboard.readInt();
                            }while(opcao2!=-1);
                            inicial.imprimeArvore();
                             //FileReader leitura = new FileReader("C:\\Users\\MATHEUS MORENO\\Documents\\NetBeansProjects\\algoritmos\\src\\algoritmos\\teste.txt");
                             // fileReader.carregarArquivo();
                            break;
			case 2:
				inicial.imprimeArvore();
				break;
			case 3:
				//Algoritmo de Kruskal
				/*
				for(int i=0;i<inicial.getArestas().size();i++){
					//busca aresta com menor peso ainda nao verificado no grafo inicial
					arestaAux= inicial.menorPeso();
					//se tal aresta nao formar um ciclo ao ser adicionada, ela eh adicionada a arvore de Kruskal
					if(!resultado.temCiclo(arestaAux)){
						resultado.addAresta(arestaAux.getPeso(),
						arestaAux.getOrigem().getNome(),
						arestaAux.getDestino().getNome());
					}
				}
				
				resultado.imprimeArvore();*/
				break;
			case 4:
				//Algoritmo de Dijkstra
				System.out.println("Digite vertice/ Vertice");
				verticeAux1 = inicial.acharVertice(Keyboard.readString());
				verticeAux2 = inicial.acharVertice(Keyboard.readString());
				resultado.setVertices(inicial.encontrarMenorCaminhoDijkstra(verticeAux1, verticeAux2));
				
				System.out.println(resultado.getVertices());
				break;
				
			case 5:
				//Algoritmo de Busca em Profundidade
				System.out.println("Digite a Origem/Destino");
				origem = Keyboard.readString();
				destino = Keyboard.readString();
				resultado.setArestas(inicial.buscaEmProfundidade(origem, destino));
				
				resultado.imprimeArvore();
				break;
			case 6:
				//Algoritmo de Fecho Transitivo
				
				//para cada vertice do Grafo
			/*	for(int i=0;i<inicial.getVertices().size();i++){
					//para cada vertice do seu fecho transitivo
					for(int j=0;j<inicial.fechoTransitivo(inicial.getVertices().get(i).getNome()).size();j++){
						arestaAux = resultado.acharAresta(inicial.getVertices().get(i), inicial.fechoTransitivo(inicial.getVertices().get(i).getNome()).get(j)); 
						//verifica se uma aresta com esse vertice e o vertice inicial ja existe
						//se nao existe
						if(arestaAux==null){
							//adiciona aresta
							resultado.addAresta(0,
									inicial.getVertices().get(i).getNome(),
									inicial.fechoTransitivo(inicial.getVertices().get(i).getNome()).get(j).getNome() );
						}
					}
				}
				
				System.out.println(resultado.getArestas());*/
				break;
			case 7:
				//Algoritmo de Busca em Largura
				System.out.println("Digite Origem/Destino");
				origem = Keyboard.readString();
				destino = Keyboard.readString();
				resultado.setArestas(inicial.buscaEmLargura(origem, destino));
				
				resultado.imprimeArvore();
				break;
			case 8: 
				//Ordenacao Topologica
				/*
				ArrayList<Vertice> vertices = inicial.topologicalSort();
				int count = 1;
				for (Vertice vertice: vertices) {
					System.out.println(count + " " + vertice.getNome());
					count++;
				}*/
				break;
			case 9:
				//Algoritmo de Warshall
				/*
				int[][] dist = inicial.warshall();
				for(int i = 0; i < dist.length; i++){
					for(int j = 0; j < dist.length; j++){
						System.out.print(dist[i][j] + " ");
					}
					System.out.print("\n");
				}*/
				break;
			case 0:
				break;
			default:
				System.out.println("invalido");
				break;
			}
			
		}
	}
}