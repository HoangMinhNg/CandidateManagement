package sample.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import sample.dto.I_List;
import sample.dto.Candidate;
import sample.dto.Experience;
import sample.dto.Fresher;
import sample.dto.Intern;
import sample.utils.Utils;

public class CandidateList extends ArrayList<Candidate> implements I_List {
    Candidate cand = null;
    Scanner sc = new Scanner(System.in);

    @Override
    public int find(String code) {
        int index = -1;
        index = this.indexOf(new Candidate(code));
        return index;
    }

    @Override
    public boolean add() {
        boolean result = false;
        String code = "";
        boolean cont = true;
        do {
            code = Utils.getString("Input ID: ");
            int index = this.find(code);
            if (index == -1) {
                cont = false;
            }
        } while (cont);
        System.out.println("1. Create Experience");
        System.out.println("2. Create Fresher");
        System.out.println("3. Create Intern");
        int type = Utils.getInt("Input type: ", 1, 3);
        
        switch (type) {
            case 1:
                cand = new Experience();
                cand.creatCandidate();
                cand.setId(code);
                this.add(cand);
                break;
            case 2:
                cand = new Fresher();
                cand.creatCandidate();
                cand.setId(code);
                this.add(cand);
                break;
            case 3:
                cand = new Intern();
                cand.creatCandidate();
                cand.setId(code);
                this.add(cand);
                break;
            default:
                break;
        }
        result = true;
        return result;
    }

    @Override
    public boolean remove() {
        boolean result = false;
        String ID = Utils.getString("Input ID that you want to remove: ");
        int index = this.find(ID);
        if (index > -1) {
            boolean confirmRemove = Utils.confirmYesNo("Do you want to remove ID inputted? (Y/N)");
            if (confirmRemove) {
                this.remove(new Candidate(ID));
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean update() {
        boolean result = false;
        String ID = Utils.getString("Input ID that you want to update: ");
        int index = find(ID);
        if (index < 0 || index > this.size()) {
            return result;
        }
        this.get(index).updateCandidate();
        return result;
    }

    @Override
    public void sort() {
        Collections.sort(this);
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

    @Override
    public void search() {
        String code = "";
        code = Utils.getString("Input ID that you want to search: ");
        int index = this.find(code);
        if (index > -1) {
            System.out.println(this.get(index).toString());
        }
    }
}