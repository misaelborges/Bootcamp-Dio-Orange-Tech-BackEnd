import java.time.LocalDate;

import com.desafio.dio.POO.dominio.Curso;
import com.desafio.dio.POO.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        mentoria1.setTitulo("Mentoria de JAVA");
        mentoria1.setDescricao("Descrição mentoria de JAVA");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        
    }
}
