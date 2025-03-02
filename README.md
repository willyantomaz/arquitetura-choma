# arquitetura-choma

## 1. Descrição do Produto

Nossa aplicação conecta prestadores de serviços a clientes de forma simples e eficiente. Profissionais de diversas áreas poderão divulgar seus serviços, enquanto os usuários terão uma plataforma prática para encontrar especialistas e agendar atendimentos com facilidade. O projeto será desenvolvido com a arquitetura MVC, garantindo organização e escalabilidade.

## 2. Organização dos Componentes do Projeto

## 3. Implementação de uma Funcionalidade

## 4. Como Funciona?

## 5. Definição do Produto

A plataforma conecta prestadores de serviços a clientes de forma simples e eficiente. Profissionais podem divulgar seus serviços, enquanto clientes encontram e agendam especialistas com facilidade. A arquitetura MVC será utilizada para garantir organização e escalabilidade.<br>

### Público-alvo
### - Clientes: 
Usuários que buscam serviços de diversas categorias, priorizando preço e urgência, mas também interessados na qualidade e avaliação dos prestadores.
### - Prestadores de serviços: 
Profissionais que desejam divulgar seus serviços, gerenciar seus horários e aumentar sua base de clientes.
### Contexto de uso:
### - Clientes: 
Utilizarão a plataforma para buscar prestadores por categoria, localização e avaliação, agendar serviços, receber confirmações e avaliar os prestadores. O cliente poderá atualizar suas informações a qualquer momento.
### - Prestadores: 
Utilizarão a plataforma para criar um perfil profissional, gerenciar sua agenda, confirmar agendamentos e visualizar o histórico de serviços. O prestador poderá atualizar suas informações profissionais a qualquer momento, definir horários de trabalho e dias de folga.
## 6. Requisitos do Sistema
## 6.1 Requisitos Funcionais
### 6.1.1 Gerenciamento de Usuários
### RF001: 
O sistema deve permitir o cadastro de clientes e prestadores de serviço com informações pessoais (nome, e-mail, telefone) e profissionais (especialidade, descrição do serviço, localização).<br>
### RF002: 
O sistema deve oferecer autenticação segura via e-mail e senha, com opção de recuperação de senha.<br>
### RF003: 
O prestador de serviço deve poder atualizar suas informações profissionais (descrição, fotos, portfólio) a qualquer momento.<br>
### RF004 : 
O cliente (solicitante do serviço) deve poder atualizar suas informações (identidade, comprovante de residência, fotos) a qualquer momento.<br>
### RF005: 
O cliente deve poder visualizar o perfil completo do prestador, incluindo avaliações, serviços oferecidos e disponibilidade.<br>
<br>
### 6.1.2 Busca e Filtragem de Prestadores<br>
### RF005: 
O cliente deve poder buscar prestadores por nome, categoria de serviço, avaliação e localização.
### RF006: 
O sistema deve exibir uma lista de prestadores com filtros por categoria, avaliação, preço e disponibilidade.
### RF007: 
O sistema deve exibir a disponibilidade dos prestadores em tempo real, permitindo que o cliente escolha horários adequados.
### RF008: 
O cliente deve poder favoritar prestadores para acesso rápido no futuro.

### 6.1.3 Agendamento de Serviços<br>
### RF009: 
O cliente deve poder selecionar um prestador, escolher um horário disponível e confirmar o agendamento.
### RF010: 
O prestador deve receber uma notificação sobre um novo agendamento e poder confirmar ou rejeitar a solicitação.
### RF011: 
O sistema deve permitir o cancelamento ou reagendamento de serviços por ambas as partes (cliente e prestador).
### RF012: 
O cliente deve receber uma confirmação do agendamento por e-mail e/ou SMS.
### RF013: 
O sistema deve bloquear horários agendados automaticamente para evitar conflitos.

### 6.1.4 Pagamentos e Transações<br>
### RF014: 
O sistema deve oferecer múltiplas formas de pagamento, incluindo PIX, cartão de crédito/débito e boleto bancário.
### RF015: 
O cliente deve poder visualizar o orçamento do serviço antes de confirmar o agendamento.
### RF016: 
O sistema deve gerar recibos automáticos após o pagamento.
### RF017: 
O prestador deve poder configurar preços diferentes para serviços específicos.
### RF018: 
O sistema deve permitir reembolsos em casos de cancelamento, seguindo políticas pré-definidas.

