void main() {
    ArrayList<String> listaDeNomes = new ArrayList<>();
    boolean ativo = false;

    while (!ativo) {
        int menu = Integer.parseInt(IO.readln("1 - para adicionar nome. \n2 - caso queira ver a lista. \ncaso queira sair digite qualquer outro numero."));

        if (menu == 1) {
            String novoNome = IO.readln("escreva o nome que deseja adicionar:");

            listaDeNomes.add(novoNome);

        } else if (menu == 2) {
            IO.println(listaDeNomes);
        } else{
            IO.println(listaDeNomes);
            break;
        }
    }
    }

