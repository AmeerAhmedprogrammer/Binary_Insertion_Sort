//Ameer Ahmed
import java.io.File; // Import the File class
import java.io.IOException; //Import this to handle errors
import java.io.FileWriter; // Import the FileWriter class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class BinaryInsertionSort {
    
    public static void CreateFile() {
        try {
            File Object1 = new File("StudentRecords.txt");
            if (Object1.createNewFile()) {
                System.out.println("File created: " + Object1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        try {
            File Object2 = new File("OutputSort.txt");
            if (Object2.createNewFile()) {
                System.out.println("File 2 created: " + Object2.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    public static void WriteFile() {
        try {
            FileWriter myWriter = new FileWriter("StudentRecords.txt");
            myWriter.write("Unsorted Output:\r\n" + "\r\n" + "Student ID: 45336\r\n" +
                "Name: Izuku Midoriya\r\n" + "Age: 17\r\n" + "GPA: 99.9\r\n" + "\r\n" + "Student ID:78902\r\n" 
                + "Name: Ochako Uraraka\r\n" + "Age: 16\r\n" + "GPA: 96.4\r\n" + "\r\n" + "Student ID:89532\r\n" 
                + "Name: Himiko Toga\r\n" + "Age: 15\r\n" + "GPA: 95.1\r\n" + "\r\n" + "Student ID:12567\r\n" 
                + "Name: Momo Yaoyorozu\r\n" + "Age: 14\r\n" + "GPA: 98.2\r\n" + "\r\n" + "Student ID:54397\r\n" 
                + "Name: Tsuyu Asui\r\n" + "Age: 18\r\n" + "GPA: 97.3\r\n" + "\r\n" + "Student ID:04214\r\n" 
                + "Name: Kyouka Jirou\r\n" + "Age: 17\r\n" + "GPA: 94.5\r\n" + "\r\n" + "Student ID:67843\r\n" 
                + "Name: Tomura Shigaraki\r\n" + "Age: 12\r\n" + "GPA: 93.4\r\n" + "\r\n" + "Student ID:89632\r\n" 
                + "Name: Shoto Todoroki\r\n" + "Age: 13\r\n" + "GPA: 92.2\r\n" + "\r\n" + "Student ID:53245\r\n" 
                + "Name: Denki Kaminari\r\n" + "Age: 14\r\n" + "GPA: 91.3\r\n" + "\r\n" + "Student ID:35534\r\n" 
                + "Name: Eijiro Kirishima\r\n" + "Age: 15\r\n" + "GPA: 98.7\r\n" + "\r\n" + "Student ID:80963\r\n" 
                + "Name: Mina Ashido\r\n" + "Age: 16\r\n" + "GPA: 97.4\r\n" + "\r\n" + "Student ID:03465\r\n" 
                + "Name: Katsuki Bakugo\r\n" + "Age: 14\r\n" + "GPA: 95.2\r\n" + "\r\n" + "Student ID:25804\r\n" 
                + "Name: Minoru Mineta\r\n" + "Age: 15\r\n" + "GPA: 93.1\r\n" + "\r\n" + "Student ID:78531\r\n" 
                + "Name: Camie Utsushimi\r\n" + "Age: 17\r\n" + "GPA: 97.7\r\n" + "\r\n" + "Student ID:78323\r\n" 
                + "Name: Hitoshi Shinso\r\n" + "Age: 13\r\n" + "GPA: 90.0\r\n" + "\r\n" + "Student ID:00532\r\n" 
                + "Name: Nejire Hado\r\n"+ "Age: 14\r\n" + "GPA: 89.8\r\n" + "\r\n" + "Student ID:11389\r\n" 
                + "Name: Tenya Iida\r\n" + "Age: 16\r\n" + "GPA: 88.1\r\n" + "\r\n" + "Student ID:99232\r\n" 
                + "Name: Toru Hagakure\r\n" + "Age: 18\r\n" + "GPA: 89.4\r\n" + "\r\n" + "Student ID:88453\r\n" 
                + "Name: Mirio Togata\r\n" + "Age: 17\r\n" + "GPA: 89.6\r\n" + "\r\n" + "Student ID:44552\r\n" 
                + "Name: Kai Chisaki\r\n"+ "Age: 14\r\n" + "GPA: 88.5");
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void OutputSorted(Student[] StudentRoster) {
        
        try {
            FileWriter myWriter2 = new FileWriter("OutputSort.txt");
            myWriter2.write("\nOutput sorted: ");
            for (int i = 0; i <= StudentRoster.length - 1; i++) {
                myWriter2.write(StudentRoster[i].toString());
            }
            myWriter2.close();
            System.out.println("Successfully wrote to the file. \n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void Readfile() {
        
        try {
            File myObj3 = new File("StudentRecords.txt");
            Scanner myReader = new Scanner(myObj3);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
        try {
            File myObj4 = new File("OutputSort.txt");
            Scanner myReader2 = new Scanner(myObj4);
            while (myReader2.hasNextLine()) {
                String data2 = myReader2.nextLine();
                System.out.println(data2);
            }
            myReader2.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void binaryInsertionSort(Student[] StudentRoster) {
        
        int length = StudentRoster.length;
        for (int i = 1; i < length; ++i) {
            Student key = StudentRoster[i];
            int insertedPosition = findPosition(StudentRoster, 0, i - 1, key);
            for (int j = i - 1; j >= insertedPosition; --j) {
                StudentRoster[j + 1] = StudentRoster[j];
            }
            StudentRoster[insertedPosition] = key;
        }
    }

    public static int findPosition(Student[] StudentRoster, int start, int end, Student key) {
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key.getstu_id() < StudentRoster[mid].getstu_id()) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        
        BinaryInsertionSort.CreateFile();
        BinaryInsertionSort.WriteFile();
        BinaryInsertionSort.Readfile();
        
        Student Student1 = new Student(45336, "Izuku Midoriya", 17, 99.9);
        Student Student2 = new Student(78902, "Ochako Uraraka", 16, 96.4);
        Student Student3 = new Student(89532, "Himiko Toga", 15, 95.1);
        Student Student4 = new Student(12567, "Momo Yaoyorozu", 14, 98.2);
        Student Student5 = new Student(54397, "Tsuyu Asui", 18, 97.3);
        Student Student6 = new Student(04214, "Kyouka Jirou", 17, 94.5);
        Student Student7 = new Student(67843, "Tomura Shigaraki", 12, 93.4);
        Student Student8 = new Student(89632, "Shoto Todoroki", 13, 92.2);
        Student Student9 = new Student(53245, "Denki Kaminari", 14, 91.3);
        Student Student10 = new Student(35534, "Eijiro Kirishima", 15, 98.7);
        Student Student11 = new Student(80963, "Mina Ashido", 16, 97.4);
        Student Student12 = new Student(03465, "Katsuki Bakugo", 14, 95.2);
        Student Student13 = new Student(25804, "Minoru Mineta", 15, 93.1);
        Student Student14 = new Student(78531, "Camie Utsushimi", 17, 97.7);
        Student Student15 = new Student(78323, "Hitoshi Shinso", 13, 90.0);
        Student Student16 = new Student(00532, "Nejire Hado", 14, 89.8);
        Student Student17 = new Student(11389, "Tenya Iida", 16, 88.1);
        Student Student18 = new Student(99232, "Toru Hagakure", 18, 89.4);
        Student Student19 = new Student(88453, "Mirio Togata", 17, 89.6);
        Student Student20 = new Student(44552, "Kai Chisaki", 14, 88.5);
        Student[] StudentRoster = { Student1, Student2, Student3, Student4, Student5, Student6,
        Student7, Student8, Student9, Student10, Student11, Student12, Student13, Student14,
        Student15, Student16, Student17,Student18, Student19, Student20 };
        binaryInsertionSort(StudentRoster);
        OutputSorted(StudentRoster);
}
}
