public class Population{

    public static void main(String []args){
        
        double birthRate = 7;
        double deathRate = 13;
        double immigrant = 45;
        double pop = 312032486;
        int curPop;
        
        
        for(int i=0; i<5;i++){
            pop += 31536000/birthRate + 31536000/deathRate - 31536000/immigrant;
            curPop = (int) pop;
            System.out.println(curPop);
        }
        
    }
}