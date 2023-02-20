import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot rb = new Robot();

        while (true) {
            Thread.sleep(1000);
            rb.keyPress(KeyEvent.VK_W);
            rb.keyRelease(KeyEvent.VK_W);

            Thread.sleep(100);

            rb.keyPress(KeyEvent.VK_D);
            rb.keyRelease(KeyEvent.VK_D);
        }
    }
}
