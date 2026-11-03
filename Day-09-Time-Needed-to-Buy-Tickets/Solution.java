class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que = new LinkedList <>();
        
        for (int i = 0; i<tickets.length;i++){
            que.add(i);
        }
        int time = 0;
        
        while (!que.isEmpty()){
            time++;
            
            int curr = que.poll();
            tickets[curr]--;
        
        if (curr==k && tickets[curr]==0){ 
         return time;
        }
        if (tickets[curr] > 0) {
                que.add(curr);
            }
        }
        return time;
    }
}
