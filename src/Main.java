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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}