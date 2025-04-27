# Demonstração de conhecimento
Esse projeto visa demonstrar meus conhecimentos sobre Java e Arquitetura de Software

## Para iniciar o projeto
1. Instale as dependências maven
2. Suba o docker ``docker compose up``
3. Inicie a aplicação
4. Documentação das rotas disponível pelo Swagger na rota ``/docs`` [acesse](http://localhost:8080/docs)

## Explicação de Decisões
1. Uso de docker para iniciar o PostgreSQL, pois não conheço o sistema que irá executar, e por praticidade

## Implementações futuras
- [ ] Implementar *entrypoint* por fila
- [ ] Implementar New Relic / Open Search (observabilidade)
- [ ] Implementar *data providers* de outras api's