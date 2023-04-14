package br.com.dio.desfio.dominio;

import br.com.dio.desfio.dominio.Bootcamp;
import br.com.dio.desfio.dominio.Conteudo;
import br.com.dio.desfio.dominio.Curso;
import br.com.dio.desfio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("Linguagem de Programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Linguagem de Programação JavaScript");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Ajuda para linguagem Java");
        mentoria.setDescricao("Como se desenvolver na linguagem Java");
        mentoria.setData(LocalDate.now());

     /*   System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java develope");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        dev devCamila = new dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("________________");
        System.out.println("Conteudo Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP :" + devCamila.calcularTotalXp());

        dev devJoao = new dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("___________");
        System.out.println("Conteudo Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concuidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP :" + devJoao.calcularTotalXp());



    }
}