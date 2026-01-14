class ConditionalProblem{
    public static void main(String[] args){
        ConditionalProblem cp = new ConditionalProblem();
        Boolean isVoterEligible=cp.isVoterEligible(20);
        System.out.println("Is voter eligible: "+isVoterEligible);
      System.out.println(cp.emptyPasswordVidate(""));
      System.out.println(cp.checkNumberIsEvenOdd(11));
      System.out.println(cp.changeAcModeBYTemprature(40));
    System.out.println(cp.blackATransaction(-100.50));
System.out.println(cp.userExistDenyRegistration("Admin"));   
System.out.println(cp.isNullString(null));
System.out.println(cp.valueNotZero(0)); 
System.out.println(cp.provideGrdeByMarks(85));
System.out.println(cp.speedLImitBasedFineIssues(80, 60));
System.out.println(cp.heightBasedAllowRide(130));
System.err.println(cp.prizeExceedBudgetNotAllowBuy(500.0, 300.0));
System.out.println(cp.checkRating(4.7));
System.out.println(cp.checkHightScore(150, 120));
System.out.println(cp.lockAccount(5, 3));
}
    public boolean isVoterEligible(int age){
        if(age>18){
            return true;
        }
        return false;
    }
    public String emptyPasswordVidate(String password){
        if(password.isEmpty()){
            return "Please enter a password";
        }
        return "Password accepted";
    }
    public String checkNumberIsEvenOdd(int number){
        if (number % 2 == 0) {
          return "Even";  
        }
        return "Odd";
    }
    public String changeAcModeBYTemprature(int temprature){
        if(temprature>=35){
             return " Turn on AC" ;
        }else if(temprature<=18){
            return "Turn on Heater";
        }          
                   
    return "ALL off";
 }
 public String blackATransaction(double balance){
    if(balance<0){
        return "Transaction Failed";
    }
    return "Transaction Successful";
 }
 public String userExistDenyRegistration(String username){
    if(username.equals("Admin")){
         return "Username already exists. Please choose a different username.";
    }
    return "Registration successful.";
 }
 public String isNullString(String input){
    if(input==null){
        return "Enter input value";
    }
    return "Input accepted";
 }
 public boolean valueNotZero(int value){
    if(value==0){
        return false;
    }
    return true;
 }
 public String provideGrdeByMarks(int marks){
    if(marks>=90){
        return "A Grade";
    }else if(marks>=80){
        return "B Grade";
    }else if(marks>=70){
        return "C Grade";
    }else if(marks>=60){
        return "D Grade";
    }
    return "F Grade";
 }
 public String speedLImitBasedFineIssues(int speed, int limit){
    if(speed>limit){
        return "Fine issued for over speeding";
    }
    return "No fine";
 }
 public String heightBasedAllowRide(int height){
    if(height<120){
        return "Not allowed to ride";
    }
    return "Allowed to ride";
 }
 public String prizeExceedBudgetNotAllowBuy(double prize, double budget){
    if(prize>budget){
        return "Cannot buy the item";
    }
    return "Item purchased successfully";
 }
 public String checkRating(double rating){
    if( rating>4.5){
        return "Top rating";
    }
    return "Not a top rating";
 }
 public String checkHightScore(int score,int highscore){
    if(score>highscore){
        return "New High Score!";
    }
    return "Try Again!";
 }
 public String lockAccount(int numberofAtemptfaild,int maxAttemps){
    if(numberofAtemptfaild>=maxAttemps){
        return "Account Locked";
    }
    return "Account Active";
 }
 public String outOfStock(int stock){
    if(stock<=0){
        return "Out of Stock";
    }
    return "In Stock";
 }
}