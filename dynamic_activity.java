package shuru;

import java.util.ArrayList;

public class dynamic_activity {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<int[]> activities=new ArrayList<>(); 
    public static void dynamic_algo(){
        int values[]=new int[activities.size()];
        for(int i=0;i<values.length;i++){
            if(i==0){
                values[0]=(activities.get(0)[2]);
            }
            else{
                int flag=0,val=0;
                for(int j=1 ;j<=i;j++){
                    
                    if(activities.get(i)[0]>activities.get(i-j)[1]){
                        
                        val+=activities.get(i)[2]+values[i-j];
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                values[i]=val;}
                else{
                    values[i]=(activities.get(i)[2]);
                }
            }
        }
        max(values);
    }
    public static void max(int values[]){
        int m=values[0];
        for(int i=1;i<values.length;i++){
            if(m<values[i]){
                m=values[i];
            }
        }
        System.out.println("Largest possible is"+m);
    }
    public static void main(String[] args) {
       int activity[]={1,5,2};
        activities.add(activity);
        int activity1[]={3,10,4};
        activities.add(activity1);
        
        int activity2[]={8,14,4};
        activities.add(activity2);
        int activity3[]={2,25,7};
        activities.add(activity3);
        
        int activity4[]={15,26,2};
        activities.add(activity4);
        
        int activity5[]={18,27,1};
        activities.add(activity5);
        
        dynamic_algo();
    }
    
}
