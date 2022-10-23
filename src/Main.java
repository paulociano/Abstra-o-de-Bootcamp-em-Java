import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: " + devPaulo.getNome() + " - Conteúdos Inscritos: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Dev: " + devPaulo.getNome() + " - Conteúdos Concluídos: " + devPaulo.getConteudosConcluidos());
        System.out.println("Dev: " + devPaulo.getNome() + " - Conteúdos Inscritos: " + devPaulo.getConteudosInscritos());
        System.out.println("Total XP: " + devPaulo.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: " + devHenrique.getNome() + " - Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        devHenrique.progredir();
        System.out.println("Dev: " + devHenrique.getNome() + " - Conteúdos Inscritos: " + devHenrique.getConteudosInscritos());
        System.out.println("Dev: " + devHenrique.getNome() + " - Conteúdos Concluídos: " + devHenrique.getConteudosConcluidos());
        System.out.println("Total XP: " + devHenrique.calcularTotalXp());
    }
}
