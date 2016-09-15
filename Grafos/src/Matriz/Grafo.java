/*
Autor: Francisco Junior
*/

package Matriz;

public class Grafo {
    
    public static class Aresta{
        public int v1, v2, peso;
        public Aresta(int v1, int v2, int peso){
            this.v1 = v1;
            this.v2 = v2;
            this.peso = peso;
        }
    }
    
    public int matriz[][];
    public int numVertices;
    
    public Grafo(int numVertices){
        this.matriz = new int[numVertices][numVertices];
        this.numVertices = numVertices;
    }
    
    public void imprimir(){
        System.out.println("  ");
        System.out.print("   ");
        for (int i = 0; i< this.numVertices; i++){
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i = 0; i<this.numVertices; i++){
            System.out.print(i+"  ");
            for (int j = 0; j<this.numVertices; j++){
                System.out.print(this.matriz[i][j]+"  ");
            }
            System.out.println();            
        }
    }
}
