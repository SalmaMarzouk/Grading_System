import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String studentName = JOptionPane.showInputDialog(null,"اسم الطالب: ");
        String first = JOptionPane.showInputDialog(null,"درجة المادة الاولي: ");
        String second = JOptionPane.showInputDialog(null,"درجة المادة الثانية: ");
        String third = JOptionPane.showInputDialog(null,"درجة المادة الثالثة: ");
        String fourth = JOptionPane.showInputDialog(null,"درجة المادة الرابعة: ");
        String fifth = JOptionPane.showInputDialog(null,"درجة المادة الخامسة: ");
        String sixth = JOptionPane.showInputDialog(null,"درجة المادة السادسة: ");
        double[] subjectsMarks = new double[6];
        subjectsMarks[0] = Double.parseDouble(first);
        subjectsMarks[1] = Double.parseDouble(second);
        subjectsMarks[2] = Double.parseDouble(third);
        subjectsMarks[3] = Double.parseDouble(fourth);
        subjectsMarks[4] = Double.parseDouble(fifth);
        subjectsMarks[5] = Double.parseDouble(sixth);
        double totalMark = getTotal(subjectsMarks);
        String grade = getGrade(totalMark);
        JOptionPane.showMessageDialog(null,"اسم الطالب : "+studentName+"\n"+"الدرجة الكلية : "+ totalMark +"\n"+ "التقدير : "+ grade);
    }
    //method to take each student marks of 6 subjects and find his total percentage mark
    public static double getTotal (double[] subMarks){
        double total = 0;
        for (double subMark :subMarks) {
            total = total + subMark;
        }
        total = total/600;
        total = total*100;
        return total;
    }

    //method to take the total mark and find the student's grade
    public static String getGrade (double mark){
        String grade = "";
        if(mark >= 90){
            grade = "A-ممتاز";
        }
        else if(mark >= 80 && mark < 90){
            grade = "B-جيد جدا";
        }
        else if (mark >= 70 && mark < 80){
            grade = "C-جيد";
        }
        else if (mark >= 60 && mark < 70){
            grade = "D-مقبول";
        }
        else {
            grade = "F-راسب";
        }
        return grade;
    }

}
