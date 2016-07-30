package monsterscreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShoot {

  public boolean FullImageCapture(String fileName, String format) throws AWTException{

    Robot robot = new Robot();
    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
      try {
          ImageIO.write(screenFullImage, format, new File(fileName));
          return true;
      } catch (IOException ex) {
          return false;
      }
  }

  public boolean CapturingImagePortion(String fileName, String format) throws AWTException{
    Robot robot = new Robot();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle captureRect = new Rectangle(0, 0, screenSize.width / 2, screenSize.height / 2);
    BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
      try {
          ImageIO.write(screenFullImage, format, new File(fileName));
          return true;
      } catch (IOException ex) {
          return false;
      }

  }

}
