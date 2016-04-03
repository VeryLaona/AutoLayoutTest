package model;

/**
 * Created by Kwong on 2016-04-02.
 */
public class Visitor {
    private String FName ;
    private String FSex ;
    private int FAge ;
    private String FCapitalName ;
    private String FPassportNumb ;

    public int getFAge() {
        return FAge;
    }

    public void setFAge(int FAge) {
        this.FAge = FAge;
    }

    public String getFSex() {
        return FSex;
    }

    public void setFSex(String FSex) {
        this.FSex = FSex;
    }

    public String getFCapitalName() {
        return FCapitalName;
    }

    public void setFCapitalName(String FCapitalName) {
        this.FCapitalName = FCapitalName;
    }

    public String getFPassportNumb() {
        return FPassportNumb;
    }

    public void setFPassportNumb(String FPassportNumb) {
        this.FPassportNumb = FPassportNumb;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }
}
