# atividadedio
contaterminal
classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet

    class iPhone {
    }

    class ReprodutorMusical {
        -Musicas[] musicas
        +tocar() : void
        +pausar() : void
        +selecionarMusica() : void
    }

    class AparelhoTelefonico {
        -Contato[] contatos
        +redeDisponivel() : boolean
        +ligar() : void
        +atender() : void
        +iniciarCorreioVoz() : void
    }

    class NavegadorInternet {
        -conexaoInternet() : boolean
        +exibirPagina() : void
        +adicionarNovaAba() : void
        +atualizarPagina() : void
    }