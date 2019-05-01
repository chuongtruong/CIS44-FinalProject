package cis44finalproject;

/**
 *
 * @author chuongtruong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedBag<Student> bag = new LinkedBag<>();
        
        Student st1 = new Student("a", "b", 11.0);
        Student st2 = new Student("c", "d", 3.0);
        Student st3 = new Student("e", "f", 6.0);
        
        bag.add(st1);
        bag.add(st2);
        bag.add(st3);

        Object[] rawStudentData = bag.toArray();
        Student currentStudent;
        Student [] toArrayStudent = new Student[rawStudentData.length];
        for(int i = 0; i<rawStudentData.length; i++)
        {
            currentStudent = (Student) rawStudentData[i];
            toArrayStudent[i] = currentStudent;
        }
        
        System.out.println("Before \n");
         for(Student e : toArrayStudent)
        {
            System.out.println(e);
        }
        System.out.println("");
        sortB(toArrayStudent);
        
        System.out.println("After \n");
         for(Student e : toArrayStudent)
        {
            System.out.println(e);
        }

    }

    public static <T extends Comparable<T>> void sortB(T[] arr) {

        for (int pass = 0; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    
}
