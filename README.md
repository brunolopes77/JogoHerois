# JogoHerois

## Descrição do sistema

O sistema Academia de Heróis do Reino de Arcádia foi desenvolvido para cadastrar e 
gerenciar até 20 heróis. Cada herói possui nome, nível e vida, além de características 
específicas de sua classe: Guerreiro, Mago ou Arqueiro. 
O sistema permite cadastrar, listar e buscar heróis, além de apresentar estatísticas 
gerais, como quantidade de personagens por classe, média de nível e herói de maior nível. 
Também possui a funcionalidade de escolher no menu a opção “missão”. 

## Conceitos de Orientação a Objetos utilizados 

● Classes e objetos: foram criadas classes como Heroi, Guerreiro, Mago, 
Arqueiro, Missao e Academia. 

● Encapsulamento: os atributos são private e acessados por meio de getters e 
setters.

● Abstração: Heroi é uma classe abstrata que reúne características comuns aos 
personagens. 

● Herança: Guerreiro, Mago e Arqueiro herdam de Heroi. 

● Polimorfismo: um array de Heroi pode armazenar objetos de diferentes subclasses. 

● Override: cada classe de herói sobrescreve o método exibirDados() para 
apresentar suas próprias características.
