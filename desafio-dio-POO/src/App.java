import java.time.LocalDate;

import com.desafio.dio.POO.dominio.Bootcamp;
import com.desafio.dio.POO.dominio.Curso;
import com.desafio.dio.POO.dominio.Dev;
import com.desafio.dio.POO.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria de JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMisael = new Dev();
        devMisael.setNome("Misael");
        devMisael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Misael : " + devMisael.getConteudosInscritos());
        devMisael.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Misael : " + devMisael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Misael: " + devMisael.getConteudosConcluidos());
        System.out.println("XP: " + devMisael.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
