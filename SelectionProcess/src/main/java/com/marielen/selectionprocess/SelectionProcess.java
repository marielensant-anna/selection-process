/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.marielen.selectionprocess;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author CCE
 */
public class SelectionProcess {

    public static void main(String[] args) {
    
    List<String> candidates = new ArrayList<>();
    
    verifyingCandidates(candidates, "MARIELEN","JOSE","EMANUELLE","ISABELE","ANGELINA","HELENA", "DANUCY", "PEDRO","GUSTAVO","MARIA");
    System.out.println("Ligar para os candidatos selecionados: " + candidates);
    }
    
    public static void verifyingCandidates(List<String> listOfCandidates, String...candidates){
        
        
            for (String candidate: candidates){
            double baseSalary = 2000;
            double desiredSalary = desiredSalary();
            if (baseSalary >= desiredSalary){
            listOfCandidates.add(candidate);
            System.out.printf("O candidato " + candidate + " foi selecionado com o salário base de R$: %.2f\n " , desiredSalary);
                if (listOfCandidates.size() ==5) {
                    break;
                }
        } else {
            System.out.printf("O candidato " + candidate + " não foi selecionado com o salário base de R$: %.2f\n" , desiredSalary);
            }
    }
            
        } 
    
    static double desiredSalary(){
        return ThreadLocalRandom.current().nextDouble(1800,2500);
    }
}

