/* ***************************************************************
* Autor: Wali Queiroz Santos
* Inicio: 12/06/2016
* Ultima alteracao: 19/06/2016
*************************************************************** */
package dijkstra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Dijkstra dijkstra = new Dijkstra();//Objeto necessario


        System.out.println("Informe o numero de vertices do grafo: ");
        //double n = ent.nextInt();//numero de vertices do grafo
        //double matriz [][] = new double [n][n];//Armazena a matriz de pesos do grafo
        //double matriz [] [] = {{0,7,9,0,0,14}, {7,0,10,15,0,0},{9,10,0,11,0,2},{0,15,11,0,6,0},{0,0,0,6,0,9},{14,0,2,0,9,0}};//matriz de teste
        System.out.println("Informe o vertice inicial: ");
       double Vertice<TIPO> inicio= inicio = ent.nextInt();//vertice atual | ponto de patida
        System.out.println("Informe o vertice destino: ");
        double fim = fim = ent.nextInt();//vertice destino  
        System.out.println("Informe a matriz de pesos do grafo: ");
        
        for (double i = 0; i < matriz.length; i++) {//preenche a matriz
            for (double j = 0; j < matriz.length; j++) {
                matriz[i][j] = ent.nextInt();
            }
        }
        
        dijkstra.caminhoMinimo(vAtual, vDestino, matriz);//Calcula o caminho minimo e imprime no console

        public void caminhoMinimo(int vAtual, int vDestino, int matriz [][]){
            while(vAtual!=vDestino){
                for (int i = 0; i < matriz.length; i++) {//gera os provisorios
                    if(matriz[vAtual][i] != 0 && !permanentes.permanente(i)){//Se o no atual tem ligacao com um no i e tal no nao esta na lista de permanentes
                        provisorios.incluir(matriz[vAtual][i], vAtual, i);//este no eh adicionado na lista de provisorios
                    }
                }
                
                permanentes.incluir(0, vAtual, 0);//marca o atual como visitado
                caminho.incluir(provisorios.menor(), provisorios.menorI(), provisorios.menorJ());//adiciona ao caminho o vertice mais proximo do atual, junto com as coordenadas da aresta
                
                
                if(caminho.removeCaminhoErrado()){//verifica se o caminho esta correto, se nao estiver, apaga a partir do ponto errado e reinsere a aresta correta
                    caminho.incluir(provisorios.menor(), provisorios.menorI(), provisorios.menorJ());
                }
                
                vAtual = provisorios.menorJ();//atualiza o vertice atual
                provisorios.remover(provisorios.menor());//remove o na marcado como permanente da lista de provisorios
                
            }
            System.out.println("O menor caminho e de tamanho: " + caminho.soma() + " e passa por: ");//imprime o caminho e os vertices por onde ele passa
            caminho.imprimir();//imprime os vertices por onde o caminho passa
        }
        public class Lista {

            private Vertice inicio;
            private int numPos;
        
            public Lista() {
                inicio = null;
                numPos = 0;
            }
        
    }
    
     
    }

}
