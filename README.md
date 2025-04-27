# Demonstração de conhecimento
Esse projeto visa demonstrar meus conhecimentos sobre Java e Arquitetura de Software

## Para iniciar o projeto
1. Instale as dependências maven
2. Suba o docker ``docker compose up``
3. Inicie a aplicação
4. Documentação das rotas disponível pelo Swagger na rota ``/docs`` [acesse](http://localhost:8080/docs)

## Explicação de Decisões
1. Uso de docker para iniciar o PostgreSQL, pois não conheço o sistema que irá executar, e por praticidade
2. Uso do Slf4j ao invés do Log4j após problemas com vulnerabilidade
3. Utilização de arquitetura limpa para escalabilidade

### Decisões arquiteturais
1. Separação das dependências do Framework do resto do código, como no Controller, que a definição das rotas como ``@RequestMapping`` estão em uma interface separada.
2. As dependências são baseadas em comportamento (interface), evitando referências concretas e abrindo para extensão (SOLID).
3. Todas as funcionalidades são separadas em Use Cases e agregadas pelas Application de acordo com contexto de cada.
4. Separação de Domain (core) para armazenar regra de negócio e Entity (infra) para banco de dados.
5. Utilização de Data Providers para comunicação externa (banco de dados / api's terceiras).

## Problemas conhecidos
- Testes estão apenas nas regras até o momento, o ideal seria cobrir o comportamento do software como inteiro

## Implementações futuras
- [ ] Implementar *entrypoint* por fila
- [ ] Implementar New Relic / Open Search (observabilidade)
- [ ] Implementar *data providers* de outras api's
- [ ] Demonstração de padrões de projetos como Strategy e Factory para outras possibilidades de fluxos da aplicação