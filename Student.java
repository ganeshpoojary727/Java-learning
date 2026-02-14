/*Create a class Student with String name and int marks.

In main, create an Array of Objects (just like int[], but Student[]).

Student[] classList = new Student[3];

Manually create 3 students (new Student()) and put them into the array slots (0, 1, 2).

Assign them different names and marks.

Loop through the array and print everyone's info.*/
public class Student {
    String name;
    int usn;
public static void main(String[] args){
    Student[] classList=new Student[3];

    classList[0] = new Student(); 
    classList[1] = new Student();
    classList[2] = new Student();

    classList[0].name="ganesh";
    classList[0].usn=032;

    classList[1].name="patil";
    classList[1].usn=033;

    classList[2].name="gowtham";
    classList[2].usn=034;

    for(int i=0;i<classList.length;i++){
        System.out.println("The student:\t"+classList[i].name+"\tUSN:\t"+classList[i].usn+"\n");
    }
}
}
