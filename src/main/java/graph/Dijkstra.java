package graph;


public class Dijkstra {

    public void printCost(int[][] graph, int n, int nrM, int x, int y){

        int[][] innerMuchii = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                innerMuchii[i][j] =-1;
            }
        }

        for (int i=0; i<nrM; i++){
            innerMuchii[graph[i][0]][graph[i][1]] = graph[i][2];
            innerMuchii[graph[i][1]][graph[i][0]] = graph[i][2];
        }

        boolean [] visited = new boolean[n];
        int [] distancesCostToX = new int [n];
        for (int i=0; i<n; i++){
            distancesCostToX[i] = -1;
        }
        distancesCostToX[x] = 0;

        while (!visited[y]){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i=0; i<n; i++){
                if (!visited[i] && distancesCostToX[i]>=0){
                    if (distancesCostToX[i]<min){
                        min = distancesCostToX[i];
                        index = i;
                    }
                }
            }

            if (index == -1){
                return;
            }

            for (int i=0; i<n; i++){
                if (innerMuchii[index][i] !=-1){
                    if(distancesCostToX[i]==-1){
                        distancesCostToX[i] = innerMuchii[index][i] + min;
                    }
                    else {
                        distancesCostToX[i] = distancesCostToX[i]<(innerMuchii[index][i] + min)
                                ?distancesCostToX[i]
                                :(innerMuchii[index][i] + min);
                    }
                }
            }

            visited[index] = true;

        }
        System.out.println(distancesCostToX[y]);
    }

}
