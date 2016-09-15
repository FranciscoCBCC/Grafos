
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
        for (int i = 0; i< this.numVertices; i++){
            System.out.println(i+"  ");
        }
        for (int i = 0; i<this.numVertices; i++){
            System.out.println(i+"  ");
            for (int j = 0; j<this.numVertices; j++){
                System.out.println(this.matriz[i][j]+"  ");
            }
            System.out.println();            
        }
    }
}
