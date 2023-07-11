# Conversor de moeda - Challenge ONE - Alura

Repositório do desafios proposto pela ONE (Oracle Next Education) | Alura de desenvolver um conversor.  

***

## O Desafio

Foi proposto que fosse desenvolvido um conversor de moedas, com valores prefixados e um segundo conversor à escolha do aluno.

O conversor de moedas deveria fazer as seguintes conversões:

* Reais a Dólar
* Reais a Euro
* Reais a Libras Esterlinas
* Reais a Peso argentino
* Reais a Peso Chileno

E também era necessário fazer a conversão inversa:

* Dólar a Reais
* Euro a Reais
* Libras Esterlinas a Reais
* Peso argentino a  Reais
* Peso Chileno a Reais

## Desenvolvimento

Para tornar o conversor mais dinâmico, decidi por não usar valores predefinidos e consumir uma API que entregasse os valores das moedas de acordo com cotação daquele momento.

Os dados são fornecidos pela [AwesomeAPI](https://docs.awesomeapi.com.br/api-de-moedas).

Também deixei livre que o usuário decida qual moeda converter, dessa maneira expandindo as opções além das propostas pelo desafio.

Como segundo conversor decidi por adicionar outros 2 conversor, de velocidades e temperaturas.

Ambos possuem as mesmas características de que não existe opções de conversão predeterminadas, deixando o usuário livre para poder escolher suas opções para a conversão.

## Funcionalidades

O sistema apresenta 3 funçãoes.

![Tela - Menu principal](resources/01-menu.png)

***

### Conversão se moedas

> MOEDAS
>
> * BRL - Real Brasileiro
> * USD - Dólar Americano
> * EUR - Euro
> * GBP - Libra Esterlina
> * ARS - Peso Argentino
> * CLP - Peso Chileno
> * JPY - Iene Japonês
> * CNY - Yuan Chinês

![Tela - Conversor de moedas](resources/02-moeda.png)

***

### Conversão de temperatura

> TEMPERATURAS
>
> * Celsius
> * Fahrenheit
> * Kelvin

![Tela - Conversor de temperaturas](resources/03-temperatura.png)

***

### Conversão de velocidades

> VELOCIDADES
>
> * km/h - Quilômetros por hora
> * mph - Milhas por hora
> * mn/h - Milhas náuticas por hora (Nós)
> * Ma - Número de Mach

![Tela - Conversor de velocidades](resources/04-velocidade.png)

***
