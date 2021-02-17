# Descrição das atividades

### BandasdeRock
Sistema para registro de bandas de rock e seus respectivos músicos.

### CampeonatoSurf
Sistemas para atribuir categoria de acordo com a idade a atletas de surf. 

### ProgramaCoach
Desenvolva um sistema para ser usado por coachs. Os coachs precisam encontrar os seus coachees(clientes), 
só não pode ter uma quantidade de coachees que ele não consiga dar atenção. Então os Coachs devem se cadastrar 
no sistema com o nome, os coachees que acompanha, quantidade máxima de coachees que pode auxiliar, se pode fazer 
atendimento virtual ou não e a área de atuação (ex: coach de carreira profissional, carreira acadêmica, 
sentimentos, esportivo, etc). Os Coachees por sua vez, também serão cadastrados com nome, área de necessidade 
(ex: profissional, acadêmica, etc - igual o de cima) e  se ele quer o atendimento exclusivamente virtual ou só presencial. 

Quando um coachee quiser ser auxiliado por um couch, é preciso que o sistema verifique se o couch é da área que ele quer, 
pode atender na modalidade q ele precisa (Virtual ou presencial) e se ainda tem espaço para mais um coachee 
(baseando-se na quantidade que ele pode atender). Caso alguma dessas verificações não bata, o sistema precisa 
dizer que deu incompatibilidade de coach.

Desafio: Informar qual foi a incompatibilidade que foi gerada. Ex1: Incompatibilidade de coach, pois o número de 
coachees foi atingido.

### ProgramasJogosOn
Você foi convidado a desenvolver um módulo de uma plataforma Web de jogos On-line. 
O sócio lhe informou que os usuários se cadastram no sistema com nome, idade e e-mail e também escolhe 
que tipo de jogador ele se considera: Amador ou Profissional. Se ele optar por profissional, no cadastro 
dele será acrescentado um Ranking que é uma pontuação numérica dentro da plataforma, que indicará qual a 
posição dele na plataforma inteira.
O jogador depois de cadastrado, ele pode adicionar vários jogos que ele se interesse. Quando ele é amador 
ele ganha 20 moedas (da plataforma) a cada jogo que ele adicione. Se ele for profissional 50 moedas.
O jogo vai está cadastrado no sistema com nome, indicação e grau de dificuldade. A indicação é a idade mínima 
permitida para adicionar o jogo. Não permita que jogadores com idade inferior possa adicionar um jogo não liberado. 
O ranking, o sócio explicou que deixaria para implementação futura, já que ele já quer a primeira versão 
no ar daqui a 1h30min, mas é preciso que a plataforma esteja pronta para receber esse valor. 
Você precisa ser rápido, o sócio está aguardando só você para tudo ficar pronto! 

### Vírus 
Elaborar um sistema para catalogar dados de vírus, com as características de nome, gravidade (valores entre 1 e 5), 
data de descoberta(não precisa trabalhar com data, pode ser texto mesmo), taxa de mortalidade e se há vacina ou não. 

Caso não haja vacina e a taxa de mortalidade já tenha atingido 0.5, a gravidade, automaticamente, deve ser configurada 
para 5. Caso a taxa seja menor que 0.5, mas não tenha vacina, a gravidade cai para 4. Se houver vacina e a taxa estiver 
acima de 0.5, a gravidade é 3, entre 0.2 e 0.4 é 2 e abaixo de 0.2, a gravidade é 1. Ao registrar um vírus no sistema, 
é esperado que ainda não tenha vacina pra ele, então ele já deve vir configurado para "false".
Teste todo o sistema em uma classe contendo método main() e solicite os dados da tela, utilizando JOptionPane.
