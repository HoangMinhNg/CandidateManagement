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
public class Fresher extends Candidate {

    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    @Override
    public void updateCandidate() {
        super.updateCandidate();
        Graduation_date = Utils.getString("Graduatione date: ", Graduation_date);
        Graduation_rank = Utils.getString("Graduatione rank: ", Graduation_rank);
        Education = Utils.getString("Education: ", Education);

    }

    @Override
    public void creatCandidate() {
        super.creatCandidate();
        Graduation_date = Utils.getString("Graduatione date: ");
        Graduation_rank = Utils.getString("Graduatione rank: ");
        Education = Utils.getString("Education: ");
    }

    @Override
    public String toString() {
        return super.toString()+ "Fresher{" + "Graduation_date=" + Graduation_date + ", Graduation_rank=" + Graduation_rank + ", Education=" + Education + '}' + '\n';
    }

}
