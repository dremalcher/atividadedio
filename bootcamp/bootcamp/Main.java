
    public class Main {
        public static void main(String[] args) {
            // Criando um Bootcamp
            Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Full Stack");
    
            // Criando cursos
            Curso cursoJava = new Curso("Java Fundamentals", 40, "João Silva");
            Curso cursoSpring = new Curso("Spring Boot Essentials", 60, "Maria Souza");
    
            // Adicionando cursos ao Bootcamp
            bootcampJava.adicionarCurso(cursoJava);
            bootcampJava.adicionarCurso(cursoSpring);
    
            // Criando mentorias
            Mentoria mentoriaArquitetura = new Mentoria("Arquitetura de Software", "José Santos");
            Mentoria mentoriaCarreira = new Mentoria("Desenvolvimento de Carreira", "Ana Lima");
    
            // Adicionando mentorias ao Bootcamp
            bootcampJava.adicionarMentoria(mentoriaArquitetura);
            bootcampJava.adicionarMentoria(mentoriaCarreira);
    
            // Criando desenvolvedores
            Dev dev1 = new Dev("Pedro", "Backend");
}
    } 