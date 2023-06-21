package FredericoA2;

public class RpgTree {
	public static Node buildRPGTree() {
		final Node rootNode = new Node(
				"Você é um aventureiro inciante com uma fome de aventura, um dia acorda e vai direto para o hub da guilda para pegar uma nova missão,"
						+ "\nlá contém duas missões que chamaram atenção para os seus olhos. As duas consistem em investigar o desaparecimento de aldeões e aventureiros"
						+ "\ncom ambas tendo o mesmo valor de recompensa, qual delas você aceita? [1] Floresta | [2] Caverna");
		final Node forestNode = new Node(
				"Você entra em uma floresta totalmente escura, com ventos fortes que apagam instantaneamente suas tochas e a única fonte de luz são algumas"
						+ "\nlanternas presas em firmes postes no caminho, por\u00e9m voc\u00ea encontra uma bifurca\u00e7\u00e3o que separa um caminho em dois, sendo eles:"
						+ "\numa trilha com arvores ainda mais agitadas ou uma trilha com alguma fonte de luz vindo do fundo dela, qual delas você vai? [1] Trilha Sinistra | [2] Trilha 'Iluminada'");
		final Node tigerNode = new Node(
				"Em meio a escura e densa escuridão que a floresta abrenje você nota marcações nas árvores incomuns ao qualquer outra já vista,"
						+ "\nlogo apos as pegadas no chão ficam bem mais perceptiveis e isso se tratava de uma besta elemental e poderia ser a causa dos desaparecimentos."
						+ "\nEquanto o aventureiro se afundava nos pensamentos e possibilidades, uma fera aparece descendo minunsciosamente de uma árvore e você acaba notando esse ataque bem em cima da hora.\nQual sua reação? [1] Se preparar pro contra-ataque | [2] Apertar os cintos e correr bastante");
		final Node tigerDeathNode = new Node(
				"Enquanto o temido tigre inicia o ataque, você apenas manteve a calma e empunhou sua espada em uma velocidade inimaginal."
						+ "\nCom o ataque bloqueado a fera ficou com a guarda compleatamente exposta e apenas uma penetrada foi o necessario para desabilitar tal monstruosidade"
						+ "\napos a fera cair no chão você começou a investar o local proximo e acabou encontrando um possivel local de descanço utilizado pelo tigre."
						+ "\nUm buraco na montanha com um cheiro muito forte de carne podre e perto do local havia inumeros cranios no chão, bem provavelmente essas foram os aldões desaparecidos...");
		final Node deathByTigerNode = new Node(
				"Enquanto você corria floresta a fora percebeu que nada mudava, parecia que estava correndo em circulo e que a floresta não tinha fim."
						+ "\nA ultima coisa vista foram os olhos intimidadores e presas afiadas do poderoso tigre, ele estava apenas brincando com sua presa, que teve o mesmo final como todos os outros...");
		final Node witchNode = new Node(
				"Ao se aproximar da misteriosa luz você encontra uma estranha cabana simples e tradicional, ao entrar nela encontra uma mulher peculiar fazendo poções."
						+ "\nAparentemente é uma bruxa e é melhor ser cauteloso com ela, o que você vai fazer? [1] Questionar a bruxa | [2] Atacar a bruxa");
		final Node questionNode = new Node(
				"Você passou 15 arduos minutos perguntando sobre os desaparecimentos recorrentes na vila, a bruxa evitou e igonrou todas elas."
						+ "\nApos perder a paciencia ela te encara e ameaça repentinamente 'Se você não sair da minha propriedade e nunca mais voltar farei que você se arrependa de ter iniciado essa conversa',"
						+ "\nbem possivelmente essa bruxa foi responsavel pelos sumiços, com tamanha energia transmitida por ela vai ser necessario aventureiros mais experientes...."
						+ "\nVocê precisa de mais tempo de treinamento...");
		final Node attackWitchNode = new Node(
				"No mesmo segundo que você encostou em sua espeda acabou sentindo uma pressão muito alta nos olhos e desmaiou de cansaço repentino."
						+ "\nVocê acorda em um laboratorio macabro amarrado em uma cruz, em sua volta possui varios corpo de possiveis pessoas que foram brutalmente usadas como experimento..."
						+ "\nSerá que algum dia alguem vai aparecer para te salvar? Será que vai dar tempo? Todas essas perguntas feitas em vão, pois, seu destino já estava fadado.");
		final Node caveNode = new Node(
				"Você se encontra em uma caverna escura e cheia de humidade, cada passo, cada gota do teto ecoam pelas paredes desse buraco sem fim."
						+ "\nApos um tempo caminhando você encontra uma bifurcação, na esquerda possuia um tipo de totem feito com ossos humanos e na esquerda havia muitos escombros na entrada,"
						+ "\ncomo se alguem tivesse escondendo algo, onde voc\u00ea deseja ir? [1] Esquerda | [2] Direita");
		final Node goblinNode = new Node(
				"Voc\u00ea depara com o aumento do odor de carne podre e estrume quando mais se aproxima, no chão havia varias pegadas minusculas que sinalizava um ninho de goblins."
						+ "\nPossivelmente seria melhor fazer algum ataque surpresa ou tentar salvar os possiveis refens que aindas estejam vivos,"
						+ "\no que você vai fazer? [1] Ataque Surpresa | [2] Salvar refens");
		final Node surpriseAttack = new Node(
				"Você se prepara para um ataque repentino contra a gangue de goblin, apos matar os primeiros golbins com sucesso o grande número deles impediram isso de continuar."
						+ "\nDe agora em diante seus restos humanos serão usados como alimentos para as proximas gerações desse ninnho goblin, um final trágico...");
		final Node deathByGoblin = new Node(
				"Você invade o ninho goblin com bastante cautela em busca do armazen por possiveis humanos vivos, ao encontrar o local desejado nota-se que apenas estavam vivas porem bastante machucadas."
						+ "\nVocê não teve muito tempo para refletir sobre isso, pois no momento que estava desamarrando as cordas você sentiu uma dor inimaginavel na cabeça e no mesmo instante desmaiou no chão."
						+ "\nAo acordar você nota o terrivel destino para os seus restos, ser utilizado para os futuros bebês goblins, um final completamente despresivel...");
		final Node mimicNode = new Node(
				"Você atravessa o corredor cheio de escombros para encontrar um unica sala espaçosa, no meio dela havia um bau com aparencia de novo e detalhes de ouro dos lados."
						+ "\nSerá que tem alguma pista ou possivel loots bom dentro dele? Ou deveria analisar melhor meus arredores? Qual decisão você vai escolher?"
						+ "\n[1] Abrir o bau | [2] Analisar os arredores");
		final Node openChestNode = new Node(
				"Apos abrir o bau com brilhos nos olhos você é surpreendido por uma lingua gigantesca te puxando para dentro, era um mimico desde o começo."
						+ "\nEm meio aos terrores de ser digerido vivo por um monstro você nota a quantidade exorbitante de ossos humanos junto com você, seria ele um dos culpados dos sumiços?"
						+ "\nQuem se importa, não que eu possa fazer algo para impedi-lo agora... Será que algum dia algum aventureiro virá derrotar esse monstro por mim?");
		final Node analizeNode = new Node(
				"Apos sua analise delicada e precisa você nota que o bau não era algum comum igual todos os outros, ele era um mimico!"
						+ "\nCom uma espada a postos em fração de segundos, você perfura tal monstro dando fim a ele, em uma analise no interior da fera você nota a quantidade gigante de ossos humanos no intestino dele."
						+ "\nO misterio do desaparecimento dos aventureiros foi finalmente concluido, posso voltar pra guilda e fazer um report dos resultados!");
		rootNode.addChild(forestNode);
		rootNode.addChild(caveNode);
		forestNode.addChild(tigerNode);
		forestNode.addChild(witchNode);
		tigerNode.addChild(tigerDeathNode);
		tigerNode.addChild(deathByTigerNode);
		witchNode.addChild(questionNode);
		witchNode.addChild(attackWitchNode);
		caveNode.addChild(goblinNode);
		caveNode.addChild(mimicNode);
		goblinNode.addChild(surpriseAttack);
		goblinNode.addChild(deathByGoblin);
		mimicNode.addChild(openChestNode);
		mimicNode.addChild(analizeNode);
		return rootNode;
	}
}