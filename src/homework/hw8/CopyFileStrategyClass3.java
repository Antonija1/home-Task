package homework.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Third class
 * 23.03.2015
 * Created by Tonja .
 */
public class CopyFileStrategyClass3 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (!new File(s1).exists()) {
            throw new FileAlreadyPresentsException("File don't already present");
        }
        try (FileChannel in = new FileInputStream(s).getChannel();
             FileChannel out = new FileOutputStream(s1).getChannel()) {
            out.transferFrom(in, 0, in.size());
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException("  Copy failed except.");
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
    }
}
