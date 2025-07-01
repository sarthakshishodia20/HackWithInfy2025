import java.util.*;
public class ActivitySelection{
    static class Acitive{
        int starttime;
        int endtime;
        public Acitive(int s,int e){
            this.starttime=s;
            this.endtime=e;
        }
    }
    public static void main(String[] args) {
        int[][] activity={{1,3},{2,4},{3,5},{0,6},{5,7},{8,9}};
        int activityCount=activitySelection(activity);
        System.out.println("Maximum number of activities that can be performed is "+activityCount);
    }
    public static int activitySelection(int[][] activities){
        List<Acitive> list=new ArrayList<>();
        for(int[] a:activities){
            int startime=a[0];
            int endtime=a[1];
            list.add(new Acitive(startime,endtime));
        }
        Collections.sort(list, (a, b) -> a.endtime - b.endtime);
        int count=1;
        int lastEnd=list.get(0).endtime;
        for(int i=1;i<list.size();i++){
            if(list.get(i).starttime>=lastEnd){
                count++;
                lastEnd=list.get(i).endtime;
            }
        }
        return count;
    }
}