### 6.1.5 Notificações e Lembretes<br>
### RF019: 
O sistema deve enviar notificações em tempo real sobre confirmações, cancelamentos e alterações de agendamentos.
### RF020: 
O cliente e o prestador devem receber lembretes automáticos (por e-mail ou SMS) sobre agendamentos próximos.
### RF021: 
O sistema deve enviar notificações de promoções ou novidades para usuários cadastrados.

### 6.1.6 Avaliações e Feedback<br>
### RF022: 
O cliente deve poder avaliar o serviço prestado com notas (ex.: 1 a 5 estrelas) e comentários.
### RF023: 
O sistema deve exibir a média de avaliações no perfil do prestador.
### RF024: 
O prestador deve poder responder às avaliações dos clientes.
### RF025: 
O sistema deve permitir que os clientes editem ou removam suas avaliações dentro de um período limitado.

### 6.1.7 Gestão de Agenda e Disponibilidade<br>
### RF026: 
O prestador deve poder definir seus horários de trabalho e dias de folga.
### RF027: 
O sistema deve permitir que o prestador bloqueie horários indisponíveis manualmente.
### RF028: 
O cliente deve poder visualizar a agenda do prestador em tempo real.
### RF029: 
O sistema deve sugerir horários alternativos caso o horário desejado pelo cliente esteja indisponível.

### 6.1.8 Relatórios e Análises<br>
### RF030: 
O prestador deve poder visualizar relatórios de serviços prestados, receitas e avaliações.
### RF031: 
O sistema deve gerar relatórios mensais para o prestador, incluindo métricas de desempenho.
### RF032: 
O cliente deve poder visualizar seu histórico de agendamentos e serviços contratados.

### 6.1.9 Administração e Segurança<br>
### RF034: 
O sistema deve permitir que administradores gerenciem usuários (clientes e prestadores) e revisem relatórios de uso.
### RF035: 
O sistema deve garantir a segurança dos dados dos usuários por meio de criptografia.
### RF036: 
O sistema deve estar em conformidade com a LGPD (Lei Geral de Proteção de Dados).
### RF037: 
O sistema deve permitir que administradores suspendam ou removam contas em caso de violação das políticas de uso.

### 6.1.10 Integrações e Funcionalidades Adicionais<br>
### RF038: 
O sistema deve integrar-se com Google Agenda ou outros calendários para sincronização de horários.
### RF039: 
O sistema deve permitir que prestadores cadastrem portfólios de trabalhos anteriores.
### RF040: 
O sistema deve oferecer um chat integrado para comunicação direta entre cliente e prestador.
### RF041: 
O sistema deve permitir que clientes solicitem orçamentos personalizados diretamente na plataforma.
### RF042: 
O sistema deve enviar pesquisas de satisfação após a conclusão do serviço.

## 6.2 Requisitos Não Funcionais
### RNF001 - Desempenho: 
O sistema deve ser capaz de processar até 100 agendamentos simultâneos sem degradação perceptível na experiência do usuário, incluindo tempos de resposta para buscas e confirmações de agendamentos inferiores a 3 segundos.
### RNF002 - Escalabilidade: 
O sistema deve ser projetado para suportar um crescimento de até 1000 usuários ativos sem comprometer a performance, permitindo que novos prestadores e clientes se cadastrem e agendem serviços de maneira contínua.
### RNF003 - Disponibilidade: 
O sistema deve ter uma disponibilidade de 99,5% durante o horário comercial, com manutenção programada em horários de baixo tráfego para minimizar o impacto aos usuários.
### RNF004 - Segurança: 
O sistema deve exigir que as senhas criadas pelos usuários sigam critérios de segurança ideais, com senhas de no mínimo 12 caracteres incluindo letras maiúsculas, minúsculas, números e caracteres especiais.
### RNF005 - Compatibilidade: 
O aplicativo deve ser compatível com as últimas versões de sistemas operacionais Android e iOS, além de ser acessível por navegadores modernos como Chrome, Safari e Firefox.
### RNF006 - Usabilidade: 
O sistema deve garantir que 95% dos usuários consigam completar o processo de agendamento em até 4 etapas simples, com uma interface intuitiva e fácil de navegar para clientes e prestadores de serviços.
### RNF007 - Recuperação de Dados: 
O sistema deve incluir históricos de agendamentos e serviços realizados, juntamente com históricos de transações, permitindo fácil visualização pelo usuário.
### RNF008 - Redundância e Tolerância a Falhas:
O sistema deve ser projetado com redundância em nível de servidor e banco de dados, garantindo que, caso um servidor falhe, outro esteja disponível para manter a continuidade do serviço.
### RNF009 - Responsividade: 
O aplicativo deve ser responsivo, adaptando-se a diferentes tamanhos de tela e dispositivos (smartphones, tablets, etc.), oferecendo uma experiência de usuário consistente em todas as plataformas.
### RNF010 - Conformidade Legal:
O sistema deve seguir as diretrizes da Lei Geral de Proteção de Dados (LGPD), permitindo aos usuários gerenciar e excluir seus dados pessoais, conforme exigido pela legislação brasileira.
## 7. Restrições e Condições
### Restrições Técnicas:
- #### Escolha de tecnologias:
	As tecnologias para o desenvolvimento da plataforma já foram definidas. O backend será desenvolvido em Java com Spring Boot, o frontend em Angular e o banco de dados será PostgreSQL. A autenticação e segurança serão implementadas com JWT (JSON Web Tokens). Para testes, serão utilizados JUnit (backend) e Jasmine/Karma (frontend). A documentação da API será feita com Swagger, e o versionamento do código com Git (GitHub/GitLab).
