package homework.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Fought class
 * 23.03.2015
 * Created by Tonja .
 */
public class CopyFileStrategyClass4 implements CopyFileStrategy {
       @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (!new File(s1).exists()) {
            throw new FileAlreadyPresentsException("File don't already present");
        }
           try {
               Path pathSource = Paths.get(s);
               Path pathDestination = Paths.get(s1);
               Files.copy(pathSource, pathDestination);
           } catch (IOException e) {
               System.err.println("errors");
               e.printStackTrace();
               throw new FileCopyFailedException(" Copy failed exception");
           }

    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getPath(), file1.getPath());
    }
}
