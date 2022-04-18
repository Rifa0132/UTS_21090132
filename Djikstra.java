public class Djikstra {
    
    public static void main(String args[]) {
        int graph[][] = new int [][] { { 4,  101, 8   },
                                       { 2,  302, 10  },
                                       { 50, 430, 45  },
                                       { 8,  106, 9   } };
        
        int minDistance = Integer.MAX_VALUE;
        int minVertexDist = -1;
        int[] distance = new int[5];
        boolean[] visited = new boolean[5];

        for(int i=0;i<5;i++){
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        distance[0] = 0;
        for(int t=0;t<5;t++) {
            System.out.println("ArrayDistance is = " + distance[t]);
        }    

        for(int s=0;s<5;s++){
            System.out.println("Looping = " + s);
            System.out.println("visited = " + visited[s]);
            System.out.println("distance ["+ s+"] = "+ distance[s]);
            system.out.println("mindistance = " + minDistance); 
        }
    }    
}
