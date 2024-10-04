/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Patil
 */
public class person {
    private String FirstName;
    private String LastName;
    private String Ssn;
    private short Age;
    private String HAddress;
    private String HUnitNo;
    private String HCity;
    private String HState;
    private int HZip;
    private long HPhno;
    private String WAddress;
    private String WUnitNo;
    private String WCity;
    private String WState;
    private int WZip;
    private long WPhno;
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String Ssn) {
        this.Ssn = Ssn;
    }

    public short getAge() {
        return Age;
    }

    public void setAge(short Age) {
        this.Age = Age;
    }

    public String getHAddress() {
        return HAddress;
    }

    public void setHAddress(String HAddress) {
        this.HAddress = HAddress;
    }

    public String getHUnitNo() {
        return HUnitNo;
    }

    public void setHUnitNo(String HUnitNo) {
        this.HUnitNo = HUnitNo;
    }

    public String getHCity() {
        return HCity;
    }

    public void setHCity(String HCity) {
        this.HCity = HCity;
    }

    public String getHState() {
        return HState;
    }

    public void setHState(String HState) {
        this.HState = HState;
    }

    public int getHZip() {
        return HZip;
    }

    public void setHZip(int HZip) {
        this.HZip = HZip;
    }

    public long getHPhno() {
        return HPhno;
    }

    public void setHPhno(long HPhno) {
        this.HPhno = HPhno;
    }

    public String getWAddress() {
        return WAddress;
    }

    public void setWAddress(String WAddress) {
        this.WAddress = WAddress;
    }

    public String getWUnitNo() {
        return WUnitNo;
    }

    public void setWUnitNo(String WUnitNo) {
        this.WUnitNo = WUnitNo;
    }

    public String getWCity() {
        return WCity;
    }

    public void setWCity(String WCity) {
        this.WCity = WCity;
    }

    public String getWState() {
        return WState;
    }

    public void setWState(String WState) {
        this.WState = WState;
    }

    public int getWZip() {
        return WZip;
    }

    public void setWZip(int WZip) {
        this.WZip = WZip;
    }

    public long getWPhno() {
        return WPhno;
    }

    public void setWPhno(long WPhno) {
        this.WPhno = WPhno;
    }
    
    @Override
    public String toString(){
        return FirstName;
    }

    
}
