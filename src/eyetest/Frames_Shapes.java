/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetest;

public class Frames_Shapes extends Methods {
 
    private String shape;

    public Frames_Shapes(String shape) {
        this.shape = shape;
    }

    public Frames_Shapes() {
    }

    public String getShape() {
        return shape;
    }
    
    
    
    
     @Override
     public String Frames() {
        return getShape();
    }

}