### Restrições Não Técnicas:
- #### Orçamento: 
	Risco na conclusão do projeto pelo orçamento investido.
- #### Prazos de entrega: 
	Risco de atraso na entrega de tarefas.
- #### Requisitos Legais e Regulatórios:
  A plataforma deve estar em conformidade com a LGPD (Lei Geral de Proteção de Dados).<br>
- #### Adesão de prestadores:
  Risco de baixa adesão de prestadores de serviço.<br>
- #### Retenção de clientes:
  Dificuldade na retenção de clientes.<br>
- #### Modelo de pagamentos:
  Risco de baixa aceitação do modelo de pagamentos.<br>
## 8. Necessidades dos Stakeholders

## 9. Tendências Tecnológicas

## 10. Riscos do Projeto
- Riscos Técnicos:<br>
Falta de escalabilidade do sistema.<br>
Problemas de integração entre backend e frontend.<br>
Vazamento de dados sensíveis.<br>
Incompatibilidades com certos tipos de dispositivos e navegadores.<br>
Falhas no processamento de pagamentos e reembolsos.<br>
- Riscos Operacionais:<br>
Baixa adesão de prestadores de serviço.<br>
Dificuldade na retenção de clientes.<br>
Falta de controle sobre a qualidade dos serviços prestados.<br>
- Riscos de Negócio:<br>
Concorrência forte dificultando a entrada no mercado.<br>
Baixa aceitação do modelo de pagamentos.<br>
Riscos legais (LGPD, regulamentações, golpes).<br>

## 11. Tomada de Decisões
As linguagens escolhidas foram Java e Angular.

- Java: Familiaridade com a linguagem, utilização do Spring Boot<br>
- Angular: Possui boa integração com o Java, utilizando mesmo paradigma<br>
- Postgres: Banco relacional de uso gratuito<br>

## 12. Organização da Arquitetura MVC
Para a parte de model foram criadas as seguintes entidades baseadas no funcionamento do projeto, separadas em uma pasta domain:
- Appointment
- Category
- Job
- Provider
- Schedule
- User<br>
Foram então criadas as services, controllers e repository para o CRUD de cada entidade, e também um genérico que é estendido nessas services e controllers para as partes mais básicas de um crud.
A parte da view foi feita então contemplando a listagem de uma dessas entidades.

## 13. Avaliação das Decisões
A escolha de utilizar o java com spring ajudou para o desenvolvimento da api pelas diversas facilidades que esse framework fornece por exemplo para gerenciar a injeção de dependências no projeto, a simplificação para persistir dados e para futuras implementações de testes. Também foi escolhido pela experiência de parte do grupo trabalhando com java e spring boot, e por conta de ser um framework com uma comunidade bastante ativa o que auxilia para pesquisa caso tiver alguma dúvida sobre o funcionamento do spring.<br>
Já a escolha do angular foi feita por conta da possibilidade de organizar o projeto com componentes diminuindo a repetição de excessiva de código e também por ser mais fácil de integrar com o java.<br>
Por enquanto também foi utilizado para o banco de dados o H2 o que ajudou por conta da implementação simples nesse projeto.
