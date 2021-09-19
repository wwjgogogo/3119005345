import java.io.IOException;

public class MainTest {

    @org.junit.Test
    public void testMain(){
        String[] paths = {
                "text\\orig.txt",
                "text\\orig_0.8_dis_15.txt",
                "text\\ans.txt"
        };
        try {
            PaperPass.main(paths);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO流异常");
        }
    }
}
