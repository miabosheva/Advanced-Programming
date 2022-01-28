package mk.finki.ukim.np.aud5.courseGrades;

import java.io.*;

public class gradesTest {
    public static void main(String[] args) {
        BufferedReader fileIn = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            fileName = fileIn.readLine();
            File file = new File(fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
