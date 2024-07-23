import java.util.ArrayList;
import java.util.List;

// Definição da classe Bootcamp
public class Bootcamp {
    // Atributos
    private String nome;
    private List<Curso> cursosOferecidos;
    private List<Mentoria> mentoriasOferecidas;
    private List<Dev> devsInscritos;

    // Construtor
    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursosOferecidos = new ArrayList<>();
        this.mentoriasOferecidas = new ArrayList<>();
        this.devsInscritos = new ArrayList<>();
    }

    // Métodos
    public void adicionarCurso(Curso curso) {
        cursosOferecidos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentoriasOferecidas.add(mentoria);
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public List<Curso> getCursosOferecidos() {
        return cursosOferecidos;
    }

    public List<Mentoria> getMentoriasOferecidas() {
        return mentoriasOferecidas;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }
}
