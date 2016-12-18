/**
 * Created by V on 12/17/2016.
 */
public class Main {

    public static void main(String... args){
        MethodExam exam = new MethodExam();

        String s1 = exam.get();
        String s2 = exam.get("DevColibri");
        String s3 = exam.get(5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        exam.get(true);
    }
}
