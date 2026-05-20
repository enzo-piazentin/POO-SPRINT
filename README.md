# RDM - Relatório de Documentação de Metodologia

### Informações do Grupo

**Sala:** 2CCPO

**Integrantes:**
- Bento Donato Garcia - 561621
- Enzo Ribeiro Domingues Piazentin - 564216
- Guilherme Domingues Califoni - 565157
- Antonio Lucas Santana Tavares - 565516
- Lucas M. - 563677
- Gustavo Schimith - 564800

---

## Respostas às Perguntas de Reflexão

### 1. Por que TrechoRodovia é uma classe e "BR-116 KM 10 ao 15" é um objeto?

**TrechoRodovia** é uma **classe** porque:
- É um modelo/template que define a estrutura e comportamento
- Define os atributos (quilometroInicial, quilometroFinal, nivelVegetacao)
- Define os métodos (registrarCrescimento, exibirInfo, etc.)
- É uma abstração geral do conceito "trecho de rodovia"
- Não existe na memória até ser instanciada

"BR-116 KM 10 ao 15" é um **objeto** porque:
- É uma instância concreta da classe TrechoRodovia
- Possui valores específicos para os atributos (quilometroInicial=10, quilometroFinal=15)
- Ocupa espaço na memória
- Representa uma entidade real do mundo real
- Pode ter seu próprio estado independente de outros objetos

**Analogia:** Classe é como a planta de uma casa; objeto é a casa construída seguindo aquela planta.

---

### 2. Como um método difere de uma função solta em programação estruturada?

**Método (POO):**
- Pertence a uma classe e opera sobre o estado de um objeto
- Tem acesso aos atributos privados da classe (encapsulamento)
- Representa um comportamento específico daquele tipo de objeto
- Pode usar `this` para referenciar o objeto atual
- Exemplo: `registrarCrescimento()` opera sobre o `nivelVegetacao` do objeto específico

**Função (Programação Estruturada):**
- É independente, não pertence a nenhum objeto
- Recebe todos os dados necessários como parâmetros
- Não mantém estado entre chamadas
- Não tem acesso a dados encapsulados
- Exemplo: `calcularCrescimento(vegetacaoAtual, taxa)` receberia ambos como parâmetros

**Diferença chave:** Métodos estão intimamente ligados aos dados que manipulam (alto acoplamento intencional), enquanto funções são mais genéricas e independentes.

---

### 3. Se o nivelVegetacao fosse público, que tipo de "quebra" no sistema de previsão da Motiva um programador descuidado poderia causar?

Se `nivelVegetacao` fosse público, um programador descuidado poderia:

1. **Atribuir valores negativos:** `trecho.nivelVegetacao = -50;` - o que é fisicamente impossível (vegetação não tem altura negativa)

2. **Atribuir valores absurdos:** `trecho.nivelVegetacao = 999999;` - que poderia quebrar cálculos de priorização, algoritmos de previsão ou relatórios

3. **Pular validações de negócio:** Atribuir diretamente sem passar por validações que poderiam existir (ex: verificar se o crescimento é consistente com o tempo passado)

4. **Inconsistência de estado:** Modificar a vegetação sem registrar o crescimento, causando discrepâncias entre o valor atual e o histórico de crescimento

5. **Corromper o sistema de previsão:** O sistema de priorização da Motiva poderia:
   - Priorizar trechos incorretamente baseado em dados falsos
   - Gerar relatórios errados sobre quais trechos precisam de manutenção
   - Causar alocação ineficiente de equipes de manutenção
   - Levar a decisões baseadas em dados incorretos

**Impacto:** O encapsulamento protege a integridade dos dados e garante que qualquer modificação passe pelas validações apropriadas, mantendo o sistema consistente e confiável.
