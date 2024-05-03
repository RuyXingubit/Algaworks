public class Variaveis {
    public static void main(String[] args) {
        // não recomendado pelo Code Conventions da Oracle
        // int minhaIdade = 38, suaIdade = 18;

        // lowerCamelCase
        int minhaIdade = 38;
        int suaIdade = 18;

        int totalIdades = minhaIdade + suaIdade;
        // não pode começar com numero
        // int 1Idade = 10;
        System.out.println("Total das idades: " + totalIdades);
    }
}
