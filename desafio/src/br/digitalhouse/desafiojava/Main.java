package br.digitalhouse.desafiojava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager digitalHouse = new DigitalHouseManager();

        ProfessorTitular professorTitular1 = new ProfessorTitular("Back-End", "Jessica", "Milena", 4, 123);
        ProfessorTitular professorTitular2 = new ProfessorTitular("Front-End", "Hendy", "Almeida", 3, 321);
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto(100, "Erika", "Lima", 1, 001);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto(200, "João", "Silva", 2, 002);

        digitalHouse.registrarProfessorTitular(professorTitular1);
        digitalHouse.registrarProfessorTitular(professorTitular2);
        digitalHouse.registrarProfessorAdjunto(professorAdjunto1);
        digitalHouse.registrarProfessorAdjunto(professorAdjunto2);

        digitalHouse.registrarCurso("Android", 20002,3);
        digitalHouse.matricularAluno(001, 20002);
        digitalHouse.matricularAluno(002, 20002);
        digitalHouse.matricularAluno(003, 20002);

        digitalHouse.registrarCurso("Full Stack", 20001,2);
        digitalHouse.matricularAluno(003, 20001);
        digitalHouse.matricularAluno(004, 20001);

        digitalHouse.alocarProfessores(20001,123, 002);

    }
}
