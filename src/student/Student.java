package student;

public class Student {

    private String name;
    private int test1;
    private int test2;
    private int test3;
    

    public Student(){
        name = "";
        test1=0;
        test2=0;
        test3=0;
        //now we can type : Student s= new Student(); in aother class;
    }
    

    public void setName(String n){
        name=n;
    }
    
    public String getName(){
        return name;
    
    }
    
    public void setScore(int i, int score){
        if(i==1) test1=score;
        else if(i==2) test2=score;
        else test3=score;       
}
    

    
    public int getScore (int i){
        if (i==1) return test1;
        else if (i==2) return test2;
        else
            return test3;
    }
    
    public int getAverage(){
        int average; // local variable; not a property of studnts
        average = (int)
                Math.round((test1 + test2 + test3) / 3.0);
        return average;
    }
    
    
    public int getHighScore(){
        int high = Math.max(test1,test2);
        int highScore;
        highScore = test1;
        if (test2> highScore) highScore = test2;
        if (test3> highScore) highScore = test3;
        return highScore;
    }
    

    
    
    
    public String toString(){
        String str;
        str = "Name:    " + name + "\n" +
              "Test1:    " + test1 + "\n" +
              "Test2:    " + test2 + "\n" +
              "Test3:    "+test3 + "\n"+
              "Average: " + getAverage();
        return str;
    }
public String validateData(){
      String em = null;
      if ( name.equals(""))
          em="Name is required.";
      if (test1<0 || test1>100 || test2<0 || test2>100 || test2<0 || test2>100)
          if (em==null)
              em="At least 1 mark is out of the acceptable range";
      else
              em+="\nAt least 1 mark is out of the acceptable range";
      if (em != null)
          em+="\nPlease re-enter all the data\n";
      return em;
        
    }
}


