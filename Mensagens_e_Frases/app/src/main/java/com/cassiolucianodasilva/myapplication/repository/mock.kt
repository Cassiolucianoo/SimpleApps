package com.cassiolucianodasilva.myapplication.repository

import com.cassiolucianodasilva.myapplication.infra.MotivationConstants
import java.util.*


data class Phrase (val description: String, val category: Int)

class Mock {
    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val LOVE = MotivationConstants.PHRASEFILTER.LOVE
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY

    private  val mListPhrase: List<Phrase> = listOf(
        Phrase("Hoje é o seu dia para começar leve, comer certo, treinar pesado, viver saudável e de se orgulhar!",HAPPY),
        Phrase("Quando alimentamos mais a nossa coragem do que os nossos medos passamos a derrubar muros e a construir pontes!",HAPPY),
        Phrase("A coragem nunca foi questão de músculos, ela é uma questão de coração. O músculo mais duro treme diante de um medo imaginário.",HAPPY),
        Phrase("O sucesso é construído à noite! Durante o dia você faz o que todos fazem.",HAPPY),
        Phrase("A realização de um sonho depende de dedicação. Há muita gente que espera que o sonho se realize por mágica, mas toda mágica é ilusão, e a ilusão não tira ninguém de onde está.",HAPPY),
        Phrase("Subtraía seu medo e multiplique sua coragem e o resultado sera extraordinário!",HAPPY),
        Phrase("Evolução\n" +
                "Charlie Brown Jr.\n" +
                "A vida me ensinou a nunca desistir,\n" +
                "Nem ganhar, nem perder,\n" +
                "Mas procurar evoluir.",HAPPY),
        Phrase("Há dois tipos de pessoas que não interessam a uma boa empresa: as que não fazem o que se manda e as que só fazem o que se manda.",HAPPY),
        Phrase("Se for do meu merecimento. Se for o melhor pra minha felicidade. Se for me tornar uma pessoa melhor, que assim seja feito.",HAPPY),
        Phrase("Romanos 8:31\n" +
                "Que diremos, pois, a estas coisas? Se Deus é por nós, quem será contra nós?",HAPPY),
        Phrase("Fechei os olhos e pedi um favor ao vento: Leve tudo que for desnecessário. Daqui para frente apenas o que couber no bolso e no coração.",HAPPY),
        Phrase("As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente...",HAPPY),
        Phrase("A vida nunca ficará mais fácil, então trate de ser cada vez mais forte!",HAPPY),
        Phrase("Assim é a vida: daqui a pouco a página vira, o cenário muda, novos ventos surgem, nova brisa, novos ares, novos amores.",HAPPY),
        Phrase("Ora, veja o lado bom das coisas! Você já parou para pensar o que seriam das oportunidades se não fossem as mudanças.",HAPPY),
        Phrase("Hoje é o seu dia para começar leve, comer certo, treinar pesado, viver saudável e de se orgulhar!",HAPPY),
        Phrase("Não conheço ninguém que conseguiu realizar seu sonho sem sacrificar feriados e domingos pelo menos uma centena de vezes.",HAPPY),
        Phrase("Duvide do que vem fácil. Não desista do que é difícil.",HAPPY),
        Phrase("Conquiste o mundo sem perder a essência da humildade.",HAPPY),
        Phrase("Não se faz grandes coisas por impulso. Elas são feitas por uma junção de pequenas coisas.",HAPPY),
        Phrase("Conquiste seus sonhos para a vida real com determinação, fé e perseverança.",HAPPY),
        Phrase("Pessoas humildes e vencedoras agem como água. Antes de grandes voos, abaixam a cabeça.",HAPPY),
        Phrase("A história do homem nunca é escrita pela sorte, mas pela escolha... a escolha dele.",HAPPY),
        Phrase("Você é a única luz que eu já vi na minha vida. Você é quem me aparece em sonhos e me conforta quando preciso. Achei que era apenas carinho, mas não poderia estar mais enganado(a). A paixão bateu em minha porta e se convidou para entrar. Fiquei de braços abertos.",LOVE),
        Phrase("A gente nunca imagina que o coração tem razão. Às vezes ele nos prega tantas peças e nos faz se apaixonar por pessoas improváveis. Mas ele é justo e sempre resolve nossas dores, com o tempo. Assim, podemos encontrar alguém para nos fazer felizes. Nunca imaginei, mas esse alguém na minha vida é você.",LOVE),
        Phrase("Inesperado. Essa é a palavra que define o modo como as coisas foram acontecendo entre a gente. Uma conversa inocente no bar, uma troca de telefone, outro encontro displicente. Quando dei por mim, estava começando a me apaixonar. Cada dia mais e mais.",LOVE),
        Phrase("Dizem que os opostos se atraem, essa frase não poderia ser mais perfeita para o acontece com a gente. Mesmo com tantas ideias e vontades diferentes, não existe outra pessoa no mundo que eu queira ver, senão você. Essa vontade só cresce, pois conto os dias para ouvir sua voz e poder falar sobre o meu dia.",LOVE),
        Phrase("Estou te entregando meu coração aos poucos, até você notar completamente. Quando perceber já faremos parte da vida um do outro, compartilhando sentimentos, frustrações e desejos, fazendo planos e construindo sonhos. Não vejo a hora de concluir o download dessa paixão.",LOVE),
        Phrase("Nunca imaginei que caberia um sentimento tão puro dentro do meu peito ou que esperaria ansiosamente por um telefonema. Sempre me achei controlado(a) e racional, mas fui pega desprevenida e agora não tem mais volta. Estou, sim, me apaixonando por você.",LOVE),
        Phrase("Não consigo manter minha mente em nada mais, todos os minutos do meu dia envolvem você. Nada do que você faz me parece errado. Suas atitudes sempre têm minha aprovação. Seus diálogos são precisos e esclarecem minhas dúvidas. Me pego satisfeita com sua presença e sempre ansiando mais.",LOVE),
        Phrase("Eu poderia gastar cada centavo meu para ter mais momentos ao seu lado. Dormiria na rua se por isso você me notasse. Tão louco imaginar coisas desse tipo, só para conquistar sua afeição... Me parece que deixou de ser carinho e tudo se transformou em uma paixão avassaladora que só faz crescer.",LOVE),
        Phrase("Gostaria de te dizer algumas coisas que estão acontecendo comigo. Eu não paro de pensar em você, vivo falando sozinha sobre o que se passa em meu coração e paro diante do espelho encarando um rosto apaixonado. Me dei conta há pouco tempo, mas deixa eu continuar me apaixonando por você?",LOVE),
        Phrase("Essa noite me transportei para perto de você. Me vi dançando nossa música, conversando sobre a nossa vida e te beijando apaixonadamente. Não posso estar louco(a), acredito que esteja realmente entregue a você",LOVE),
        Phrase("Resolvi deixar as coisas acontecerem. Imagine minha surpresa quando percebi que gosto de você do jeitinho que você é. Não quero complicar o que parece fácil, portanto vamos viver isso. Não quero me enganar sendo forte e combatendo essa paixão.",LOVE),
        Phrase("Do nada você apareceu, todo(a) perfeito e cheio de ideias novas. Foi um sopro de ar fresco num momento conturbado. Um guia para a felicidade e o prazer. Quase perdi a carona, mas seus olhos me chamaram com muito carinho. Não havia maneira de perder isso.",LOVE),
        Phrase("Vem aqui e me diz o quanto você me quer. Eu quero mudar nossas vidas, mas preciso saber se está comigo. Meu coração está incontrolável só de imaginar você do meu lado. Isso prova que estou cada vez mais apaixonada.",LOVE),
        Phrase("Desconheço o começo do meu amor por você. Mas aos poucos me vi sem fala, com as mãos suadas e desejando um beijo seu. Não dá para saber quando teve início, mas não quero que acabe. Vou me jogar nesse sentimento e quero ser amparada por você.",LOVE),
        Phrase("Você é a única luz que eu já vi na minha vida. Você é quem me aparece em sonhos e me conforta quando preciso. Achei que era apenas carinho, mas não poderia estar mais enganado(a). A paixão bateu em minha porta e se convidou para entrar. Fiquei de braços abertos.",LOVE),
        Phrase("Inesperado. Essa é a palavra que define o modo como as coisas foram acontecendo entre a gente. Uma conversa inocente no bar, uma troca de telefone, outro encontro displicente. Quando dei por mim, estava começando a me apaixonar. Cada dia mais e mais.",LOVE)

    )


    fun getPhrase(categoryId: Int ): String{

        val filtered = mListPhrase.filter { (it.category == categoryId || categoryId == ALL) }

        val rand =  Random().nextInt(mListPhrase.size)
        return mListPhrase[rand].description

    }


}