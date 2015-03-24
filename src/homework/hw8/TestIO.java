package homework.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * 23.03.2015
 * Created by Tonja .
 */
public class TestIO {
    public static void main(String[] args) {
        CopyFileFactoryClass copyF = new CopyFileFactoryClass();

        CopyFileStrategy simple = copyF.createSimpleCopyFileStrategy();//Создает объект стратегии для копирования
        // файлов с помощью FileInputStream
        CopyFileStrategy buffer = copyF.createBufferedCopyFileStrategy();//Создает объект стратегии для копирования
        // файлов с помощью BufferedInputStream
        CopyFileStrategy channels = copyF.createChannelsCopyFileStrategy();
        CopyFileStrategy filesCopy = copyF.createFilesCopyFileStrategy();//Создает объект стратегии для копирования
        // файлов с помощью файлов

        String source = "C:/Workspace/home-Task/ASD.jpg";
        String destination = "C:/Workspace/home-Task/FGH.GIF";
        String destination01 = "C:/Workspace/home-Task/HJK.jpg";

        File sourceFile = new File("C:/Workspace/home-Task/ASD.jpg");
        File destinationFile = new File("C:/Workspace//home-Task/FGH.GIF");
        File destinationFile02 = new File("C:/Workspace/home-Task/HJK.jpg");

        long startTime;
        long elapsedTime;  // for speed benchmarking

        startTime = System.nanoTime();
        try {
            simple.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println( "Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            simple.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            buffer.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println( "Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            buffer.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            channels.copyFile(source, destination);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            channels.copyFile(sourceFile, destinationFile);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0)+ " msec");

        startTime = System.nanoTime();
        try {
            filesCopy.copyFile(source, destination01);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            System.out.println("FileCopyFailedException");
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");

        startTime = System.nanoTime();
        try {
            filesCopy.copyFile(sourceFile, destinationFile02);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time is " +(elapsedTime/ 1000000.0) + " msec");
    }
}



