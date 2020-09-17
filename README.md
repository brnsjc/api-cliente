# api-cliente
* Api para Cadastro de Cliente

Arquitetura
*Api pensada e desenvolvida em camadas, seguimentando e segarando deveres/tarefas por cada camada, sendo divida em Service,Business,Controller,Repository;
*Banco de dado Mysql usada para armazenamento e .sql anexado ao projeto para criação local;
*Padrão Rest, com envio e recebimento de Json

Banco de Dados
*Criado 3 tabelas, sendo cliente,campanha e campanha_cliente para vincular campanhas e clientes seguindo melhor pratica de SQL de tabela intermedira;
*Query nativas foram integradas ao Java(camada Repository) e também utilizado HQL para querys de apenas consultas;

*Fluxo
*Observando e analisando o fluxo para cadastro de cliente, foi desenvolvido o banco de dados para melhor atender a solução;
*Após entendimento da necessidade e regra de negocio, foi criada a camada de Business para executar toda a regra;
*Na camada business posui a verificação de campanhas, quais são vencidas, alteração, e save;
*Ao inserir nova campanha, a camada Business verifica campanhas com a mesma data e realiza todo o processo de atualização adicionando dias as datas de forma que não tenham campanhas que vençam no mesmo dia;



