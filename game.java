import java.util.Scanner;

public class game {

    static  String ANSI_RESET = "\u001B[0m";
    static  String ANSI_YELLOW = "\u001B[33m";
    static  String ANSI_RED = "\u001B[31m";
    static  String ANSI_GREEN = "\u001B[32m";
    static  String ANSI_BLUE = "\u001B[34m";
    static  String ANSI_PURPLE = "\u001B[35m";
    static  String ANSI_CYAN = "\u001B[36m";



    public static void main(String[] args){
        Scanner sc = new Scanner( System.in);
        System.out.print("Tell us What's ur name: ");
        String name = sc.nextLine();
        System.out.println(name+" , hello!");
        System.out.println("Welcome to SURVIVE OR DIE? Survival show!!!\r\n" + //
                        "");
     
        System.out.println("Once upon a time, in a vast universe, you were kidnapped by aliens!!!! The aliens challenge you to play a word game. If you answer the question wrong, you will die! But if you answer the question correctly, you will survive. ");
        System.out.println("Let's see how long you can survive this challenge!");
        System.out.println("READY SET GO!!!!!!!");
        System.out.println("**********************************");



        //data
        String [] Questions = {"Amazing","Anger","Big","Break","Cry","Cut","Destroy",
                                "Enjoy","Get","Happy","Ugly","Think","Scared","Show",
                                "Keep","Idea","Good","Difference","Dark", "Begin"};

        String [] Ans = {"Incredible","Enrage","Huge","Crash","Weep","Slice","Ruin",
                        "Appreciate","Acquire","Pleased","Horrible","Consider","Panicked",
                        "Display","Hold","Concept","Excellent","Contrast","Gloomy","Start"};


        



        int score = 0 ;

        for(int i =0 ; i < Questions.length ; i++){
            
            boolean result = false;
            System.out.println("What is the synonym of"+ "  "+Questions[i]);
            // System.out.println(Questions[i]);
        
            if(i == Questions.length - 1){
                System.out.println(Ans[i] + "\n"+ Ans[i-1]);

            }else{
                System.out.println(Ans[i] + "\n" + Ans[i+1]);
            }
            
            System.out.print("input : ");
            String Choice = sc.nextLine();

            

            if(Choice.equals(Ans[i])){
                result = true;
                score++;
            }else{
                result = false;
            }

            checktf(result);

            
                
    
        
        }
        total_score(score);
    
        System.out.println("Hey "+ name + ", Are you a magician? Because when I look at you, everyone else disappears.");
        System.out.println("Thanks for playing our game!!!!");
        sc.close();

    }
    
    static void total_score(int score){

        System.out.println("You got the total score of "+ score + " out of 20 questions.");
        if(score == 20){
            
            System.out.println("You're so smart. I bet you do crossword puzzles in ink");
        }
        else if ( score>= 15) {
            System.out.println("You're equally good. Great!");
        } 
        else if ( score>=10){
           System.out.println("Not bad, passed but almost didn't make it."); 
        }
        else if(score>=0){
            System.out.println("Go practice again. You're still bad.");
        }
        else{
            System.out.println("ERROR");
        }
    }



    static void checktf(boolean resultcheck){
            

        if(resultcheck == true){
            
            System.out.println(ANSI_GREEN + "Correct " + ANSI_RESET);
            
            System.out.println("+ 1 Hp" + "\n");
            
            
        }else{
            System.out.println(ANSI_RED + "Wrong " + "\n" + ANSI_RESET);
            
        }

    }
}



//check list 1. 2 method up
// 2.loop 
// 3.input
// 4.if else
// 5.array