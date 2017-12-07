README.TXT

---- Projet Qualité logiciel ----

--Le projet--
Nom: AlmosTetris
type: Jeu
Langage: JAVA
Bibliotèques/Framework: AWT (interface graphique)
Description: Le but du jeu est de faire descendre des blocs sur un plateau de jeu comme dans un Tetris. Cependant ici, on ne cherche pas optimiser l'espace grace aux formes des blocs mais grâce à leur couleurs. Lorsque 3 ou plus blocs d emême couleurs sont cote-à-cote, ils disparaissent; laissant ainsi de la place libre et faisant gagner des points.


--Les patterns--
Nous avons implémenté les trois patterns suivant à notre projet:
-Model View Controller
-Singleton
(-State)

--Choix des patterns--
Nous avons choisi d'implémenter le Model View Controller parce que c'est l'un des design patterns les plus répandus et nous voulions appliquer ce design pattern au langage Java. Pour l'instant nous ne l'avions utilisé uniquement PHP pour le développement d'un site de jeu en ligne. Le pattern MVC nous permet de mieux structurer notre code et il est de plus une composition d'autre patterns (Observer, Strategy). Ce qui nous a paermis de grandement nous familiariser avec les patterns.
Cependant nous avons trouvé que le mvc peut parfois rendre le code plus complexe, bien que plus structuré, surtout sur des projets de grande envergure.

Nous avons implémenté le pattern Singleton à notre projet car il ne peut y avoir qu'une seule instance du board de jeu.
Pour cela nous avons donc rendu privé le constructeur de ce dernier et modifié les appels des méthodes de cette classe pour qu'ils s'effectuent sur l'unique instance du plateau de jeu.

(Après avoir implémenté le design pattern MVC, nous voulions implémenter le pattern State en bonus. Notre idée était de créer les états suivants pour le jeu: Menu, Attente d'un nouveau bloc, Déplacement du bloc, Fin du jeu.
Cependant il était assez difficile de redécouper le code et de gérer la logique du jeu en suivant les states et en utilisant l'architecture MVC.
Le state pattern est très efficace pour des petits projets comme celui présenté ici.)

--L'équipe--
Nous sommes deux à avoir travailler sur ce projet.
Timothé s'est fortement investi dans les recherches sur les différents patterns pendant qu'Adrien identifiait sur quel projet nous pourrions au mieux les implémenter. Une fois les patterns identifiés et le projet choisi, nous avons travaillé ensemble pour identifier les élements à changer et effectuer les modifications.
