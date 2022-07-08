Cenário

Tovendo é um site fictício onde seus usuário podem consultar informações sobre diversos notebooks e celulares.
Como o sistema ainda está em fase de testes, foram implementados 4 dispositivos no sistema de consulta: 2 celulares (das marcas Sansung e Xiaome), e 2 notebooks (Del e Negativo).

Sobre a aplicação, esta foi feita baseando-se em 3 padrões: Fábrica Abstrata, Fachada e Estratégia.
A Fábrica Abstrata pode ser visualizada na maneira em que os dispositivos herdam o método de consulta da classe principal, deste modo, um mesmo método é invocado para saber informações de qualquer dispositivo cadastrado no sistema.
Indo um pouco mais além, o padrão Fachada da um pouco mais de autonomia ao sistema, requerendo um input ainda menor do usuário, isolando o cliente das funções de baixo nível.
Com a utilização do padrão Estratégia, as classes de nível mais baixo são responsáveis por lidar individualmente de cada marca de dispositivo do sistema, assim sendo, a adição ou modificação de qualquer uma delas, não afetará nenhuma outra.