import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  noLoop();

    if (randomNumber() == 1) {
        rowMan1();
        heart1();
    }
    if (randomNumber() == 2){
        rowMan2();
        heart2();
    }
    else if (randomNumber() == 3){
      rowMan3();
      heart3();
    }
  }  

    /**
     * 
     * Generates a new number from 1 to 4 (inclusive)
     * 
     * @return a random value ranging from 1 to 4 (inclusve)
     * 
     */
  private int randomNumber() {
    Random myRandom = new Random();
    int intRandom = myRandom.nextInt(4);
    return intRandom;
  }
  
  /**
   * 
   * Draws and positions a heart based on the inputted values (intX and intY)
   * 
   * @param intX the first interger (the x coordinate)
   * @param intY the second interger (the y coordinate)
   * 
   */
  private void heart(int intX, int intY){
    fill (0,0,0);
    ellipse(intX, intY, 8, 10);
    ellipse(intX + 5, intY, 8, 10);
    triangle(intX - 4, intY, intX + 8, intY, intX + 3, intY + 12);
    noStroke();
  }
  
  /**
   * Uses the heat() method to postion multiple hearts on the screen (it inputs the value of the x and y coordinate) 
   * 
   */
  private void heart1(){
    // top row of hearts
    for (int xValue = 10; xValue <= 790; xValue += 20){
      heart(xValue, 10);
    }
    // bottom row of hearts
    for (int xValue = 10; xValue <= 790; xValue += 20){
      heart(xValue, 385);
    }
  }
  
  /**
   * Uses the heat() method to postion multiple hearts on the screen (it inputs the value of the x and y coordinate) 
   */
  private void heart2(){
    // left row of hearts
    for (int yValue = 10; yValue <= 385; yValue += 20){
      heart(10, yValue);
    }
    // right row of hearts
    for(int yValue = 10; yValue <= 385; yValue += 20){
      heart(780, yValue);
    }
  }

  /**
   * 
   * Uses the heat() method to postion multiple hearts on the screen (it inputs the value of the x and y coordinate) 
   * 
   */
  private void heart3(){
    // top row of hearts
    for (int xValue = 10; xValue <= 750; xValue += 40){
      heart(xValue, 10);
    }
    // bottom row of hearts
    for (int xValue = 50; xValue <= 750; xValue += 40){
      heart(xValue, 385);
    }
    // left row of hearts
    for (int yValue = 10; yValue <= 385; yValue += 40){
      heart(10, yValue);
    }
    // right row of hearts
    for(int yValue = 10; yValue <= 385; yValue += 40){
      heart(780, yValue);
    }
  }
  /**
     * 
     * This draws a stick man based on the given x coordinate (X) and  y coordinate (Y)
     * 
     * @param X The first interger (the X coordinate of the image)
     * @param Y The second interger (they Y coordinate of the image)
     * 
     */
  private void man(int X, int Y){
    // Head
    fill(210, 255, 173); 
    ellipse(50 + X, 20 + Y, 20, 20);
    // Body
    line(50 + X, 30 + Y, 50 + X, 45 + Y);
    // Arms 
    line(35 + X, 30 + Y, 50 + X, 40 + Y);
    line(50 + X, 40 + Y, 65 + X, 30 + Y);
    // Legs
    line(50 + X, 45 + Y, 35 + X,57 + Y);
    line(50 + X, 45 + Y, 65 + X,57 + Y);
  }

  /**
   * Uses the man() method to postion multiple stick figures on the screen (it inputs the value of the x and y coordinate) 
   */
  private void rowMan1() {
    for (int xAxis = 0; xAxis < 750; xAxis += 50){
      for (int yAxis = 10; yAxis < 350; yAxis += 50){
        if (yAxis == 10){
          // red
          stroke(255, 0, 0);
        }
        else if (yAxis == 60) {  
          // orange
          stroke(255, 111, 0);
        }
        else if (yAxis == 110){
          // yellow 
          stroke(255, 234, 0);
        }
        else if (yAxis == 160){
          // green
          stroke(9, 255, 0);
        }
        else if (yAxis == 210){
          // light blue
          stroke(0, 217, 255);
        }
        else if (yAxis == 260){
          // dark blue
          stroke(0, 76, 255);
        }
        else if (yAxis == 310) {
          // purple
          stroke(140, 0, 255);
        }
        man(xAxis, yAxis);
      }
    }  
  }

  /**
   * Uses the man() method to postion multiple stick figures on the screen (it inputs the value of the x and y coordinate) 
   */
  private void rowMan2() {
    for (int xAxis = 0; xAxis < 750; xAxis += 50){
      for (int yAxis = 10; yAxis < 350; yAxis += 50){
        if (yAxis == 10){
          // purple
          stroke(140, 0, 255);
        }
        else if (yAxis == 60) {  
          // dark blue
          stroke(0, 76, 255);
        }
        else if (yAxis == 110){
          // light blue
          stroke(0, 217, 255);
        }
        else if (yAxis == 160){
          // green
          stroke(9, 255, 0);
        }
        else if (yAxis == 210){
          // yellow 
          stroke(255, 234, 0);
        }
        else if (yAxis == 260){
          // orange
          stroke(255, 111, 0);
        }
        else if (yAxis == 310) {
          // red
          stroke(255, 0, 0);
        }
        man(xAxis, yAxis);
      }
    }  
  }

  /**
   * Uses the man() method to postion multiple stick figures on the screen (it inputs the value of the x and y coordinate) 
   */
  private void rowMan3(){
    for (int xAxis = 0; xAxis < 750; xAxis += 50){
      for (int yAxis = 10; yAxis < 350; yAxis += 50){
        if (yAxis == 10){
          // pink
          stroke(255, 192, 203);
        }
        else if (yAxis == 60) {  
          // dark blue
          stroke(0, 76, 255);
        }
        else if (yAxis == 110){
          // pink
          stroke(255, 192, 203);
        }
        else if (yAxis == 160){
          // dark blue
          stroke(0, 76, 255);
        }
        else if (yAxis == 210){
          // pink
          stroke(255, 192, 203);
        }
        else if (yAxis == 260){
          // dark blue
          stroke(0, 76, 255);
        }
        else if (yAxis == 310) {
          // pink
          stroke(255, 192, 203);
        }
        man(xAxis, yAxis);
      }
    }  
  }
  
}