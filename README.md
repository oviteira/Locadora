# Locadora

A tela de **Cadastro de Clientes** e **Cadastro de Veículos** incluem os dados digitados no Banco de Dados (BD) pelo botão "*Salvar*".

As telas possuem um botão "*Editar*", no qual selecionado a linha que quer editar, você altera os dados que aparecerão nos campos e clica nesse botão para fazer o *Update* dos dados no BD.

A mesma função de edição está presente na tela de "**Editar Lojas**", que pode alterar o:
* Nome
* Tipo de Veículos locados
* Preços dos dias úteis em finais de semana para clientes regulares e fidelizados

Das agências pré-existentes (Não foi adicionado o botão de adicionar novas agências).

Na tela de "**Aluguel de Veículos**", o cliente informará ao usuário:
* Quantidade de passageiros (No qual o limite é 7)
* Data de retirada de veículo
* Data de devolução do veículo

E assim fará uma pesquisa no BD, e retornará na tabela os veículos que:
* Estarão vagos nas datas
* A agência em que ele está localizado
* Valor da soma de todos os dias

Ordenados crescentementes pelo valor da soma (O métódo usado é Merge Sort). Assim que o cliente escolher qual é o carro que se adequa a ele o usuário deverá escolhe-lo na tabela e clicar no botão "*Reservar*", o levando à tela de "**Reservar Veículo**".

Na tela de "**Reservar Veículo**", o usuário escolherá o cliente que já está previamente cadastrado no BD (Um botão para chamada da tela de cadastro de clientes não foi adicionado a esta tela), os dados do veículo escolhido, as datas e valor foram migrados da tela anterior, assim o usuário clica no botão "*Reservar*", e os dados serão adicionados no BD.

Foi adicionado à tela principal um botão para consultar os veículos alugados e reservados, no qual poderá buscar, editar e apagar, uma reserva feita. A tela também possui um menu que acessa a tela "**Editar Lojas**" e uma opção "*Sair*".

Dado a data limite de reserva, o BD fará a exclusão automática da reserva.
