package part15.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailAddr, String fileName) {

        try {
            Properties mailProp = Database.getProperties(fileName);
            String userName = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title(userName + "`s web page");
            writer.paragraph("Welcome to " + userName + "`s page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailAddr, userName);
            writer.close();
            System.out.println(fileName + "is created for " + mailAddr + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
