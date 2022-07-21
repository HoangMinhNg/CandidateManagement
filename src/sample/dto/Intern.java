/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample.dto;

import sample.utils.Utils;

/**
 *
 * @author Admin
 */
public class Intern extends Candidate {

    private String Majors;
    private String Semeters;
    private String UniversityName;

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public String getSemeters() {
        return Semeters;
    }

    public void setSemeters(String Semeters) {
        this.Semeters = Semeters;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String UniversityName) {
        this.UniversityName = UniversityName;
    }

    @Override
    public void updateCandidate() {
        super.updateCandidate();
        Majors = Utils.getString("Majors: ", Majors);
        Semeters = Utils.getString("Semeter: ", Semeters);
        UniversityName = Utils.getString("University name: ", UniversityName);
    }

    @Override
    public void creatCandidate() {
        super.creatCandidate();
        Majors = Utils.getString("Majors: ");
        Semeters = Utils.getString("Semeter: ");
        UniversityName = Utils.getString("University name: ");
    }

    @Override
    public String toString() {
        return super.toString()+ "Intern{" + "Majors=" + Majors + ", Semeters=" + Semeters + ", UniversityName=" + UniversityName + '}' + '\n';
    }

}
