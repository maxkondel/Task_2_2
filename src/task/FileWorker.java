package task;

import java.io.*;

public class FileWorker{
        public static String read(String fileName) throws FileNotFoundException {

            StringBuilder sb = new StringBuilder();

            File file = new File(fileName);
            try {

                BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
                try {

                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                } finally {

                    in.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }


            return sb.toString();
        }
}
