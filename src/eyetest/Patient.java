/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetest;

public class Patient extends Methods{
    
    private int id;
    private String name;
    private String Address;
    private String LeftEye;
    private String RightEye;

    public Patient(int id, String name, String Address, String LeftEye, String RightEye) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.LeftEye = LeftEye;
        this.RightEye = RightEye;
    }

    
    
    
    @Override
    public String PrescriptionLeftEye() {
        return getLeftEye(); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public String PrescriptionRightEye() {
        return getRightEye(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getLeftEye() {
        return LeftEye;
    }

    public String getRightEye() {
        return RightEye;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    
    
}
