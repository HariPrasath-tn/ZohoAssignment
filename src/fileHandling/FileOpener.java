package fileHandling;

import java.io.*;

public class FileOpener {
    private final File FILE_NAME;
    private FileInputStream i_in_s;
    private DataInputStream d_in_s;
    private FileOutputStream i_out_s;
    private DataOutputStream d_out_s;
    FileOpener(String fileName){
        FILE_NAME = new File(fileName);
    }
    private void writeFile(String content) throws Exception{
        i_out_s = new FileOutputStream(FILE_NAME);
        d_out_s = new DataOutputStream(i_out_s);
        d_out_s.writeUTF(content);
        i_out_s.close();
        d_out_s.close();
    }

    private void readFile() throws Exception{
        i_in_s = new FileInputStream(FILE_NAME);
        d_in_s = new DataInputStream(i_in_s);
        String content = d_in_s.readUTF();
        System.out.println(content);
        i_in_s.close();
        d_in_s.close();
    }

    public FileOpener accessFile(String fileName){
        return new FileOpener(fileName);
    }

    public void read() throws Exception{
        this.readFile();
    }

    public void write(String content) throws Exception{
        this.writeFile(content);
    }
}
