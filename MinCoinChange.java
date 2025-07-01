class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        list.add(2000);
        list.add(500);
        list.add(200);
        list.add(100);
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(2);
        list.add(1);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<=N){
                while(list.get(i)<=N){
                    N=N-list.get(i);
                    ans.add(list.get(i));
                    if(N<=0){
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
