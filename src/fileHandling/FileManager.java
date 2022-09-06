package fileHandling;

final class FileManager{
    public static void main(String[] args) throws Exception{
        FileOpener file = new FileOpener("Temp.txt");
        file.write("This is file handling concept testing");
        file.read();
    }
}
