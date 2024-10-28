# API REST | Java - Spring Boot

## Introduction

> API REST : 
> - Dans sa forme complète, l'API REST est une interface de programmation d'applications de transfert d'état représentationnel, appelée plus communément service web API REST. Ainsi, lorsqu'un utilisateur effectue une requête via une API RESTful, celle-ci transfère une représentation de l'état des ressources requises au système client. Cela signifie que les développeurs n'ont pas besoin d'installer des bibliothèques ou des logiciels supplémentaires pour tirer parti d'une conception d'API REST.

> Flexibilité / Polyvalence / Indépendance

> Architecture REST :
> - REST est l'abréviation du terme anglais « Representational State Transfer » et le nom d'un style d'architecture créé en 2000 par l'informaticien Roy Fielding. L'architecture REST définit un ensemble de règles visant à créer un service web ou une application. Une API est donc dite « REST » lorsqu'elle répond à des contraintes architecturales, c'est-à-dire à des caractéristiques dont une architecture doit disposer pour correspondre à la conception d'un modèle spécifique.

> Client-serveur / Absence d'état / Mise en cache des ressources / Interface uniforme / Système en couches / Code à la demande

> Spring Boot : 
> - Spring Boot est un framework Java open source utilisé pour programmer des applications Spring autonomes de qualité production avec un ensemble de bibliothèques qui facilitent le démarrage et la gestion des projets.

## Annotations 
> @SpringBootApplication : 
> - Permet de simplifier la configuration de l'application Spring. Cette annotation permet de personnaliser et de modifier les propriétés des applications. Ainsi, les développeurs peuvent personnaliser les applications Web qui correspondent aux exigences du projet.

> @Configuration :
> - Basée sur une classe qui définit une ou plusieurs méthodes de bean dans la classe. Le but d'une classe de configuration est d'indiquer le contexte de l'application, comme le service et d'autres composants de l'application.

> @PathVariable : 
> - Permet de mesurer les paramètres dynamiques de l'URI de la requête et de les mapper aux paramètres de méthode d'un contrôleur. L'annotation permet de développer des services Web RESTful, vous permettant de gérer les paramètres variables.

> @RequestBody : 
> - Indique un paramètre de méthode qui lie le corps de la requête HTTP dans la méthode du contrôleur. Le corps de la requête est mappé lorsque les utilisateurs envoient des requêtes au serveur.

> @Autowired :
> - Est utilisé pour injecter la dépendance d'un bean dans un autre. L'objet géré par Spring est implémenté dans un autre objet qu'une classe doit exécuter.
Ainsi, lorsque vous annotez un champ, une méthode avec @Autowired, Spring Boot injectera automatiquement la dépendance et trouvera le bean qui correspond à ce champ ou paramètre. @Autowired est utilisé pour injecter de trois manières : injection de champ, de setter et de constructeur.

> @RestController :
> - Combine les fonctionnalités des annotations @Respondbody et @Controller. L'annotation facilite la création de points de terminaison RESTful qui renvoient des réponses XML, JSON et d'autres types.

> @Bean :
> - Sont des objets qui peuvent être injectés dans d'autres composants ou d'autres Beans. Elles peuvent également constituer une alternative à la balise XML. Les annotations @Bean sont des singletons, ce qui signifie qu'elles peuvent être créées ou partagées avec l'ensemble du contexte de l'application.
En un mot, les annotations @Bean aident à créer et à gérer des beans dans les applications Spring Boot à l'aide de diverses méthodes.

> @EnableAutoConfiguration :
> - Activez les annotations de configuration automatique pour définir les composants Spring et les configurer automatiquement.

> @Components : 
> - Utilisé pour marquer la classe Java dans les applications Spring. Le conteneur Spring IoC gère les annotations des composants et est responsable du cycle de vie des composants, comme leur initialisation, leur création ou leur destruction.
Par conséquent, les composants peuvent représenter n'importe quel objet de l'application, y compris les services et les contrôleurs. De plus, lorsque la classe Java a marqué l'annotation @Component, Spring Boot a détecté les composants à l'aide du classpath.

> @Repository : 
> - Utilisée pour interagir avec différentes bases de données, telles que les bases de données NoSQL et les bases de données relationnelles. De plus, lorsqu'une classe Java est marquée avec l'annotation @Repository, Spring Boot crée et ajoute automatiquement le contexte requis.

## Bonnes pratiques

> Utilisez @RequestMapping au lieu de @GetMapping
> - @GetMapping et @PostMapping sont des annotations de méthodes HTTP spécifiques qui nécessitent davantage de requêtes. Cependant, l'utilisation de @RequestMapping sera plus utile lorsque vous gérerez plusieurs méthodes HTTP pour la même URL.

> Évitez les annotations inutiles avec parcimonie
> - Comme il existe de nombreuses annotations, il est essentiel d'utiliser les annotations SpringBoot requises et nécessaires. En effet, une utilisation excessive des annotations rendra votre code plus difficile à lire et à maintenir.

> Implémentez @ConditionalOnProperty pour des conditions simples
> - Pour des applications efficaces utilisant Spring, l'utilisation de @ConditionalOnProperty activera ou désactivera les configurations en fonction de la valeur de la propriété. Cela rendra votre travail gérable et configurera vos applications en fonction de facteurs externes.

> Intégrer les tests avec ComponentScan
> - L'utilisation de @ComponentScan dans les tests d'intégration permet de tirer parti de puissantes annotations. En outre, cela garantit que votre test s'exécute avec précision en fonction du comportement de votre application et reflète les problèmes potentiels qui peuvent apparaître pendant l'exécution.

> Utilisez @ControllerAdvice pour la gestion globale des exceptions
> - @ControllerAdvice vous permet de définir des handles d'attente globaux qui seront implémentés sur tous les contrôleurs des applications Spring. Il permet de résoudre ce problème en fournissant des messages précis et cohérents aux applications Spring Boot.
