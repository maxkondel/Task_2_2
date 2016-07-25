package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) throws Exception,FileNotFoundException {

        String fileName = "F:\\json.txt";

        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);

        System.out.println();

        Gson gson = new GsonBuilder().create();
        Person person = (Person) gson.fromJson(textFromFile, Person.class);


        System.out.println(person);

    }
}
