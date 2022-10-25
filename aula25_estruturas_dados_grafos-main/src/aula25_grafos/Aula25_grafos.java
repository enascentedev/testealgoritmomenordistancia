package aula25_grafos;

public class Aula25_grafos {
    
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();                                              // declaração de nomes das cidades
        grafo.adicionarVertice("Porto Alegre");
        grafo.adicionarVertice("Canoas");
        grafo.adicionarVertice("Esteio");
        grafo.adicionarVertice("Sapucaia do Sul");
        grafo.adicionarVertice("São Leopoldo");
        grafo.adicionarVertice("Novo Hamburgo");
        grafo.adicionarVertice("Ivoti");
        grafo.adicionarVertice("Dois Irmãos");
        grafo.adicionarVertice("Nova Petrópolis");
        grafo.adicionarVertice("Sapiranga");
        grafo.adicionarVertice("Parobé");
        grafo.adicionarVertice("Gravataí");
        grafo.adicionarVertice("Taquara");
        grafo.adicionarVertice("Gramado");
        grafo.adicionarVertice("Ivoti");
        grafo.adicionarVertice("Dois Irmãos");
        
        grafo.adicionarAresta(15.3, "Porto Alegre", "Canoas");          // declaração de pontos de chegada e saída junto com as distâncias
        grafo.adicionarAresta(30.8, "Porto Alegre", "Gravataí");
        grafo.adicionarAresta(11.7, "Canoas", "Esteio");
        grafo.adicionarAresta(3.2, "Esteio", "Sapucaia do Sul");
        grafo.adicionarAresta(6.6, "Sapucaia do Sul", "São Leopoldo");
        grafo.adicionarAresta(8.9, "São Leopoldo", "Novo Hamburgo");
        grafo.adicionarAresta(45.4, "Gravataí", "Taquara");
        grafo.adicionarAresta(6.0, "Taquara", "Parobé");
        grafo.adicionarAresta(48.1, "Parobé", "Gramado");
        grafo.adicionarAresta(34.6, "Gramado", "Nova Petrópolis");
        grafo.adicionarAresta(40.4, "Nova Petrópolis", "Dois Irmãos");
        grafo.adicionarAresta(9.6, "Dois Irmãos", "Ivoti");
        grafo.adicionarAresta(7.7, "Ivoti", "Novo Hamburgo");
        grafo.adicionarAresta(13.2, "Novo Hamburgo", "Sapiranga");
        grafo.adicionarAresta(17.5, "Sapiranga", "Parobé");
        
        grafo.buscaEmLargura();
    }
    
}
