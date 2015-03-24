package homework.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * First class
 * 23.03.2015
 * Created by Tonja .
 */
public class CopyFileStrategyClass1 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

        FileInputStream in = null;
        FileOutputStream out = null;

        if (!new File(s1).exists()) {
            throw new FileAlreadyPresentsException("File don't already present");
        }
        try {
            in = new FileInputStream(s);
            out = new FileOutputStream(s1);

            int byteRead; // Read a raw byte, returns an int of 0 to 255.
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException(" Copy failed exception");
        } finally {  // always need close the I/O streams
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
    }
}

