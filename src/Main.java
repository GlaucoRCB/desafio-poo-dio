import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCampDio");
        bootcamp.setDescricao("Descrição do curso, cheio de conteúdos!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGlauco = new Dev();
        devGlauco.setNome("Glauco");
        devGlauco.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Incritos Glauco" + devGlauco.getConteudosInscritos());
        devGlauco.progredir();
        System.out.println("XP:" + devGlauco.calculaTotalXp());
        devGlauco.progredir();
        System.out.println("XP:" + devGlauco.calculaTotalXp());
        System.out.println("-");
        System.out.println("Contéudos Incritos Glauco" + devGlauco.getConteudosInscritos());
        devGlauco.progredir();
        System.out.println("Contéudos Concluídos Glauco" + devGlauco.getConteudosConcluidos());
        System.out.println("XP:" + devGlauco.calculaTotalXp());

        System.out.println("----------------------------------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Incritos Ana" + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("-");
        System.out.println("Contéudos Incritos Ana" + devAna.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Ana" + devGlauco.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calculaTotalXp());

    }
}