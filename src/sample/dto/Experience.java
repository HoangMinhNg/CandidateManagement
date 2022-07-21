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
public class Experience extends Candidate {

    private int yearInExperience;
    private String skill;

    public int getYearInExperience() {
        return yearInExperience;
    }

    public void setYearInExperience(int yearInExperience) {
        this.yearInExperience = yearInExperience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void updateCandidate() {
        super.updateCandidate();
        yearInExperience = Utils.getInt("Year of experience: ", 1, 100, yearInExperience);
        skill = Utils.getString("Skill: ", skill);
    }

    @Override
    public void creatCandidate() {
        super.creatCandidate();
        yearInExperience = Utils.getInt("year of experience: ", 1, 100);
        skill = Utils.getString("Skill: ");
    }

    public void deleteExperience() {

    }

    public void searchExperience() {

    }

    @Override
    public String toString() {
        return super.toString()+ " yearInExperience = " + yearInExperience + ", skill = " + skill + "}\n";
    }
}
