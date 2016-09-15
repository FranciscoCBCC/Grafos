/*
Autor: Francisco Junior
*/

package Principal;

import java.util.Scanner;
import Matriz.*;
import Matriz.Grafo.Aresta;

public class main {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Insira o numero de vertices: ");
        int numVertices = in.nextInt();
        int numArestas = 0;
        
        Grafo grafo = new Grafo(numVertices);
        
        System.out.println("Insira o numero de arestas: ");
        numArestas = in.nextInt();
        
        for (int i = 0; i < numArestas; i++) {
            Grafo.Aresta aresta = lerAresta();
            
            grafo.matriz[aresta.v1][aresta.v2] = aresta.peso;
            grafo.matriz[aresta.v2][aresta.v1] = aresta.peso;
        }
        
        grafo.imprimir();
    }
    
    private static Aresta lerAresta(){
        int v1, v2, peso;
        
        System.out.println("Insira o vertice 1: ");
        v1 = in.nextInt();
        System.out.println("Insira o vertice 2: ");
        v2 = in.nextInt();
        System.out.println("Insira o peso: ");
        peso = in.nextInt();
        
        return new Grafo.Aresta(v1, v2, peso);
    }
}
