public class MainGraph {

    public static void main(String[] args) {

        //graphOfCitiesDFS();
        //graphOfCitiesBFS();
        shortRoad();
    }

    private static void testDfs() {
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");

        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        System.out.println("--- DFS ---");
        graph.dfs("A");
    }

    private static void graphOfCitiesDFS() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");

        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");


        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");

        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        System.out.println("--- DFS ---");
        graph.dfs("Воронеж");
    }

    private static void graphOfCitiesBFS() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");

        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");


        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орел", "Курск");

        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        System.out.println("--- BFS ---");
        graph.bfs("Москва");
    }

    private static void shortRoad() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");

        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орел");


        //graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Тамбов", "Воронеж");
        graph.addEdge("Липецк", "Саратов");
        graph.addEdge("Орел", "Курск");

        //graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        Stack<String> strings = graph.searchShortRoad("Тамбов", "Курск");

        Stack<String> strings = graph.searchShortRoad("Тамбов", "Курск");

        System.out.println("Short road");
        while (!strings.isEmpty()) {
            System.out.println(strings.pop());
        }
    }

}
