class AlunoInstancia {
        public static void main(String args[]) {
                Aluno aluno1 = new Aluno();
                Aluno aluno2 = new Aluno();
                Aluno aluno3 = new Aluno();

                aluno1.nome = "Aluno 1";
                aluno1.matricula = "20241011000000";

                aluno2.nome = "Aluno 2";
                aluno2.matricula = "20241011000001";

                aluno3.nome = "Aluno 3";
                aluno3.matricula = "20241011000002";

                aluno1.estudar();
                aluno1.dormir();
                aluno2.dormir();

                System.out.println(aluno1.nome + " media: " + aluno1.calcularMedia(10, 9));
        }
}

class Aluno {
        String nome;
        String matricula;
        int mediaGeral = -1;

        void estudar() {
                System.out.println(nome + " estuda, estuda, estuda!");
        }

        void dormir() {
                System.out.println(nome + " zzzzzzzzzzzzzzzzzzz...");
        }

        int calcularMedia(int n1, int n2) {
                int media = (n1 + n2) / 2;

                return media;
        }
}
