package variables;

public class School {
    private int classroomAmount = 10;
    private int studentAmount = 86;
    private int teacheramount =14;
    private double averageTeacherSalary =70_000.0;
    private double totalExpenditure =1_206_724.86;
    private double totalBudget =1_500_00.0;
    private String name = "red Mountain High School";
    private boolean  isAccredited =true;

    //methods
    public int studentperclassroom() {
        return Math.round( (float) studentAmount / classroomAmount );
    }

    public double costperstudent(){
        double teacherExpenditure = teacheramount * averageTeacherSalary;
        double studentExpenditure = totalExpenditure - teacherExpenditure;

        return studentExpenditure / studentAmount;
    }

    public double costperclassroom(){
        return studentperclassroom() * costperstudent();
    }

    public boolean iswithinBudget(){
        return totalBudget > totalExpenditure;
    }

    public double roundToNearestCent(double value){
        int numPennies =(int) (value * 100);
        return numPennies /100.0;
    }

    public void main() {

        System.out.println("Students per classroom: " + studentperclassroom());
        System.out.println("Cost per student: " + roundToNearestCent(costperstudent()));
        System.out.println("Cost per classroom: " + roundToNearestCent(costperclassroom()));
    }
}
