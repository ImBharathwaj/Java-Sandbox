import java.io.File;

public class DumpRoot {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for(File root: roots){
            System.out.println(root);
        }
    }
}
