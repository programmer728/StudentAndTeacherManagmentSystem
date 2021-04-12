package util;

import java.io.*;

public class FileUtility {

    public static void writeObjectToFile(Object obj,String fileName) throws IOException {
        FileOutputStream writeObjectToFile=new FileOutputStream(fileName);
        ObjectOutputStream mainlyWriterObjectToFile=new ObjectOutputStream(writeObjectToFile);
        mainlyWriterObjectToFile.writeObject(obj);
    }

    public static Object readObjectFromFile(String fileName) throws Exception {
        try(FileInputStream fileInputStream=new FileInputStream(fileName);
        ObjectInputStream objectOutputStream =new ObjectInputStream(fileInputStream)){
            return objectOutputStream.readObject();
        }catch (Exception exception){
            return null;
        }
    }

}
