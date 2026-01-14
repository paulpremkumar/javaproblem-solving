class ConditionalProblem{
    public static void main(String[] args){
        ConditionalProblem cp = new ConditionalProblem();
        Boolean isVoterEligible=cp.isVoterEligible(20);
        System.out.println("Is voter eligible: "+isVoterEligible);
      System.out.println(cp.emptyPasswordVidate(""));
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
}