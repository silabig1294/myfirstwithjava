package ID_Lab4_1;

public class Grading {
    public static void main(String[] args) {
        Grade Mr_A = new Grade();
        Mr_A.calGrade(88);
    }
}
class Grade{
    private char grade;
    Grade(){
        grade = 'R';
    }
    public void calGrade(int score){
        if(score >= 80 && score <=100){
            grade = 'A';
        }
        else if(score >=70 && score <=79){
            grade = 'B';
        }
        else if(score >=60 && score <=69){
            grade = 'C';
        }
        else if(score >=50 && score <=59){
            grade = 'D';
        }
        else if(score >=0 && score <=49){
            grade = 'F';
        }
        else grade = 'N';
        System.out.println("Grade = "+grade);
    }
}
