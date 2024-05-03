public class OperadoresAritimeticos {
    public static void main(String[] args) {

        int minhaIdade = 38;
        int suaIdade = 18;

        // adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das idades: " + totalIdades);

        //subtração
        int diferencaIdades = minhaIdade - suaIdade;
        System.out.println("Diferença das idades: "+ diferencaIdades);

        //multiplicação
        int dobroDaIdade = 2* suaIdade;
        System.out.println("Dobro da sua Idade: "+ dobroDaIdade);

        //divisão
        int metadeDaIdade = suaIdade / 2;
        System.out.println("Metade da sua Idade: "+ metadeDaIdade);

        //divisão Modulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da Divisão (módulo): " + restoDivisao);

        //media e a importancia da prioridade de execução
        int idadeJoao = 40;
        int idadeMedia = (minhaIdade + suaIdade + idadeJoao) / 3;
        System.out.println("Idade Média: "+idadeMedia);



    }
}
