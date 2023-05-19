package Utilities;

import javax.swing.plaf.TableHeaderUI;

public class ReusableMethods {

    public static void wait (int second) {

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }

    }

}
